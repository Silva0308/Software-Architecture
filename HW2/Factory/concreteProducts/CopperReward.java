package HW2.Factory.concreteProducts;

import HW2.Factory.products.GameItem;

/**
 * Класс предмета Медь.
 */
public class CopperReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Открыт предмет: Медь");
    }
}