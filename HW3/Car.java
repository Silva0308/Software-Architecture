package HW3;

import java.awt.*;

/*
*Абстрактная машина
*/
public abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int wheels;
    private TypeFuel fuelType;
    private TypeGearBox transmissionType;
    private float engineCapacity;

    public Car(String brand, String model) {//простой конструктор
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, Color color, TypeCar frameType, int wheels, TypeFuel fuelType, TypeGearBox transmissionType, float engineCapacity) {//полный конструктор
        this(brand,model);
        this.color = color;
        this.bodyType = frameType;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TypeGearBox transmissionType) {
        this.transmissionType = transmissionType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void move() {//метод движения
        System.out.println("the car is moving...");
    }

    public void maintenance() {//обслуживание
        System.out.println("the car is serviced...");
    }

    public void gearShift() {//переключение коробки передач
        System.out.println("gear is shifting...");
    }

    public void turnOnLight() {//вклбчение фар
        System.out.println(" lights on...");
    }

    public void turnOnWipers() {//метод дворников
        System.out.println("wipers on...");
    }


}