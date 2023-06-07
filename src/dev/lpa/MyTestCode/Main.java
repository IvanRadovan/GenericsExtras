package dev.lpa.MyTestCode;

public class Main {

    public static void main(String[] args) {

        Dairy milkArla = new Dairy("Milk", "Arla", 12.5);
        Dairy milkIca = new Dairy("Milk", "Ica", 10.5);
        System.out.println(milkArla.getBarCode());
        System.out.println(milkIca.getBarCode());

        System.out.println(milkArla.getQuantity());
    }
}
