package br.com.logique.padroes.decorator;

import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class Car {

    private int id;

    private String name;

    private String color;

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", name)
                .append("color", color)
                .toString();
    }
}
