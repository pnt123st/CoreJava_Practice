package oop;

public class TestModernHouse {

    public static void main(String[] args) {

        ModernHouse mh = new ModernHouse();
        mh.livingRoom();
        mh.diningRoom();

/**
 We can't create the object of an interface, but we can create the
 reference of an interface  which can refer to a child class object.
 */
        House house = new ModernHouse();
        house.livingRoom();

        ModernHouse modernHouse = new ModernHouse();
        modernHouse.kitchenRoom();
    }
}
