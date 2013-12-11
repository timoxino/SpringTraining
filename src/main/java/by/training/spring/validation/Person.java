package by.training.spring.validation;

import by.training.spring.annotation.CaseType;
import by.training.spring.annotation.CheckCase;
import by.training.spring.annotation.ValidCredential;
import by.training.spring.bean.Login;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Person
{
    @CheckCase(value = CaseType.UPPER_CASE, message = "person name should be in upper case")
    private String name;

    @ValidCredential(message = "invalid length")
    private Login login;

    public Person()
    {
    }

    public void setLogin(Login login)
    {
        this.login = login;
    }

    public Person(String name)
    {
        this.name = name;
    }
}
