package by.training.spring.service;

import by.training.spring.annotation.Benchmark;
import by.training.spring.annotation.BenchmarkMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Tsimafei_Shchytkavets
 */
@Benchmark
@Component
public class ShakespeareQuoter implements Quoter
{
    @Value("${shakespeareQuote}")
    private String message;

    @BenchmarkMethod
    @Override
    public void sayQuote()
    {
        System.out.println(message);
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
