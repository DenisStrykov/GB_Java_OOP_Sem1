package HW.Products;

import HW.Product.Product;

import java.util.Objects;

public class HotBeverage extends Product {

    private Integer temperature;



    public HotBeverage(String name, Double cost) {
        super(name, cost);
    }



    public HotBeverage(String name, Double cost, Integer temperature) {
        super(name, cost);
        this.temperature = temperature;
    }


    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "Горячий напиток { " +
                "'" + super.getName() + '\'' +
                " с температурой " + temperature + " градусов " +
                ", цена: " + super.getCost() +
                "р } ";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotBeverage that = (HotBeverage) o;
        return Objects.equals(temperature, that.temperature);
    }

}
