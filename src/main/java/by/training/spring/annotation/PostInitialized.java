package by.training.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Target(value= ElementType.METHOD)
public @interface PostInitialized
{
}
