package by.training.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface Derby
{
}
