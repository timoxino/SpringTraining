package by.training.spring.service;

import java.util.List;

/**
 * @author Tsimafei_Shchytkavets
 */
public class TalkingRobotImpl implements TalkingRobot
{
    List<Quoter> quoters;

    @Override
    public void talk()
    {
        for (Quoter quoter : quoters)
        {
            quoter.sayQuote();
        }
    }

    public List<Quoter> getQuoters()
    {
        return quoters;
    }

    public void setQuoters(List<Quoter> quoters)
    {
        this.quoters = quoters;
    }
}
