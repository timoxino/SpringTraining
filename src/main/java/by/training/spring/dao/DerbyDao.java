package by.training.spring.dao;

import by.training.spring.annotation.DB;
import by.training.spring.annotation.DbType;
import by.training.spring.annotation.Derby;
import by.training.spring.bean.SimpleBean;
import by.training.spring.exception.DbRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Tsimafei_Shchytkavets
 */
@DB(DbType.DERBY)
public class DerbyDao implements Dao
{
    @Autowired
    SimpleBean simpleBean;

    @Override
    public void crud()
    {
        System.out.println("DERBY");
        try
        {
            simpleBean.throwException();

        }
        catch (DbRuntimeException e)
        {
        }
    }
}
