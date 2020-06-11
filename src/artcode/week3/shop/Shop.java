package artcode.week3.shop;

public class Shop {

    private EquipmentsMap computersMap = new EquipmentsMap();
    private int cash = 0;

    public void addNewEquipment(String equipmentCategory, String equipmentModel, int price){

        if (price > 0) {
            computersMap.addNewEquipment(equipmentCategory,equipmentModel,price);
        } else {
            System.out.println("Incorrect price");
        }

    }

    public void sellEquipment(String equipmentModel){
        computersMap.sellEquipment(equipmentModel);
        cash += computersMap.getCash();
    }

    public void showAllEquipmentsList(){
        computersMap.showAllEquipmentList();
    }

    public void showEquipmentsByCategory(String categoryEquipment){
        computersMap.showByEquipmentCategory(categoryEquipment);
    }

    public void testEquipment(String equipmentModel){
        computersMap.test(equipmentModel);
    }

}
