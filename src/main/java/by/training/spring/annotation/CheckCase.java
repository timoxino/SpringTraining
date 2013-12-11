package by.training.spring.annotation;

import by.training.spring.validation.CheckCaseValidations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckCaseValidations.class)
public @interface CheckCase
{
    CaseType value();

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
