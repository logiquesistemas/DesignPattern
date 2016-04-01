package br.com.logique.padroes.strategy.enumerator;

import org.junit.Test;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class ContextStrategyTest {

    @Test
    public void testDoItStrategyA() throws Exception {
        ContextStrategy contextStrategy = new ContextStrategy(Strategies.CALC_A);
        contextStrategy.doIt();
    }

    @Test
    public void testDoItStrategyB() throws Exception {
        ContextStrategy contextStrategy = new ContextStrategy(Strategies.CALC_B);
        contextStrategy.doIt();
    }
}