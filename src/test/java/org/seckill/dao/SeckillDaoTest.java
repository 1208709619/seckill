package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    @Resource
    private SeckillDao seckillDao;


    @Test
    public void testReduceNumber() {
    long id=1000L;
    Seckill  seckill =seckillDao.queryById(id);
    System.out.println(seckill.getName());
    System.out.println(seckill);
    }

    @Test
    public void testQueryById() {



    }

    @Test
    public void testQueryAll() {



    }
}