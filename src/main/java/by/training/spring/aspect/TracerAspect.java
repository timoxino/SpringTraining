package by.training.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
@Aspect
public class TracerAspect
{
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
}
