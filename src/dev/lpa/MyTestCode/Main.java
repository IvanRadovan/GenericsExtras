package dev.lpa.MyTestCode;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        GroceryItem item1 = new GroceryItem("Milk", "l", "Arla", false,7.95, 12.95, 12, "Dairy");
        GroceryItem item2 = new GroceryItem("Milk", "l", "Ica Basic", false, 4.95, 10.95, 12, "Dairy");
        System.out.println(item1.getBarCode());
        System.out.println(item2.getBarCode());

        System.out.println(item1);

        CategoryList dairy = new CategoryList("Dairy");
        System.out.println(dairy.addItem(item1));
        System.out.println(dairy.addItem(item2));
        System.out.println(dairy.addItem(item1));

        Inventory inventory = new Inventory("Ica");
        System.out.println(inventory.addCategory(dairy));
        System.out.println(inventory.addCategory(dairy));










    }
}
