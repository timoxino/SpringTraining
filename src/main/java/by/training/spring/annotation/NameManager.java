package by.training.spring.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;

import by.training.spring.validation.CheckCaseValidations;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Size(min = 5, max = 10, message = "incorrect name length")
@CheckCase(value = CaseType.UPPER_CASE, message = "name should be in upper case")
public @interface NameManager
{
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
