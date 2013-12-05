package by.training.spring.dao;

import by.training.spring.annotation.Oracle;

/**
 * @author Tsimafei_Shchytkavets
 */
@Oracle
public class OracleDao implements Dao
{
    @Override
    public void crud()
    {
        System.out.println("ORACLE");
    }
}
