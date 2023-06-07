package dev.lpa.MyTestCode;

public class Dairy extends Category {

    public Dairy(String name, String trademark, double price) {
        super(name, trademark, price);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getTrademark() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public long getBarCode() {
        return super.getBarCode();
    }

    @Override
    public void setPrice() {

    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
}
