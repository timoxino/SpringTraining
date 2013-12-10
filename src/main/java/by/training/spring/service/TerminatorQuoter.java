package by.training.spring.service;

import by.training.spring.annotation.MyDeprecated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tsimafei_Shchytkavets
 */
@MyDeprecated(newClass = T1000.class)
@Component
public class TerminatorQuoter implements Quoter
{
    private List<String> messages;

    @Override
    public void sayQuote()
    {
        if (messages != null)
        {
            for (String message : messages)
            {
                System.out.println(message);
            }
        }
    }

    public List<String> getMessages()
    {
        return messages;
    }

    @Autowired
    @Value("${terminatorQuotes}")
    public void setMessages(String[] messages)
    {
        this.messages = Arrays.asList(messages);
    }
}
