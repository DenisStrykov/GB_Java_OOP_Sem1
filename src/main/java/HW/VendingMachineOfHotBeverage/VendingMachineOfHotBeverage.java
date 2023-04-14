package HW.VendingMachineOfHotBeverage;

import HW.Product.Product;
import HW.Products.HotBeverage;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineOfHotBeverage implements VendingMachineOfHotBeverageInterface {

    private final List<Product> products;


    public VendingMachineOfHotBeverage() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product item) {
        products.add(item);
    }

    @Override
    public String toString() {
        return "VendingMachineOfHotBeverage{" +
                "products=" + products +
                '}';
    }

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с таким названием %s не найден", name));
    }

    public HotBeverage getProduct(String name, Integer temperature) {

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && ((HotBeverage)product).getTemperature().equals(temperature) ) {
                return (HotBeverage)product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с таким названием %s не найден", name));
    }

}
