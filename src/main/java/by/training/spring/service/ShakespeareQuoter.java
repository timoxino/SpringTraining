package by.training.spring.service;

import by.training.spring.annotation.Benchmark;

/**
 * @author Tsimafei_Shchytkavets
 */
@Benchmark
public class ShakespeareQuoter implements Quoter
{
    private String message;

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
