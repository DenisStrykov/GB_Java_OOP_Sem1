package CW.Prim_4;

public class Choco extends Product{

    private Integer sugar;
    public Choco(String name, Double cost) {
        super(name, cost);
    }

    public Choco(String name, Double cost, Integer sugar) {
        super(name, cost);
        this.sugar = sugar;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }
}
