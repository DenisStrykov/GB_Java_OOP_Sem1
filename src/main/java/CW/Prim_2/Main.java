package CW.Prim_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Сникерс", 100.0));
        machine.addProduct(new Product("Вода 0,5Л", 150.0));
        machine.addProduct(new Product("Вода 1Л", 200.0));
        machine.addProduct(new Product("Венская вафля", 300.0));


        System.out.println(machine.getProductByName("Вода"));
        System.out.println(machine.getProductByPrice(150.0));

    }

}
