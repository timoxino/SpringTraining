package by.training.spring.validation;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Tsimafei_Shchytkavets
 */
public class Driver
{
    private String name;

    @NotNull
    private Long id;

    @Min(value = 18, message = "To young to be a driver")
    @Max(value = 110, message = "To old to be a driver")
    private int age;

    @AssertFalse
    private boolean drink;

    public Driver()
    {
    }

    public Driver(Long id, int age, boolean drink)
    {
        this.id = id;
        this.age = age;
        this.drink = drink;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isDrink()
    {
        return drink;
    }

    public void setDrink(boolean drink)
    {
        this.drink = drink;
    }
}
