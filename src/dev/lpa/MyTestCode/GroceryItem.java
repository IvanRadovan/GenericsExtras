package dev.lpa.MyTestCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryItem implements Product {

    private final String name;
    private final String trademark;
    private double price;

    private long barCode;
    private static int quantity = 0;


    public GroceryItem(String name, String trademark, double price) {
        quantity++;

        this.name = name;
        this.trademark = trademark;
        this.price = price;

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String formattedDateTime = currentDateTime.format(formatter);
        this.barCode = Long.parseLong(formattedDateTime + String.format("%06d", quantity));
    }


    @Override
    public long getBarCode() {
        return this.barCode;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTrademark() {
        return trademark;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
