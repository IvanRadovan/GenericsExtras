package dev.lpa.MyTestCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public class GroceryItem implements Product {

    private final String name;
    private final String unit;
    private final String manufacturer;
    private final boolean organic;
    private final double purchasePrice;
    private double sellingPrice;
    private final int vatRate;
    private final String category;
    private final BarCode barCode;


    public GroceryItem(String name, String unit, String manufacturer, boolean organic, double purchasePrice, double sellingPrice, int vatRate, String category) {
        this.name = name;
        this.unit = unit;
        this.manufacturer = manufacturer;
        this.organic = organic;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.vatRate = vatRate;
        this.category = category;
        this.barCode = new BarCode();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean isOrganic() {
        return organic;
    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }

    public BarCode getBarCode() {
        return barCode;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public int getVatRate() {
        return vatRate;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setSellingPrice(double price) {
        sellingPrice = price;
    }

    @Override
    public String toString() {
        return "%-10s %-10s %-10s %-10s %s %-10s %s %-10s %-10s %-10s %-10s".
                formatted(name, unit, manufacturer, organic, purchasePrice,
                Currency.getInstance(Locale.getDefault()), sellingPrice,
                Currency.getInstance(Locale.getDefault()), vatRate, category, barCode);
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
