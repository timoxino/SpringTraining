package by.training.spring.service;

import by.training.spring.annotation.DB;
import by.training.spring.annotation.DbType;
import by.training.spring.annotation.Derby;
import by.training.spring.annotation.Oracle;
import by.training.spring.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Tsimafei_Shchytkavets
 */
@Service
public class ServiceImpl implements DbService
{
    @DB(DbType.DERBY)
    private Dao dao;

    @PostConstruct
    @Override
    public void doWork()
    {
        System.out.println("SERVICE");
        dao.crud();
    }
}
