package by.training.spring.factory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import by.training.spring.annotation.RunThisMethod;

/**
 * @author Tsimafei_Shchytkavets
 */
public class ObjectFactory
{
    public static <T> T createObject(Class<T> classObject) throws IllegalAccessException, InstantiationException, InvocationTargetException
    {
        final T instance = classObject.newInstance();
        final Method method = classObject.getMethods()[0];
        if (method.isAnnotationPresent(RunThisMethod.class))
        {
            final RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            final int repeat = annotation.repeat();
            for (int i = 0; i < repeat; i++)
            {
                method.invoke(instance);
            }
        }
        return instance;
    }
}
