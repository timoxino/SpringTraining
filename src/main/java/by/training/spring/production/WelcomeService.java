package by.training.spring.production;

import org.springframework.stereotype.Service;

/**
 * @author Tsimafei_Shchytkavets
 */
@Service("1")
public class WelcomeService implements DeliveryService
{
    @Override
    public void deliverDocument()
    {
        System.out.println("WELCOME");
    }
}
