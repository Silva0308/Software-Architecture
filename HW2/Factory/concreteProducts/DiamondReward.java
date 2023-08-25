package HW2.Factory.concreteProducts;

import HW2.Factory.products.GameItem;

/**
 * Класс предмета Алмаз.
 */
public class DiamondReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Открыт предмет: Алмаз");
    }
}