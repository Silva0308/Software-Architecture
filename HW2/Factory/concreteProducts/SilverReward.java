package HW2.Factory.concreteProducts;

import HW2.Factory.products.GameItem;

/**
 * Класс предмета Серебро.
 */
public class SilverReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Открыт предмет: Серебро");
    }
}