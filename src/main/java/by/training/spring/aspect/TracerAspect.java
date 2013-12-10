package by.training.spring.aspect;

import by.training.spring.annotation.MyDeprecated;
import by.training.spring.exception.DbRuntimeException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
@Aspect
public class TracerAspect
{
    @Value("${support.email}")
    private String[] emails;

    @Pointcut("execution(void *.crud())")
    public void crud() {}

    @Before("crud()")
    public void traceBefore(JoinPoint joinPoint)
    {
        System.out.println("trace before dao crud operation " + joinPoint.getSignature().getName());
    }

    @After("crud()")
    public void tracAfter()
    {
        System.out.println("trace after dao crud operation");
    }

    @AfterReturning(pointcut = "execution(String *.returnValue())", returning = "returnValue")
    public void traceAfterReturning(String returnValue)
    {
        System.out.println("trace after returning, value = " + returnValue);
    }

    @AfterThrowing(pointcut = "execution(* *.throwException())", throwing = "exception")
    public void traceDbRuntimeException(DbRuntimeException exception)
    {
        System.out.println("DbRuntimeException happened ("+ exception.getMessage() +"). Emails were sent to " + emails[0] + ", " + emails[1]);
    }

    @Around("execution((@by.training.spring.annotation.MyDeprecated *) *(..))")
    public Object interceptDeprecated(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        final Object object = proceedingJoinPoint.proceed();
        final MyDeprecated myDeprecated = object.getClass().getAnnotation(MyDeprecated.class);
        final Class newClass1 = myDeprecated.newClass();
        return newClass1.newInstance();
    }
}

