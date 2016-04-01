package br.com.logique.padroes.nullobject;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class Programmer extends AbstractEmployee{

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
