package HW2.Factory.concreteCreators;

import HW2.Factory.concreteProducts.PlatinumReward;
import HW2.Factory.creator.ItemCreator;
import HW2.Factory.products.GameItem;

/**
 * Класс-создатель для предмета Платина.
 */
public class PlatinumCreator extends ItemCreator {
    @Override
    public GameItem createItem() {
        return new PlatinumReward();
    }
}