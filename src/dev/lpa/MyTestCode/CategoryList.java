package dev.lpa.MyTestCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryList implements Category {


    private final String categoryName;
    private final List<GroceryItem> categoryList;

    public CategoryList(String categoryName) {
        this.categoryName = categoryName;
        this.categoryList = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<GroceryItem> getCategoryList() {
        return categoryList;
    }

    @Override
    public boolean addItem(GroceryItem groceryItem) {
        if (!groceryItem.getCategory().equals(this.categoryName)) return false;
        categoryList.add(groceryItem);
        return true;

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
