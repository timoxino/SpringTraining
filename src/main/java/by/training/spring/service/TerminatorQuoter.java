package by.training.spring.service;

import by.training.spring.annotation.MyDeprecated;

import java.util.List;

/**
 * @author Tsimafei_Shchytkavets
 */
@MyDeprecated(newClass = T1000.class)
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
