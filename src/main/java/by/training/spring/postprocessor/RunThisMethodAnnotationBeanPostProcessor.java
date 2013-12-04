package by.training.spring.postprocessor;

import by.training.spring.annotation.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Tsimafei_Shchytkavets
 */
public class RunThisMethodAnnotationBeanPostProcessor implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object instance, String beanName) throws BeansException
    {
        final Method method = instance.getClass().getMethods()[0];
        if (method.isAnnotationPresent(RunThisMethod.class))
        {
            final RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            final int repeat = annotation.repeat();
            for (int i = 0; i < repeat; i++)
            {
                try
                {
                    method.invoke(instance);
                }
                catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                catch (InvocationTargetException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return instance;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException
    {
        return o;
    }
}
