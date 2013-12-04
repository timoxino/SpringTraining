package by.training.spring.postprocessor;

import by.training.spring.annotation.MyDeprecated;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

import java.lang.annotation.Annotation;

/**
 * @author Tsimafei_Shchytkavets
 */
public class DeprecatedReplacerBeanFactoryPostProcessor implements BeanFactoryPostProcessor
{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException
    {
        final String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames)
        {
            final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition)configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            final String originalClassName = beanDefinition.getBeanClassName();
            try
            {
                final Class<?> originalClass = Class.forName(originalClassName);
                final MyDeprecated annotation = originalClass.getAnnotation(MyDeprecated.class);
                if (annotation != null)
                {
                    final Class newClass = annotation.newClass();
                    beanDefinition.setBeanClass(newClass);
                }
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }
}
