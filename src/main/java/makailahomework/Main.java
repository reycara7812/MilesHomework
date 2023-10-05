package makailahomework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        GasPrices gas = new GasPrices();
        Bag bag = new Bag();
        ArrayList<Product> products = new ArrayList<>();
        boolean repeat = true;//Creates a repeat boolean variable for the while loop

        System.out.println("Welcome to the gas station!");
        Scanner scanner = new Scanner(System.in); // makes scanner

        /*
        runs while to see what the costumer bought from the store and it stores it into a new object
        how much and the price then asks in the bought anything else if yes it loops if not then it stops the loop
         */
        while (repeat) {
            System.out.print("What did you buy from the Store: ");
            Product product = new Product();
            bag.addProduct(product);
            product.setProductName(scanner.next());

            System.out.print("How much " + product.getProductName() + " did you buy?");
            product.setQuantity(scanner.nextInt());
            scanner.nextLine();

            System.out.print("How much did " + product.getProductName() + " Cost: ");
            product.setPrice(scanner.nextDouble());
            scanner.nextLine();
            products.add(product);
            System.out.print("Did you buy anything else? (Yes or No): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("no")) {
                repeat = false;
            } else if (response.equals("yes")) {
                System.out.println("What else did you buy?");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("How many miles did you travel");
        gas.setMilesTraveled(scanner.nextInt());

        System.out.println("Do you want a receipt \n Yes or No");
        scanner.nextLine();
        String response = scanner.nextLine().toLowerCase();
        if (response.equals("yes")) {
            System.out.println(bag.toString());

        } else {
            System.out.println("I am giving you one anyway");
            System.out.println(bag.toString());

        }
    }
}








