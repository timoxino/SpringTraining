package by.training.spring.color;

import org.springframework.beans.factory.FactoryBean;

import java.awt.*;
import java.util.Random;

/**
 * @author Tsimafei_Shchytkavets
 */
public class ColorFactory implements FactoryBean<Color>
{
    @Override
    public Color getObject() throws Exception
    {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Override
    public Class<?> getObjectType()
    {
        return Color.class;
    }

    @Override
    public boolean isSingleton()
    {
        return false;
    }
}
