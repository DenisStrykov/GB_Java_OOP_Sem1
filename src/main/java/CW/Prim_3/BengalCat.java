package CW.Prim_3;

public class BengalCat extends Cat {

    public BengalCat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void sayMeow() {
        System.out.println(super.getName() +  " говорит: " + '\"' + " Мяу " + '\"' + " Это Абстракция, и я бенгальский");
    }

    @Override
    public void sayMeowWithInterface() {
        System.out.println(super.getName() +  " говорит: " + '\"' + " Мяу " + '\"' + " Это Интерфейс, и я бенгальский");
    }
}
