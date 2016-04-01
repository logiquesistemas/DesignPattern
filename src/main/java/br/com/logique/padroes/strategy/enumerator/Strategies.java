package br.com.logique.padroes.strategy.enumerator;

import br.com.logique.padroes.strategy.Strategy;
import br.com.logique.padroes.strategy.StrategyA;
import br.com.logique.padroes.strategy.StrategyB;

/**
 * Created by Gustavo on 01/04/2016.
 */
public enum Strategies {

    CALC_A(StrategyA.class), CALC_B(StrategyB.class);

    private final Class<? extends Strategy> clazz;

    Strategies(Class<? extends Strategy> clazz) {
        this.clazz = clazz;
    }

    public Strategy getStrategy() throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
