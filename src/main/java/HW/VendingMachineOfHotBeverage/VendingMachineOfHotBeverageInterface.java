package HW.VendingMachineOfHotBeverage;

import HW.Product.Product;
import HW.Products.HotBeverage;

public interface VendingMachineOfHotBeverageInterface {
    /**
     * Метод выдает продукт в соответствии с запрошенным именем
     *
     * @param name : Имя продукта типа String
     * @return : Искомый товары
     */
    Product getProduct(String name);

    /**
     * Метод выдает продукт в соответствии с запрошенным именем и температурой
     *
     * @param name : Имя продукта типа String
     * @param temperature : Температура продукта типа Integer
     * @return : Искомый товары
     */
    HotBeverage getProduct(String name, Integer temperature);

}
