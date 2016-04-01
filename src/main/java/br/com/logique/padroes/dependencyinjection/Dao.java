package br.com.logique.padroes.dependencyinjection;

/**
 * Created by Gustavo on 01/04/2016.
 */
public interface Dao<T> {

    void save(T entidade);

}
