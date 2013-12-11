package by.training.spring.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
public class DriverValidator
{
    @Autowired
    Validator validator;

    public void validate(Driver driver)
    {
        final Set<ConstraintViolation<Driver>> constraintViolations = validator.validate(driver);
        for (ConstraintViolation violation : constraintViolations)
        {
            System.out.println(violation.getMessage());
        }
    }
}
