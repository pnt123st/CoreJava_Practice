package oop;

/**
 Interface:
 Interface is just prototype. Un implemented methods that mean
 methods without its body. A class needs to be implemented that.
 */
public interface House {

    public void livingRoom();

    public void diningRoom();

    public void kitchenRoom();
    public void bedRoom();

    abstract void studyRoom();

    private void storeRoom(){
        System.out.println("It is to store unused items");
    };
    public void childrenRoom();
}
