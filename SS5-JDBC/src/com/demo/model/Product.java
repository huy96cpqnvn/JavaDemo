package com.demo.model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private int categoryID;

    public Product() {

    }

    public Product(String name, int quantity, int price, int categoryID) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categoryID = categoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
