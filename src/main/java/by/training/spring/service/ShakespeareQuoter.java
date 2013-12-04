package by.training.spring.service;

import by.training.spring.annotation.Benchmark;
import by.training.spring.annotation.BenchmarkMethod;

/**
 * @author Tsimafei_Shchytkavets
 */
@Benchmark
public class ShakespeareQuoter implements Quoter
{
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
