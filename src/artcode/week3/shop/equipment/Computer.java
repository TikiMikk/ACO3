package artcode.week3.shop.equipment;

import artcode.week3.shop.Equipment;

public class Computer extends Equipment {

    public Computer(String model, int price) {
        super(model, price);
    }

    public void test(){
        System.out.println("Test Computer...");
    }

}
