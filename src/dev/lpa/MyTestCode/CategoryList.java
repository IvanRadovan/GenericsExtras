package dev.lpa.MyTestCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryList<T extends Product> implements Category {


    private final String categoryName;
    private final Map<String, List<T>> groceryList;

    public CategoryList(String categoryName) {
        this.categoryName = categoryName;
        this.groceryList = new HashMap<>();
    }

    @Override
    public boolean addItem() {
        return false;
    }

    @Override
    public boolean removeItem() {
        return false;
    }

    @Override
    public boolean queryItem() {
        return false;
    }

    @Override
    public boolean updateItem() {
        return false;
    }

    @Override
    public int getStockLevel() {
        return 0;
    }

    @Override
    public double getStockValue() {
        return 0;
    }
}
