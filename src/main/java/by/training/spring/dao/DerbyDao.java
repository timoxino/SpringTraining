package by.training.spring.dao;

import by.training.spring.annotation.DB;
import by.training.spring.annotation.DbType;
import by.training.spring.annotation.Derby;

/**
 * @author Tsimafei_Shchytkavets
 */
@DB(DbType.DERBY)
public class DerbyDao implements Dao
{
    @Override
    public void crud()
    {
        System.out.println("DERBY");
    }
}
