//07.10.2026
//Task 1
//public class Homework3{
//    public static void main(String[] args) {
//        int i = 1;
//        while (i < 1000) {
//            System.out.println(i);
//            i*=10;
//        }
//    }
//}

// Task 2
//public class Homework3{
//    public static void main(String[] args) {
//        for (int i = 1; i<1000; i*=10)
//            System.out.println(i);
//    }
//}

//Task 3.1 "for loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        for (int i = 1; i <= num; i += 1) {
//            System.out.println(i);
//        }
//    }
//}

// Task 3.2 "while loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 1;
//        while (i <= num) {
//            System.out.println(i);
//            i+=1;
//        }
//    }
//}



// Task 3.3 "do-while loop"
//import java.util.Scanner;
//public class Homework3{
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 1;
//        System.out.println(i);
//        do {
//            i+=1;
//            System.out.println(i);
//        } while (i < num);
//    }
//}

// Task 4 Infinity loop
//public class Homework3{
//    public static void main(String[] args) {
//        int n = 10;
//        while (n<=10) {
//            System.out.println("Infinity loop");
//        }
//    }
//}

// Task 5 Output only even numbers
// 5.5 "While loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 1;
//        while (i < num) {
//            i+=1;
//            if (i%2==0) {
//                System.out.println("Only even numbers: " + i);
//            }
//        }
//    }
//}
//
// "Do-while loop"
//import java.util.Scanner;
//public class Homework3{
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 1;
//        System.out.println(i);
//        do {
//            i+=1;
//            if (i%2==0){
//            System.out.println("Only even numbers: " + i);}
//        } while (i < num);
//    }
//}
//
// "For loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        for (int i = 1; i <= num; i += 1) {
//            if (i%2==0){
//            System.out.println("Only even numbers: " + i);}
//        }
//    }
//}

// Task 6
// 5.5 "While loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 0;
//        while (i < num) {
//            i+=1;
//            if (i%2!=0) {
//                System.out.println("Only odd numbers: " + i);
//            }
//        }
//    }
//}

// "Do-while loop"
//import java.util.Scanner;
//public class Homework3{
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        int i = 0;
//        do {
//            i+=1;
//            if (i%2!=0){
//                System.out.println("Only odd numbers: " + i);}
//        } while (i < num);
//    }
//}

// "For loop"
//import java.util.Scanner;
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter the any number: ");
//        int num = n.nextInt();
//        for (int i = 1; i <= num; i += 1) {
//            if (i%2!=0){
//                System.out.println("Only odd numbers: " + i);}
//        }
//    }
//}

// Task 7
//public class Homework3{
//    public static void main(String[] args) {
//        int i = 1;
//        while (i < 20) {
//            i+=1;
//            if (i%3==0 && i%5==0) {
//                System.out.println(i + "-->" + "FizzBuzz");}
//            else if (i%3==0) {
//                System.out.println(i + "-->" + "Fizz");
//            }
//            else if (i%5==0) {
//                System.out.println(i + "-->" + "Buzz");
//            };
//        }
//    }
//}

// 09.10.2026
// Task 1 ATM PIN Verification
//import java.util.Scanner;
//public class Homework3{
//    public static void main(String[] args) {
//        Scanner p = new Scanner(System.in);
//        System.out.println("Enter your PIN: ");
//        int attempts = 4;
//        int correctPin = 1234;
//        while(attempts>0) {
//            int pin = p.nextInt();
//            if (pin==correctPin) {
//                System.out.println("PIN is correct! You can use your card");
//                break;
//            }
//            else
//                attempts-=1;
//            {System.out.println("Incorrect PIN. Try again" + "\nAttempts left: " + attempts);}
//        }
//        if (attempts==0) {
//            System.out.println("Card blocked!");
//        }
//    }
//}

// Task 2: Guess the Number
//import java.util.Scanner;
//public class Homework3{
//    public static void main(String[] args) {
//        Scanner secret = new Scanner(System.in);
//        System.out.println("Enter your guess: ");
//        int attempts = 5;
//        int correctNum = 8;
//        int count = 0;
//        while(attempts>0) {
//            count+=1;
//            int guess = secret.nextInt();
//            if (guess==correctNum) {
//                System.out.println("Correct! You needed: " + count + " attempts");
//                break;
//            }
//            else{
//                attempts-=1;
//            if (guess>correctNum) {
//                System.out.println("Too high!");
//            }
//            else if (guess<correctNum) {
//                System.out.println("Too low!");
//            }}
//        }
//        if (attempts==0) {
//            System.out.println("Game over! \n" + "The secret number was: " + correctNum);
//        }
//    }
//}
//Task 3: Number Statistics

//import java.util.Scanner;
//
//public class Homework3 {
//    public static void main(String[] args) {
//        Scanner num = new Scanner(System.in);
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//        int evenCount = 0;
//        int oddCount = 0;
//
//        for (int i = 1; i <= 10; i+=1) {
//            System.out.print("Enter number " + i + ": ");
//            int numbers = num.nextInt();
//
//            if (numbers > 0) {
//                positiveCount+=1;
//            } else if (numbers < 0) {
//                negativeCount+=1;
//            } else {
//                zeroCount+=1;
//            }
//
//            if (numbers % 2 == 0) {
//                evenCount+=1;
//            } else {
//                oddCount+=1;
//            }
//        }
//
//        System.out.println("===== STATISTICS =====");
//        System.out.println("Positive numbers: " + positiveCount);
//        System.out.println("Negative numbers: " + negativeCount);
//        System.out.println("Zeros: " + zeroCount);
//        System.out.println("Even numbers: " + evenCount);
//        System.out.println("Odd numbers: " + oddCount);
//    }
//}

//Homework 3
//Mini-Project: ATM Simulator
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPIN = 1234;
        double balance = 0.0;
        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("===== SIMPLE ATM =====");

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");

            if (!scanner.hasNextInt()) {
                System.out.println("PIN must be a number.");
                scanner.next();
                attempts-=1;
                continue;
            }

            int userPIN = scanner.nextInt();

            if (userPIN == correctPIN) {
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            } else {
                attempts-=1;
                System.out.println("Incorrect PIN.");

                if (attempts > 0) {
                    System.out.println("Remaining attempts: " + attempts);
                } else {
                    System.out.println("Your account has been blocked.");
                }
            }
        }

        if (!loggedIn) {
            scanner.close();
            return;
        }

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number from 1 to 4.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option. Please enter a number between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.printf("Current balance: %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter the deposit amount: ");

                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();

                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.printf("Updated balance: %.2f%n", balance);
                        } else {
                            System.out.println("Deposit must be greater than zero.");
                        }
                    } else {
                        System.out.println("Invalid input number format.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: ");

                    if (scanner.hasNextDouble()) {
                        double withdrawAmount = scanner.nextDouble();

                        if (withdrawAmount <= 0) {
                            System.out.println("Withdrawal must be greater than zero.");
                        } else if (withdrawAmount > balance) {
                            System.out.println("You don't have enough money.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.printf("Updated balance: %.2f%n", balance);
                        }
                    } else {
                        System.out.println("Invalid input number format.");
                        scanner.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    break;
            }
        }

        scanner.close();
    }
}
