package HW3;

public class Pickup extends Car implements Refuelling, Wiping {

    private int loadCapacity;

    public Pickup(String brand, String model) {
        super(brand, model);
        super.setBodyType(TypeCar.puckup);
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
    }

    @Override
    public void wipHeadlights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

}
