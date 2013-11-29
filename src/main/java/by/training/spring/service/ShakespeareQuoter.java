package by.training.spring.service;

/**
 * @author Tsimafei_Shchytkavets
 */
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
