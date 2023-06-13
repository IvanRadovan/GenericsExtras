package dev.lpa.MyTestCode;

public class Main {

    public static void main(String[] args) {

        GroceryItem milkArla = new GroceryItem("Milk", "Arla", 12.5);
        GroceryItem milkIca = new GroceryItem("Milk", "Ica", 10.5);
        System.out.println(milkArla.getBarCode());
        System.out.println(milkIca.getBarCode());


    }
}
