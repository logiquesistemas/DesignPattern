package br.com.logique.padroes.strategy.enumerator;

import br.com.logique.padroes.strategy.Strategy;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class ContextStrategy {

    private Strategies strategies;

    public ContextStrategy(Strategies strategies) {
        this.strategies = strategies;
    }

    public void doIt() throws IllegalAccessException, InstantiationException {
        Strategy strategy = strategies.getStrategy();
        System.out.println(strategy.doSomething());
    }

}
