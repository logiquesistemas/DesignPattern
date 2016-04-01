package br.com.logique.padroes.singleton;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class BasicBusiness {

    void doSomething(){
        BasicConfig config = BasicConfig.getInstance();
        System.out.println("Instance config: "+config);
        config.printConfigs();
    }

}
