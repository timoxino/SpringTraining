package by.training.spring.validation;

import by.training.spring.annotation.CaseType;
import by.training.spring.annotation.CheckCase;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Person
{
    @CheckCase(value = CaseType.UPPER_CASE, message = "person name should be in upper case")
    private String name;

    public Person()
    {
    }

    public Person(String name)
    {
        this.name = name;
    }
}
