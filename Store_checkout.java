import java.util.Scanner;

public class Store_checkout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentTotal = 0;
        int totalItemsPurchased = 0;
        System.out.println("======SIMPLE STORE====== \n1. Mouse - $20 \n2. Keyboard - $40 \n3. Headphones - $50 \n4. Laptop Stand - $30 \n5. Checkout \nChoose a product: ");
        int choice1 = scanner.nextInt();

        while (choice1 != 5) {
            if (choice1 == 1) {
                System.out.println("You selected: Mouse \nPrice: $20 \nEnter a quantity: ");
                int quantity1 = scanner.nextInt();

                if (quantity1 > 0) {
                    int itemCost = 20 * quantity1;
                    currentTotal += itemCost;
                    totalItemsPurchased += quantity1;
                    System.out.println("Add to cart! \nCurrent total: " + "$" + currentTotal);
                } else {
                    System.out.println("Invalid quantity. \nQuantity must be greater than 0.");
                }
            } else if (choice1 == 2) {
                System.out.println("You selected: Keyboard \nPrice: $40 \nEnter a quantity: ");
                int quantity1 = scanner.nextInt();

                if (quantity1 > 0) {
                    int itemCost = 40 * quantity1;
                    currentTotal += itemCost;
                    totalItemsPurchased += quantity1;
                    System.out.println("Add to card! \nCurrent total: " + "$" + currentTotal);
                } else {
                    System.out.println("Invalid quantity. \nQuantity must be greater than 0.");
                }
            } else if (choice1 == 3) {
                System.out.println("You selected: Headphones \nPrice: $50 \nEnter a quantity: ");
                int quantity1 = scanner.nextInt();

                if (quantity1 > 0) {
                    int itemCost = 50 * quantity1;
                    currentTotal += itemCost;
                    totalItemsPurchased += quantity1;
                    System.out.println("Add to card! \nCurrent total: " + "$" + currentTotal);
                } else {
                    System.out.println("Invalid quantity. \nQuantity must be greater than 0.");
                }
            } else if (choice1 == 4) {
                System.out.println("You selected: Laptop Stand \nPrice: $30 \nEnter a quantity: ");
                int quantity1 = scanner.nextInt();

                if (quantity1 > 0) {
                    int itemCost = 30 * quantity1;
                    currentTotal += itemCost;
                    totalItemsPurchased += quantity1;
                    System.out.println("Add to card! \nCurrent total: " + "$" + currentTotal);
                } else {
                    System.out.println("Invalid quantity. \nQuantity must be greater than 0.");
                }
            } else {
                System.out.println("Invalid option. \nPlease choose a number from 1 to 5.");
            }

            System.out.println("======SIMPLE STORE====== \n1. Mouse - $20 \n2. Keyboard - $40 \n3. Headphones - $50 \n4. Laptop Stand - $30 \n5. Checkout \nChoose a product: ");
            choice1 = scanner.nextInt();
        }

        System.out.println("====CHECKOUT====");
        System.out.println("Subtotal: $" + currentTotal);

        double discount1 = 0;
        if (currentTotal >= 100) {
            discount1 = currentTotal * 0.10;
            System.out.println("You received a 10% discount!");
            System.out.println("Discount: $" + discount1);
        } else {
            System.out.println("Discount: $0");
        }

        double finalTotal1 = currentTotal - discount1;
        System.out.println("Final total: $" + finalTotal1);

        System.out.print("Enter payment amount: $");
        double payment1 = scanner.nextDouble();

        while (payment1 < finalTotal1) {
            double remaining1 = finalTotal1 - payment1;
            System.out.println("Insufficient payment.");
            System.out.println("You still need to pay: $" + remaining1);
            System.out.print("Enter payment amount: $");
            payment1 = scanner.nextDouble();
        }

        System.out.println("Payment successful!");
        double change1 = payment1 - finalTotal1;
        System.out.println("Change: $" + change1);

        System.out.println("========================");
        System.out.println("SIMPLE STORE");
        System.out.println("========================");
        System.out.println("Items purchased: " + totalItemsPurchased);
        System.out.println("Subtotal:\n$" + currentTotal);
        System.out.println("Discount:\n$" + discount1);
        System.out.println("Final total:\n$" + finalTotal1);
        System.out.println("Payment:\n$" + payment1);
        System.out.println("Change:\n$" + change1);
        System.out.println("Thank you for shopping!");
        System.out.println("========================");

        scanner.close();
    }
}
