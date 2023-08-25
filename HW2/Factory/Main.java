package HW2.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import HW2.Factory.concreteCreators.CopperCreator;
import HW2.Factory.concreteCreators.DiamondCreator;
import HW2.Factory.concreteCreators.GoldCreator;
import HW2.Factory.concreteCreators.PlatinumCreator;
import HW2.Factory.concreteCreators.SilverCreator;
import HW2.Factory.creator.ItemCreator;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<ItemCreator> generatorList = new ArrayList<>(); //создаем лист генераторов предметов
        generatorList.add(new CopperCreator());
        generatorList.add(new DiamondCreator());
        generatorList.add(new GoldCreator());
        generatorList.add(new PlatinumCreator());
        generatorList.add(new SilverCreator());

        int count = 10;

        for (int i = 0; i < count; i++) {
            ItemCreator generator = generatorList.get(random.nextInt(generatorList.size()));
            generator.openReward();
        }
    }
}