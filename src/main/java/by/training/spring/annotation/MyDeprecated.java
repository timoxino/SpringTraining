package by.training.spring.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
public @interface MyDeprecated
{
    Class newClass();
}
