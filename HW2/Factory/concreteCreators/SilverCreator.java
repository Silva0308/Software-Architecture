package HW2.Factory.concreteCreators;

import HW2.Factory.concreteProducts.SilverReward;
import HW2.Factory.creator.ItemCreator;
import HW2.Factory.products.GameItem;

/**
 * Класс-создатель для предмета Серебро.
 */
public class SilverCreator extends ItemCreator {
    @Override
    public GameItem createItem() {
        return new SilverReward();
    }
}