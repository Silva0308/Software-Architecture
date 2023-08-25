package HW2.Factory.concreteCreators;

import HW2.Factory.concreteProducts.DiamondReward;
import HW2.Factory.creator.ItemCreator;
import HW2.Factory.products.GameItem;

/**
 * Класс-создатель для предмета Алмаз.
 */
public class DiamondCreator extends ItemCreator {
    @Override
    public GameItem createItem() {
        return new DiamondReward();
    }
}