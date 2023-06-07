package dev.lpa.MyTestCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Category implements Grocery {

    private final String name;
    private final String trademark;

    private double price;

    private static int quantity = 0;
    private long barCode;


    public Category(String name, String trademark, double price) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        quantity++;

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm0000");
        String formattedDateTime = currentDateTime.format(formatter);
        long productionTime = Long.parseLong(formattedDateTime);
        barCode = productionTime + quantity;
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

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public long getBarCode() {
        return barCode;
    }

}
