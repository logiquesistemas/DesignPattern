package br.com.logique.padroes.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class BasicBusinessTest {

    @Test
    public void testDoSomething() throws Exception {
        BasicBusiness basicBusiness1 = new BasicBusiness();
        basicBusiness1.doSomething();

        BasicBusiness basicBusiness2 = new BasicBusiness();
        basicBusiness2.doSomething();
    }
}