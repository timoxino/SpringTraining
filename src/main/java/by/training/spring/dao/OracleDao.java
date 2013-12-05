package by.training.spring.dao;

import by.training.spring.annotation.DB;
import by.training.spring.annotation.DbType;
import by.training.spring.annotation.Oracle;

/**
 * @author Tsimafei_Shchytkavets
 */
@DB(DbType.ORACLE)
public class OracleDao implements Dao
{
    @Override
    public void crud()
    {
        System.out.println("ORACLE");
    }
}
