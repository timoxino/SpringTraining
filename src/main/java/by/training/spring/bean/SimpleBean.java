package by.training.spring.bean;

import by.training.spring.annotation.RunThisMethod;

/**
 * @author Tsimafei_Shchytkavets
 */
public class SimpleBean
{
    @RunThisMethod(repeat = 5)
    public void runnableMethod()
    {
        System.out.println("I'm running");
    }

    public String returnValue()
    {
        return "Returned value";
    }
}
