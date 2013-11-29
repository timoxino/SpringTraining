package by.training.spring.service;

import java.util.List;

/**
 * @author Tsimafei_Shchytkavets
 */
public class TerminatorQuoter implements Quoter
{
    private List<String> messages;

    @Override
    public void sayQuote()
    {
        for (String message : messages)
        {
            System.out.println(message);
        }
    }

    public List<String> getMessages()
    {
        return messages;
    }

    public void setMessages(List<String> messages)
    {
        this.messages = messages;
    }
}
