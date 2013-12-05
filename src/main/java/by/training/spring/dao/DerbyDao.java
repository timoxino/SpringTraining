package by.training.spring.dao;

import by.training.spring.annotation.Derby;

/**
 * @author Tsimafei_Shchytkavets
 */
@Derby
public class DerbyDao implements Dao
{
    @Override
    public void crud()
    {
        System.out.println("DERBY");
    }
}
