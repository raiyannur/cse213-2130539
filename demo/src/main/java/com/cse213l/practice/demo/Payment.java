package com.cse213l.practice.demo;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Payment {
    private SimpleStringProperty product;
    private SimpleDoubleProperty unitPrice;
    private SimpleIntegerProperty quantity;
    private SimpleDoubleProperty  predefinedVat ;
    private SimpleDoubleProperty  vatAmount ;
    private SimpleDoubleProperty  totalAmount ;

    public Payment(SimpleStringProperty product,
                   SimpleDoubleProperty unitPrice,
                   SimpleIntegerProperty quantity,
                   SimpleDoubleProperty predefinedVat,
                   SimpleDoubleProperty vatAmount,
                   SimpleDoubleProperty totalAmount) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.predefinedVat = predefinedVat;
        this.vatAmount = vatAmount;
        this.totalAmount = totalAmount;
    }

    public Payment() {

    }

    public String getProduct() {
        return product.get();
    }

    public SimpleStringProperty productProperty() {
        return product;
    }

    public void setProduct(String product) {
        this.product.set(product);
    }

    public double getUnitPrice() {
        return unitPrice.get();
    }

    public SimpleDoubleProperty unitPriceProperty() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice.set(unitPrice);
    }

    public int getQuantity() {
        return quantity.get();
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    public double getPredefinedVat() {
        return predefinedVat.get();
    }

    public SimpleDoubleProperty predefinedVatProperty() {
        return predefinedVat;
    }

    public void setPredefinedVat(double predefinedVat) {
        this.predefinedVat.set(predefinedVat);
    }

    public double getVatAmount() {
        return vatAmount.get();
    }

    public SimpleDoubleProperty vatAmountProperty() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount.set(vatAmount);
    }

    public double getTotalAmount() {
        return totalAmount.get();
    }

    public SimpleDoubleProperty totalAmountProperty() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount.set(totalAmount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "product=" + product +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", predefinedVat=" + predefinedVat +
                ", vatAmount=" + vatAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }



}



