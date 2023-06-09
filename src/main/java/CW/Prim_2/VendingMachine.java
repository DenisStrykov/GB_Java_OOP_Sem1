package CW.Prim_2;

import java.util.ArrayList;

public class VendingMachine {

    private final ArrayList<Product> list;

    public VendingMachine() {
        this.list = new ArrayList<>();
    }

    public void addProduct (Product newItem) {

        list.add(newItem);
    }

    public ArrayList getProductByName (String searchName) {

        ArrayList<Product> result = new ArrayList<>();
        for(Product item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProductByPrice(Double searchPrice) {

        ArrayList<Product> result = new ArrayList<>();
        for(Product item : list) {
            if (item.getCost().equals(searchPrice)) {
                result.add(item);
            }
        }
        return result;
    }

}
