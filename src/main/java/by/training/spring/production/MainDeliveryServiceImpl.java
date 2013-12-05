package by.training.spring.production;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Tsimafei_Shchytkavets
 */
@Service
public class MainDeliveryServiceImpl implements MainDeliveryService
{
    @Autowired
    private Map<String, DeliveryService> map;

    @Override
    public void deliver(int deliveryType)
    {
        map.get(String.valueOf(deliveryType)).deliverDocument();
    }
}
