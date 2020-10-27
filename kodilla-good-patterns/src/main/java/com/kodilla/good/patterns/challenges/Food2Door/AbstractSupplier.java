package com.kodilla.good.patterns.challenges.Food2Door;

public abstract class AbstractSupplier {
    private String supplierName;

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public boolean isThisSupplier(String supplierName){
        return this.supplierName.equals(supplierName);
    }
    abstract boolean process(OrderData orderData);
}
