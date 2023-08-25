package HW2.Factory.concreteProducts;

import HW2.Factory.products.GameItem;

/**
 * Класс предмета Платина.
 */
public class PlatinumReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Открыт предмет: Платина");
    }
}