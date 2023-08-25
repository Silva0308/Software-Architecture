package HW2.Factory.concreteCreators;

import HW2.Factory.concreteProducts.GoldReward;
import HW2.Factory.creator.ItemCreator;
import HW2.Factory.products.GameItem;

/**
 * Класс-создатель для предмета Золото.
 */
public class GoldCreator extends ItemCreator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }}
