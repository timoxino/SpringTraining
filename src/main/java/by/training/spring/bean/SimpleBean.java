package by.training.spring.bean;

import by.training.spring.annotation.RunThisMethod;
import by.training.spring.exception.DbRuntimeException;

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

    public void throwException()
    {
        throw new DbRuntimeException();
    }
}
