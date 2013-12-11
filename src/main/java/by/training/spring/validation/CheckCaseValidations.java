package by.training.spring.validation;

import by.training.spring.annotation.CaseType;
import by.training.spring.annotation.CheckCase;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tsimafei_Shchytkavets
 */
public class CheckCaseValidations implements ConstraintValidator<CheckCase, String>
{
    private CaseType caseType;

    // invoked one time per class that uses this annotation to store class state and compare with instance in convenient way
    @Override
    public void initialize(CheckCase checkCase)
    {
        caseType = checkCase.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext)
    {
        if (caseType == caseType.UPPER_CASE)
        {
            return s.equals(s.toUpperCase());
        }
        else
        {
            return s.equals(s.toLowerCase());
        }
    }
}
