package by.training.spring;

import by.training.spring.bean.SimpleBean;
import by.training.spring.configuration.MyConfig;
import by.training.spring.factory.ObjectFactory;
import by.training.spring.production.MainDeliveryService;
import by.training.spring.service.Quoter;
import by.training.spring.service.TalkingRobot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Main
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException
    {
        // Using java-based configuration
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        //final SimpleBean simpleBean = context.getBean(SimpleBean.class);
        //simpleBean.returnValue();
        //simpleBean.throwException();
        //new AnnotationConfigApplicationContext("by.training.spring");

        // Smart autowiring in map
        //final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("new-context.xml");
        //final MainDeliveryService bean = classPathXmlApplicationContext.getBean(MainDeliveryService.class);
        //bean.deliver(2);

        // Qualifier example
        //new AnnotationConfigApplicationContext("by.training.spring");

        // Using FactoryBean
        //new ClassPathXmlApplicationContext("color-context.xml");

        // Inject beans and use init method to run
        //new ClassPathXmlApplicationContext("context.xml");

        // Dynamic proxies.
        //final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        //final Quoter shakespeareQuoter = classPathXmlApplicationContext.getBean("shakespeareQuoter", Quoter.class);
        //shakespeareQuoter.sayQuote();

        // Using declared in spring beans
        /*final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        final Quoter shakespeareQuoter = classPathXmlApplicationContext.getBean("shakespeareQuoter", Quoter.class);
        shakespeareQuoter.sayQuote();
        final Quoter terminatorQuoter = classPathXmlApplicationContext.getBean("terminatorQuoter", Quoter.class);
        terminatorQuoter.sayQuote();*/

        // Run annotated methods
        //ObjectFactory.createObject(SimpleBean.class);
    }
}
