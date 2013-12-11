package by.training.spring.validation;

import by.training.spring.annotation.CheckCase;
import by.training.spring.annotation.ValidCredential;
import by.training.spring.bean.Login;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tsimafei_Shchytkavets
 */
public class CredentialValidations implements ConstraintValidator<ValidCredential, Login>
{
    @Override
    public void initialize(ValidCredential validCredential)
    {

    }

    @Override
    public boolean isValid(Login login, ConstraintValidatorContext constraintValidatorContext)
    {
        return login.getName().length() > login.getPassword().length();
    }
}
