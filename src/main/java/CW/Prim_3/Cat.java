package CW.Prim_3;

public class Cat extends CatMover implements CatInterface {

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кот '" + name + '\'' +
                ", ему " + age;
    }

    @Override
    public void sayMeow() {
        System.out.println(name +  " говорит: " + '\"' + " Мяу " + '\"' + " Это Абстракция");
    }


    @Override
    public void sayMeowWithInterface() {
        System.out.println(name +  " говорит: " + '\"' + " Мяу " + '\"' + " Это Интерфейс");
    }
}
