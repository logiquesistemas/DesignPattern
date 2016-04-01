package br.com.logique.padroes.decorator;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Gustavo on 01/04/2016.
 */
public interface Dao<T> {

    T getById(int id) throws URISyntaxException, IOException;

}
