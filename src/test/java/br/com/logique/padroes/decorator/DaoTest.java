package br.com.logique.padroes.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class DaoTest {

    @Test
    public void testGetById() throws Exception {

        Dao<Car> carDao = new CarDaoDecorator();
        System.out.println(carDao.getById(1));
        System.out.println(carDao.getById(1));

    }
}