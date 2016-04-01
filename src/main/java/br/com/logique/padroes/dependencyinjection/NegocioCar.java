package br.com.logique.padroes.dependencyinjection;

import javax.inject.Inject;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class NegocioCar {

    private Dao<Car> carDao;

    @Inject
    public NegocioCar(Dao<Car> carDao) {
        this.carDao = carDao;
    }

    public void salvar(Car car){
        //validando...
        carDao.save(car);
    }


}
