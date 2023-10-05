package makailahomework;

import java.util.*;

public class Bag {


    private ArrayList<Product> products; //Gets an arraylist of products so you can the list
    GasPrices gas = new GasPrices();//calls gas prices so you can use it on the toString and other methods

    public Bag() {
        this.products = new ArrayList<>();
    }


    public ArrayList<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    /*
    The bagTotal method calculates the total cost of all products in the
     bag by multiplying the price of each product with its quantity and summing them up
     */
    public Double bagTotal() {
        double total = 0.0;

        for (Product product : products) {
            total += (product.getPrice() * product.getQuantity()); // Multiply price and quantity
        }

        return total;
    }

    /*
    The ultimateTotal method calculates the total cost of all products in the bag
     including the cost of gas based on the miles traveled.
    It adds the result of bagTotal method to the price of gas obtained from the priceOfGas method.
     */
    public Double ultimateTotal() {
        double sum = bagTotal();


        sum += gas.priceOfGas();
        return sum;
    }


    /*
    String.format() is like creating a template for a sentence where you have empty spots
    (placeholders) that you can fill with specific values
    ------------------------------------------------------------
    This code snippet shows the implementation of the toString method in the Bag class.
    The method generates a formatted string representation of the bag's contents, including the
    product name, quantity, price, miles traveled, and total cost.

     */
    @Override
    public String toString() {
        String result = "Product      Qty      Price       Miles      Total\n";
        result += "----         ---      -----      -----      -----\n";

        for (Product product : products) {
            result += String.format("%-12s  %-3d      $%-6.2f     %-5.2f     $%-6.2f\n",
                    product.getProductName(), product.getQuantity(), product.getPrice(),
                    gas.priceOfGas(), product.getPrice() * product.getQuantity());
        }

        result += "-------------------------------------------------------\n";
        result += String.format("Bag Total:                                $%.2f\n", bagTotal());
        result += String.format("Ultimate Total:                        $%.2f\n", ultimateTotal());
        result += "\nThank you. Come Again!!!\n";

        return result;
    }

}
