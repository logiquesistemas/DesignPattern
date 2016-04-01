package br.com.logique.padroes.dependencyinjection;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class CarDao implements Dao<Car> {

    @Override
    public void save(Car entidade) {
        System.out.println("saving car");
    }

}
