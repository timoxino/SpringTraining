package by.training.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
@Aspect
public class TracerAspect
{
    @Before("execution(void *.crud())")
    public void traceBefore()
    {
        System.out.println("trace before dao crud operation");
    }

    @After("execution(void *.crud())")
    public void tracAfter()
    {
        System.out.println("trace after dao crud operation");
    }
}
