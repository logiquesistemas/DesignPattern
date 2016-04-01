package br.com.logique.padroes.strategy.basic;

import br.com.logique.padroes.strategy.StrategyA;
import br.com.logique.padroes.strategy.StrategyB;
import org.junit.Test;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class ContextStrategyTest {

    @Test
    public void testDoItStrategyA() throws Exception {
        ContextStrategy contextStrategy = new ContextStrategy(new StrategyA());
        contextStrategy.doIt();
    }

    @Test
    public void testDoItStrategyB() throws Exception {
        ContextStrategy contextStrategy = new ContextStrategy(new StrategyB());
        contextStrategy.doIt();
    }

}