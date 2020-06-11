package artcode.week3.shop;

import artcode.week3.shop.equipment.Computer;
import artcode.week3.shop.equipment.Fridge;
import artcode.week3.shop.equipment.Phone;

public class EquipmentsMap {

    private Equipment[] equipments = new Equipment[9];
    private int cash = 0;
    private int count = 9;

    public EquipmentsMap() {

        equipments[0] = new Computer("Asus",40000);
        equipments[1] = new Computer("Apple Macintosh",4000);
        equipments[2] = new Computer("Samsung",25000);
        equipments[3] = new Phone("Apple X",20000);
        equipments[4] = new Phone("Nokia",4000);
        equipments[5] = new Phone("Xiaomi",4000);
        equipments[6] = new Fridge("Atlant",20000);
        equipments[7] = new Fridge("Saturn",15000);
        equipments[8] = new Fridge("Vestfrost",14000);
    }

    public void addNewEquipment(String equipmentCategory, String equipmentModel, int price){

        Equipment equipment = null;

        if (equipmentCategory.equalsIgnoreCase("computers")){
            equipment = new Computer(equipmentModel, price);
        } else if (equipmentCategory.equalsIgnoreCase("fridges")) {
            equipment = new Fridge(equipmentModel,price);
        } else if (equipmentCategory.equalsIgnoreCase("phones")){
            equipment = new Phone(equipmentModel,price);
        }

        if (equipment == null) {
            System.out.println("We don`t have this equipment");

        }  else if (count < this.equipments.length){
            this.equipments[count] = equipment;
            count++;

        } else {
            incrementEquipments(equipment);
        }

    }

    public void sellEquipment(String equipmentModel) {

        for (int i = 0; i < count; i++) {
            if (equipments[i].getModel().equalsIgnoreCase(equipmentModel)){
                cash = equipments[i].getPrice();
                equipments[i] = null;
                count--;
            }
        }

    }


    public void incrementEquipments(Equipment newEquipment){

        Equipment[] moreEquipment = new Equipment[equipments.length * 2];
        for (int i = 0; i < equipments.length ; i++) {
            moreEquipment[i] = equipments[i];
        }
        this.equipments = moreEquipment;
        this.equipments[count] = newEquipment;
        count++;
    }

    private Equipment[] findComputers(){

        Equipment[] computers = new Equipment[count];
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] instanceof Computer){
                computers[i] = equipments[i];
            }
        }
        return computers;
    }

    private Equipment[] findFridges(){

        Equipment[] fridges = new Equipment[count];
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] instanceof Fridge){
                fridges[i] = equipments[i];
            }
        }
        return fridges;
    }

    private Equipment[] findPhones(){

        Equipment[] phones = new Equipment[count];
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] instanceof Fridge){
                phones[i] = equipments[i];
            }
        }
        return phones;
    }

    public void showByEquipmentCategory(String equipmentName){

       if (equipmentName.equalsIgnoreCase("computers")){
           System.out.println('\n' + "*******************************");
           for (int i = 0; i < count; i++) {
               if (findComputers()[i] != null){
                   System.out.println(findComputers()[i]);
               }
           }
           System.out.println("*******************************"+ '\n');

       } else if (equipmentName.equalsIgnoreCase("fridges")){
           System.out.println('\n' + "*******************************");
           for (int i = 0; i < count; i++) {
               if (findFridges()[i] != null){
                   System.out.println(findFridges()[i]);
               }
           }
           System.out.println("*******************************"+ '\n');

       } else if (equipmentName.equalsIgnoreCase("phones")){
           System.out.println('\n' + "*******************************");
           for (int i = 0; i < count; i++) {
               if (findPhones()[i] != null){
                   System.out.println(findPhones()[i]);
               }
           }
           System.out.println("*******************************"+ '\n');
       }

    }

    public void showAllEquipmentList() {

        System.out.println('\n' + "*******************************");
        Equipment[] equipment = new Equipment[count];

        for (int i = 0; i < count; i++) {
            if (equipments[i] != null) {
                equipment[i] = equipments[i];
                System.out.println(equipment[i]);
            }
        }
        System.out.println("*******************************"+ '\n');
    }

    public int getCash() {
        return cash;
    }

    public void test(String equipmentModel) {

        int count = 0;
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null){
                if (equipments[i].getModel().equalsIgnoreCase(equipmentModel)){
                    equipments[i].test();
                } else {
                    count++;
                }
            }
        }
        if (count == this.count){
            System.out.println("We don`t have this equipment");
        }
    }

}
