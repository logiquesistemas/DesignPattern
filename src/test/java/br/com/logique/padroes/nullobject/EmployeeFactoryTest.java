package br.com.logique.padroes.nullobject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class EmployeeFactoryTest {

    @Test
    public void testGetEmployee() throws Exception {

        List<AbstractEmployee> employees = new ArrayList<AbstractEmployee>();

        employees.add(EmployeeFactory.getEmployee("Rob"));
        employees.add(EmployeeFactory.getEmployee("Joe"));
        employees.add(EmployeeFactory.getEmployee("Clemilson"));

        for (AbstractEmployee employee : employees) {
            System.out.println(employee.getName());
        }


    }
}