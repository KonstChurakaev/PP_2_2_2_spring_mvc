package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", 2020, 650_000.00));
        carList.add(new Car("BMW", 2010, 1_650_000.00));
        carList.add(new Car("Opel", 2015, 900_000.00));
        carList.add(new Car("Mazda", 2018, 1_200_000.00));
        carList.add(new Car("KIA", 2022, 1_500_000.00));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count > 0) {
            return carList.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        return null;
    }
}
