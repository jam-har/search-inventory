package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
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
       /*inventory.add(new Product(1234, "shirt", 4.99));
        inventory.add(new Product(1235, "pants", 5.99));
        inventory.add(new Product(1236, "shoes", 9.99));
        inventory.add(new Product(1237, "bracelet", 7.99));
        inventory.add(new Product(1238, "keychain", 2.99));*/
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
            bufferedReader.readLine();                                  // first line is the header: read it and drop it

            String csvLine;
            while ((csvLine = bufferedReader.readLine()) != null) {
                String[] tokens = csvLine.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double price = Double.parseDouble(tokens[2]);       // every token is text: convert the number

                // One object per line, built from the three values
                Product product = new Product(id, name, price);

            }

            bufferedReader.close();

        } catch (Exception ex) {
            System.out.println("Something went wrong!");
        }
        return inventory;
    }
}