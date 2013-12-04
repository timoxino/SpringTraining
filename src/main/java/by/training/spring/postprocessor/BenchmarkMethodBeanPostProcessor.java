package by.training.spring.postprocessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import by.training.spring.annotation.BenchmarkMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

import by.training.spring.annotation.Benchmark;

/**
 * @author Tsimafei_Shchytkavets
 */
public class BenchmarkMethodBeanPostProcessor implements BeanPostProcessor
{
    // Alternative way is using this factory
    // @Autowired
    // DefaultListableBeanFactory factory;
    private Map<String, Class> map = new HashMap<String, Class>();

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException
    {
        // store original class metadata
        final Class<?> originalClass = o.getClass();
        if (originalClass.isAnnotationPresent(Benchmark.class))
        {
            map.put(s, originalClass);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException
    {
        Class<?> clazz = o.getClass();
        final Class originalClass = map.get(s);
        // restore original class metadata
        if (originalClass != null)
        {
            clazz = originalClass;
        }
        final Method[] methods = clazz.getMethods();
        boolean benchmarkFound = false;
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(BenchmarkMethod.class))
            {
                benchmarkFound = true;
                break;
            }
        }
        if (benchmarkFound)
        {
            final Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
                    new InvocationHandler()
                    {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                        {
                            // use method's annotation from object (not interface)
                            final Method originalClassMerhod = originalClass.getMethod(method.getName(), method.getParameterTypes());
                            if (originalClassMerhod.isAnnotationPresent(BenchmarkMethod.class))
                            {
                                final long before = System.nanoTime();
                                final Object methodNew = method.invoke(o, args);
                                final long after = System.nanoTime();
                                System.out.println(after - before + " Method benchmarking");
                                return methodNew;
                            }
                            else
                            {
                                return method.invoke(o, args);
                            }
                        }
                    });
            return proxy;
        }
        return o;
    }
}
