package dev.lpa.MyTestCode;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        GroceryItem item1 = new GroceryItem("Milk", "l", "Arla", 7.95, 12.95, 12, "Dairy");
        GroceryItem item2 = new GroceryItem("Milk", "l", "Ica Basic", 4.95, 10.95, 12, "Dairy");
        System.out.println(item1.getBarCode());
        System.out.println(item2.getBarCode());

        System.out.println(item1);








    }
}
