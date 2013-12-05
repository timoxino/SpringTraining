package by.training.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Tsimafei_Shchytkavets
 */
//@Component
public class TalkingRobotImpl implements TalkingRobot
{
    @Autowired
    List<Quoter> quoters;

    @PostConstruct
    @Override
    public void talk()
    {
        for (Quoter quoter : quoters)
        {
            quoter.sayQuote();
        }
    }
}
