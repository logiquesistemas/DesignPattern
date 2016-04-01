package br.com.logique.padroes.decorator;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class CarDao implements Dao<Car> {

    private List<Car> carsList;

    public CarDao() {
        carsList = tryLoadCars();
    }

    public Car getById(int id) throws URISyntaxException, IOException {
        Optional<Car> mycar = carsList.stream().filter(car -> car.getId() == id).findAny();
        return mycar.get();
    }

    private List<Car> tryLoadCars(){
        try {
            return loadCars();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Car> loadCars() throws URISyntaxException, IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        URI resource = classLoader.getResource("cars_repository.csv").toURI();
        List<String> cars = Files.readAllLines(Paths.get(resource));

        List<Car> carsList = new ArrayList();

        for (String car : cars) {
            String[] splited = car.split(";");
            carsList.add(new Car(Integer.valueOf(splited[0]), splited[1], splited[2]));
        }

        return carsList;
    }

}
