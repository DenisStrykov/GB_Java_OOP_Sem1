package CW.Prim_4;

public class BottleOfWater extends Product{

    private Double volume;

    public BottleOfWater(String name, Double cost) {
        super(name, cost);
    }

    public BottleOfWater(String name, Double cost, Double value) {
        super(name, cost);
        this.volume = value;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
