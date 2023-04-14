package CW.Prim_4;

import java.util.ArrayList;

public class VendingMachine implements VendingMachineInterface {

    private final ArrayList<Product> list;


    public VendingMachine() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        list.add(item);
    }

    @Override
    public ArrayList getProductByName(String searchName) {

        ArrayList<Product> result = new ArrayList<>();
        for (Product item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProductByPrice(Double searchPrice) {

        ArrayList<Product> result = new ArrayList<>();
        for (Product item : list) {
            if (item.getCost().equals(searchPrice)) {
                result.add(item);
            }
        }
        return result;
    }

}
