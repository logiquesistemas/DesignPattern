package br.com.logique.padroes.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class CarDaoTest {

    @Test
    public void testGetById() throws Exception {
        CarDao carDao = new CarDao();
        carDao.getById(1);
    }
}