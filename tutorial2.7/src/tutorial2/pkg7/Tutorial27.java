/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial2.pkg7;

import java.util.Scanner;

/**
 *
 * @author 230146740
 */
public class Tutorial27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using the do/while loop for the grocery list program.
        // Allow user to kepp adding grocery items until they decide to stop.

        Scanner scn = new Scanner(System.in);

        String item, finish;
        double price, sum = 0;
        int counter = 0;

        do {
            counter++;

            System.out.print("Enter the item: ");
            item = scn.nextLine().trim();

            while ("".equals(item)) {
                System.out.println("Item cannot be empty. Try again.");
                System.out.print("Enter the item: ");
                item = scn.nextLine().trim();
            }

            System.out.print("Enter the price: ");
            price = scn.nextDouble();

            while (price <= 0) {
                System.out.println("Invalid price. Must be greater than O.");
                System.out.print("Enter the price: ");
                price = scn.nextDouble();
            }

            sum += price;

            System.out.println("Do you want to add another item? Yes/No: ");
            finish = scn.next();

        } while (finish.equalsIgnoreCase("Yes"));
        {

        }

        System.out.println("Items added: " + counter);
        System.out.println("Total cost: " + sum);

    }

}
