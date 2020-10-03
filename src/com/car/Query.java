package com.car;

import java.util.ArrayList;
import java.util.List;


public class Query {

    public List<Car> getCarsByBrand(List<Car> cars, Brand brand) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand))
                result.add(car);
        }
        return result;
    }

    public List<Car> getCarsByModelAndTerm(List<Car> cars, String model, int yearTill, int numOfYears) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && yearTill-car.getYearOfOrigin() > numOfYears)
                result.add(car);
        }
        return result;
    }

    public List<Car> getCarsByYearAndPrice(List<Car> cars, int yearOfOrigin, int price) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getYearOfOrigin()==yearOfOrigin && car.getPrice() > price)
                result.add(car);
        }
        return result;
    }
}
