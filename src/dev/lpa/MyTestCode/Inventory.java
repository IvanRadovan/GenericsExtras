package dev.lpa.MyTestCode;

import java.util.*;

public class Inventory {

    private final String storeName;
    private List<CategoryList> list;

    public Inventory(String storeName) {
        this.storeName = storeName;
        this.list = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public List<CategoryList> getList() {
        return list;
    }

    public boolean addCategory(CategoryList categoryList) {
        if (this.list.contains(categoryList)) return false;
        this.list.add(categoryList);
        return true;
    }

    public boolean removeCategory() {
        return false;
    }

    public boolean queryCategory() {
        return false;
    }

    public boolean updateCategory() {
        return false;
    }
}
