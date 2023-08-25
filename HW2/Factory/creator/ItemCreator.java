package HW2.Factory.creator;

import HW2.Factory.products.GameItem;

/**
 * Абстрактный класc, создающий предметы.
 */
public abstract class ItemCreator {
    /**
     * Метод для открытия награды.
     * Создает предмет с помощью фабричного метода и вызывает его метод открытия.
     */
    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Абстрактный метод для создания игрового предмета.
     */
    public abstract GameItem createItem();
}
