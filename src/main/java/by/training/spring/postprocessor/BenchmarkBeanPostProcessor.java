package by.training.spring.postprocessor;

import by.training.spring.annotation.Benchmark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Tsimafei_Shchytkavets
 */
public class BenchmarkBeanPostProcessor implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException
    {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException
    {
        final Class<?> clazz = o.getClass();
        if (clazz.isAnnotationPresent(Benchmark.class))
        {
            final Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler()
            {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                {
                    final long before = System.nanoTime();
                    final Object methodNew = method.invoke(o, args);
                    final long after = System.nanoTime();
                    System.out.println(after - before);
                    return methodNew;
                }
            });
            return proxy;
        }
        return o;
    }
}
