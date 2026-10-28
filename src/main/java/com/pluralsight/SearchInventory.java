package com.pluralsight;
import java.util.*;
// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        //for object : object.add(new Class(parameters ex. "Piece", value)
        inventory.add(new Product(1234, "shirt", 4.99));
        inventory.add(new Product(1235, "pants", 5.99));
        inventory.add(new Product(1236, "shoes", 9.99));
        inventory.add(new Product(1237, "bracelet", 7.99));
        inventory.add(new Product(1238, "keychain", 2.99));



        return inventory;
    }
}