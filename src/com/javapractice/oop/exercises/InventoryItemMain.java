package com.javapractice.oop.exercises;

public class InventoryItemMain {
    public static void main(String[] args) {

        InventoryItem item0;
        item0 = new InventoryItem();

        item0.itemName = "Laptop";
        item0.itemCode = "LP-057";
        item0.supplierName = "Tech Supplies Inc.";
        item0.pricePerItem = 65000.00;
        item0.quantityInStock = 10;

        InventoryItem item1 = new InventoryItem();
        item1.itemName = "KeyBoard";
        item1.itemCode = "KB-630";
        item1.supplierName = "Accessory Inc.";
        item1.pricePerItem = 2500.00;
        item1.quantityInStock = 25;

        System.out.println("------- Item0 Details ------");
        System.out.println("Item Name: " + item0.itemName);
        System.out.println("Item Code: " + item0.itemCode);
        System.out.println("Quantity in Stock: " + item0.quantityInStock);
        System.out.println("Price per Item: $" + item0.pricePerItem);
        System.out.println("Supplier Name: " + item0.supplierName);

        System.out.println("-------- Item1 Details -------");
        System.out.println("Item Name: " + item1.itemName);
        System.out.println("Item Code: " + item1.itemCode);
        System.out.println("Quantity in Stock: " + item1.quantityInStock);
        System.out.println("Price per Item: $" + item1.pricePerItem);
        System.out.println("Supplier Name: " + item1.supplierName);
        System.out.println();

    }
}
