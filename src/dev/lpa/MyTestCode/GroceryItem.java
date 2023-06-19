package dev.lpa.MyTestCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryItem implements Product {

    private final String name;
    private final String trademark;
    private double price;
    private BarCode barCode;


    public GroceryItem(String name, String trademark, double price) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.barCode = new BarCode();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTrademark() {
        return trademark;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public BarCode getBarCode() {
        return barCode;
    }

    class BarCode {

        private final long code;
        private static int quantity = 0;

        private BarCode() {
            quantity++;
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
            String formattedDateTime = currentDateTime.format(formatter);
            this.code = Long.parseLong(formattedDateTime + String.format("%06d", quantity));
        }

        @Override
        public String toString() {
            return String.valueOf(code);
        }
    }
}
