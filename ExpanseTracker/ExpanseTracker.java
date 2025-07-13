// package ExpanseTracker;

import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class ExpanseTracker {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome To Expanse Tracker");
            System.out.println("1. Add Expanses : ");
            System.out.println("2. View Expanses : ");
            System.out.println("3. Calculate the Expanses : ");
            System.out.println("4. Exit : ");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine(); // for String Expanses

            switch (choice) {
                case 1:
                    System.out.print("Enter The Category Of the Item (i.e : Food, Clothes) : ");
                    String category = sc.nextLine();

                    System.out.print("Enter The Amount for the Item : ");
                    double amount = sc.nextDouble();

                    expenses.add(new Expense(category, amount));
                    System.out.println("Added Succesfully!");
                    break;

                case 2:
                    System.out.println("Your Expenses is : ");
                    if (expenses.isEmpty()) {
                        System.out.println("Not Expenses Yet!");
                    } else {
                        for (int i = 0; i < expenses.size(); i++) {
                            Expense e = expenses.get(i);
                            System.err.println((i + 1) + ". " + e.category + " " + e.amount);
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("Your Total Expenses is : " + total + " Rupees");
                    break;

                case 4:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}
