package br.com.logique.padroes.dependencyinjection;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class Car {

    private String name;

    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
