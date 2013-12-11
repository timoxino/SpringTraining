package by.training.spring.validation;

import javax.validation.Valid;

/**
 * @author Tsimafei_Shchytkavets
 */
public class DriverService
{
    @Valid
    private Driver driver;

    public DriverService(Driver driver)
    {
        this.driver = driver;
    }
}
