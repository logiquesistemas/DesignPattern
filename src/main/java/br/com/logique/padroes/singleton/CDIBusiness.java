package br.com.logique.padroes.singleton;

import javax.inject.Inject;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class CDIBusiness {

    @Inject
    private CDIConfig cdiConfig;

    void doSomething(){
        System.out.println("Instance config: "+cdiConfig);
        cdiConfig.printConfigs();
    }


}
