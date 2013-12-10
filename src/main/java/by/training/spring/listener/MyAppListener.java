package by.training.spring.listener;

import by.training.spring.annotation.PostInitialized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
public class MyAppListener implements ApplicationListener<ContextRefreshedEvent>
{

    @Autowired
    private ConfigurableListableBeanFactory factory;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        System.out.println("Context refreshed");
        final Collection<Object> beansWithAnnotations = contextRefreshedEvent.getApplicationContext().getBeansOfType(Object.class).values();
        for (Object bean : beansWithAnnotations)
        {
            final Class<?> beanClass = bean.getClass();
            final Method[] methods = beanClass.getMethods();
            for (Method method : methods)
            {
                if (method.isAnnotationPresent(PostInitialized.class))
                {
                    try
                    {
                        method.invoke(bean);
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
        }
    }
}
