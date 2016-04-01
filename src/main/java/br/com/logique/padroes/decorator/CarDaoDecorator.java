package br.com.logique.padroes.decorator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class CarDaoDecorator implements Dao<Car> {

    private Map<Integer,Car> cars = new HashMap<>();
    private Dao<Car> carDao = new CarDao();

    @Override
    public Car getById(int id) throws URISyntaxException, IOException {
        Car car;
        if (cars.containsKey(id)){
            car = cars.get(id);
        }else{
            car = carDao.getById(id);
            atualizarCache(car);
        }
        return car;
    }

    private void atualizarCache(Car car) {
        if (car != null){
            cars.put(car.getId(), car);
        }
    }
}
