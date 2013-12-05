package by.training.spring.production;

import org.springframework.stereotype.Service;

/**
 * @author Tsimafei_Shchytkavets
 */
@Service("2")
public class ByeByeClientService implements DeliveryService
{
    @Override
    public void deliverDocument()
    {
        System.out.println("BYEBYE");
    }
}
