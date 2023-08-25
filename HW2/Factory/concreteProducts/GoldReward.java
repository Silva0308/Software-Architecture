package HW2.Factory.concreteProducts;

import HW2.Factory.products.GameItem;

/**
 * Класс предмета Золото.
 */
public class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Открыт предмет: Золото");
    }
}