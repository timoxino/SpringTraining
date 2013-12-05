package by.training.spring.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author Tsimafei_Shchytkavets
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface Oracle
{
}
