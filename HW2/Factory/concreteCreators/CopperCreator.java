package HW2.Factory.concreteCreators;

import HW2.Factory.concreteProducts.CopperReward;
import HW2.Factory.creator.ItemCreator;
import HW2.Factory.products.GameItem;

/**
 * Класс-создатель для предмета Медь.
 */
public class CopperCreator extends ItemCreator {
    @Override
    public GameItem createItem() {
        return new CopperReward();
    }
}