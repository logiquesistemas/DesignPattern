package br.com.logique.padroes.singleton;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Gustavo on 01/04/2016.
 */
@ApplicationScoped
public class CDIConfig {

    public void printConfigs(){
        System.out.println("Printing configs");
    }

}
