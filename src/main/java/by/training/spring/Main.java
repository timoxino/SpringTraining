package by.training.spring;

import by.training.spring.bean.SimpleBean;
import by.training.spring.factory.ObjectFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Main
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException
    {
        ObjectFactory.createObject(SimpleBean.class);
    }
}
