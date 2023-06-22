package dev.lpa.MyTestCode;

public interface Product {

    String getName();
    String getUnit();
    String getManufacturer();
    boolean isOrganic();
    double getPurchasePrice();
    double getSellingPrice();
    int getVatRate();
    String getCategory();

    void setSellingPrice(double price);






}
