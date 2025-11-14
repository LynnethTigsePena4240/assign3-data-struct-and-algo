/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assign3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ahmed Rahim
 */
public class Update {

    // Updates product count
    public static void updateProduct(Map<String, Integer> products, String productId,
            String productName, int itemsPurchased) {
        if (products == null) {
            System.out.println("Error: products map is null");
            return;
        }

        if (itemsPurchased <= 0) {
            return;
        }

        // Add to existing count or create new entry
        if (products.containsKey(productId)) {
            int currentCount = products.get(productId);
            products.put(productId, currentCount + itemsPurchased);
        } else {
            products.put(productId, itemsPurchased);
        }
    }

    // Updates customer total bill
    public static void updateCustomer(Map<String, Integer> customers, String customerId,
            String firstName, String lastName,
            double singleItemPrice, int itemsPurchased) {
        if (customers == null) {
            System.out.println("Error: customers map is null");
            return;
        }

        if (itemsPurchased <= 0) {
            return;
        }

        // Calculate total for this purchase
        int purchaseAmount = (int) (singleItemPrice * itemsPurchased);

        // Add to existing bill or create new entry
        if (customers.containsKey(customerId)) {
            int currentBill = customers.get(customerId);
            customers.put(customerId, currentBill + purchaseAmount);
        } else {
            customers.put(customerId, purchaseAmount);
        }
    }

    // Test
//    public static void main(String[] args) {
//        Map<String, Integer> customers = new HashMap<>();
//        Map<String, Integer> products = new HashMap<>();
//
//        String customerId = "1005";
//        String firstName = "Abigail";
//        String lastName = "Adams";
//        String productId = "5020";
//        String productName = "blouse";
//        double singleItemPrice = 45.0;
//        int itemsPurchased = 2;
//
//        updateProduct(products, productId, productName, itemsPurchased);
//        updateCustomer(customers, customerId, firstName, lastName, singleItemPrice, itemsPurchased);
//
//        // Results
//        System.out.println("Customer " + customerId + " (" + firstName + " " + lastName + "): $" + customers.get(customerId));
//        System.out.println("Product " + productId + " (" + productName + "): " + products.get(productId) + " items");
//
//        // Test with another purchase
//        updateProduct(products, productId, productName, 3);
//        updateCustomer(customers, customerId, firstName, lastName, 45.0, 3);
//
//        System.out.println("Customer " + customerId + ": $" + customers.get(customerId));
//        System.out.println("Product " + productId + ": " + products.get(productId) + " items");
//    }
}