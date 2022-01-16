package oop;

/**
 This class has two parents--
 1. House
 2. New House
 */
public class ModernHouse implements House, NewHouse{
    @Override
    public void livingRoom() {
        int window = 4;
        double costOfEachWindow = 299.99;
        double costForWindow = window*costOfEachWindow;
        System.out.println("Expenses of reset window is :" + window*costOfEachWindow);
    }

    @Override
    public void diningRoom() {
        int diningTable = 2000;
        int standLight = 300;
        int dinnerSet = 300;
        int chinaCabinet = 1300;
        int totalExpenses = (diningTable + standLight + dinnerSet + chinaCabinet);
        System.out.println("Expected expenses is about : " + totalExpenses);

    }

    @Override
    public void kitchenRoom() {

    }

    @Override
    public void bedRoom() {

    }

    @Override
    public void studyRoom() {

    }

    @Override
    public void childrenRoom() {

    }

    @Override
    public void solarPowerSystem() {

    }

    @Override
    public void centralCoolingSystem() {

    }

    @Override
    public void centralExhaustSystem() {

    }

    @Override
    public void availableParkingGarage() {

    }
    public void cameraSetup(){

    }
}
