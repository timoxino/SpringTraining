package by.training.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * @author Tsimafei_Shchytkavets
 */
public class DestroyablePrototypeBeanFactoryPostProcessor implements BeanFactoryPostProcessor
{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException
    {
        final String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames)
        {
            final AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition)configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getDestroyMethodName() != null && beanDefinition.isPrototype())
            {
                System.out.println("Prototype with destroy method was found.");
            }
        }
    }
}
