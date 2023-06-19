package dev.lpa.MyTestCode;

public interface Product {

    String getName();
    String getTrademark();

    double getValue();
    double getPurchasePrice();
    double getSellingPrice();
    void setSellingPrice(double price);

    // Uncertain if these methods are necessary, due to CategoryList classes determining these types of behaviours.
    String getGroup();
    String getUnit();
    int getVatRate();
    //String getBarcode();   <---- This is is an inner class

}
