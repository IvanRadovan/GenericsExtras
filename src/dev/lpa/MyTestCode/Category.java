package dev.lpa.MyTestCode;

public interface Category<T extends Product> {

    boolean addItem(GroceryItem groceryItem);
    boolean removeItem();
    boolean queryItem();
    boolean updateItem();

    int getStockLevel();
    double getStockValue();
}
