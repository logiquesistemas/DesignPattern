package br.com.logique.padroes.singleton;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class BasicConfig {

    private static BasicConfig instance = new BasicConfig();

    public static BasicConfig getInstance() {
        return instance;
    }

    // Construtor privado!
    private BasicConfig() {
    }

    public void printConfigs(){
        System.out.println("Printing configs");
    }


}

