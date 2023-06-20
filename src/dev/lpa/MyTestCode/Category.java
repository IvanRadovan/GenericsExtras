package dev.lpa.MyTestCode;

public interface Category {

    boolean addItem();
    boolean removeItem();
    boolean queryItem();
    boolean updateItem();

    int getStockLevel();
    double getStockValue();
}
