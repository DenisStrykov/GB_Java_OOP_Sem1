package CW.Prim_4;

import java.util.ArrayList;

public interface VendingMachineInterface {

    /**
     * Метод добавляет новый продукт в аппарат
     *
     * @param item : Вложенные параметры товара
     */
    void addProduct(Product item);

    /**
     * Метод ищет товары по названиям
     *
     * @param searchName : Вложенный параметр типа String, который надо найти
     * @return : Искомые товары тпа ArrayList
     */
    ArrayList getProductByName(String searchName);

    /**
     * Метод ищет товары по цене
     *
     * @param searchPrice : Вложенный параметр типа Double, который надо найти
     * @return : Искомые товары тпа ArrayList
     */
    ArrayList getProductByPrice(Double searchPrice);
}
