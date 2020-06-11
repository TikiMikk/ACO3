package artcode.week3.shop;

public class Test {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.showAllEquipmentsList();
        shop.showEquipmentsByCategory("computers");
        shop.addNewEquipment("computers","Acer",18000);
        shop.sellEquipment("Asus");
        shop.testEquipment("Acer");
    }
}
