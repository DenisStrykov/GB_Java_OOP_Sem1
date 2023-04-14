package CW.Prim_3;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 12);
        Cat cat2 = new Cat("Лео", 4);
        BengalCat cat3 = new BengalCat("Бенгаль", 6);

        System.out.println(cat1);
        cat1.sayMeow();
        cat1.sayMeowWithInterface();

        System.out.println("____________________");

        System.out.println(cat2);
        cat2.sayMeow();
        cat2.sayMeowWithInterface();

        System.out.println("____________________");

        System.out.println(cat3);
        cat3.sayMeow();
        cat3.sayMeowWithInterface();

    }

}
