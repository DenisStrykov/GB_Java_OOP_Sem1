package HW;

import HW.Products.HotBeverage;
import HW.VendingMachineOfHotBeverage.VendingMachineOfHotBeverage;

public class Main {

    public static void main(String[] args) {

        VendingMachineOfHotBeverage machineOfHotBeverage = new VendingMachineOfHotBeverage();
        machineOfHotBeverage.addProduct(new HotBeverage("Горячий шоколад", 150.0, 80));
        machineOfHotBeverage.addProduct(new HotBeverage("Латте", 200.0, 60));
        machineOfHotBeverage.addProduct(new HotBeverage("Какао", 130.0, 75));
        machineOfHotBeverage.addProduct(new HotBeverage("Черный чай", 90.0, 90));


        System.out.println(machineOfHotBeverage.getProduct("Какао"));
        System.out.println("_________________");
        System.out.println(machineOfHotBeverage.getProduct("Латте", 60));
        System.out.println("_________________");
        System.out.println(machineOfHotBeverage);

    }

}
