package CW.Prim_4;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new BottleOfWater("Вода 0,5Л", 100.0, 0.5));
        vendingMachine.addProduct(new BottleOfWater("Вода 1Л", 140.0, 1.0));
        vendingMachine.addProduct(new Choco("Сникерс", 80.0, 8));
        vendingMachine.addProduct(new Choco("Марс", 85.0, 10));
        vendingMachine.addProduct(new Choco("Натс", 100.0, 15));


        System.out.println("Продукты с названием " + '\"' + " Вода " + '\"' + " => "
                + vendingMachine.getProductByName("Вода"));
        System.out.println();
        System.out.println("Продукты с ценой " + '\"' + " 100р " + '\"' + " => "
                + vendingMachine.getProductByPrice(100.0));

    }

}
