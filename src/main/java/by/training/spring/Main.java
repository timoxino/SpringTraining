package by.training.spring;

import by.training.spring.bean.SimpleBean;
import by.training.spring.factory.ObjectFactory;
import by.training.spring.service.Quoter;
import by.training.spring.service.TalkingRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Main
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException
    {
        // Inject beans and use init method to run
        new ClassPathXmlApplicationContext("context.xml");

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
