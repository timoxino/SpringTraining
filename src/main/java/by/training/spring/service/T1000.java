package by.training.spring.service;

import by.training.spring.annotation.PostInitialized;
import org.springframework.stereotype.Component;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
public class T1000 extends TerminatorQuoter
{
    @Override
    @PostInitialized
    public void sayQuote()
    {
        System.out.println("I'm new T1000");
        super.sayQuote();
    }
}
