package artcode.week3.shop.equipment;

import artcode.week3.shop.Equipment;

public class Fridge extends Equipment {

    public Fridge(String model, int price) {
        super(model, price);
    }

    public void test(){
        System.out.println("Test Fridge...");
    }


}
