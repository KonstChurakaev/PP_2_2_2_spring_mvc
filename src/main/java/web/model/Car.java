package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {

    private String model;
    private int yers;
    private double prise;

    public Car(String model, int yers, double prise) {
        this.model = model;
        this.yers = yers;
        this.prise = prise;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYers() {
        return yers;
    }

    public void setYers(int yers) {
        this.yers = yers;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yers=" + yers +
                ", prise=" + prise +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yers == car.yers && Double.compare(car.prise, prise) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, yers, prise);
    }
}
