import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize a Scanner object to take user input, using English locale for number formatting
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        // Example of creating a BudgetTracker object using the constructor (commented out for demonstration)
        // BudgetTracker b1 = new BudgetTracker(3000.00, 1200.00, 250.33, 250.50, 215.35);
        // b1.summary();

        // Create a new BudgetTracker object using the default constructor
        BudgetTracker b2 = new BudgetTracker();

        // Greet the user and start collecting input for the budget details
        System.out.println("Hello, Welcome to the Budget Tracker");

        // Prompt user to input their monthly income and set it in the BudgetTracker object
        System.out.println("Please enter your Monthly Income");
        b2.setMonthly_income(sc.nextDouble());

        // Prompt user to input their rent value and set it in the BudgetTracker object
        System.out.println("Please enter the value of your Rent");
        b2.setRent(sc.nextDouble());

        // Prompt user to input their grocery expenses and set it in the BudgetTracker object
        System.out.println("Please enter the value of your Groceries");
        b2.setGroceries(sc.nextDouble());

        // Prompt user to input their transportation expenses and set it in the BudgetTracker object
        System.out.println("Please enter the value of your monthly Transportation");
        b2.setTransportation(sc.nextDouble());

        // Prompt user to input their entertainment expenses and set it in the BudgetTracker object
        System.out.println("Please enter the value of your monthly Entertainment");
        b2.setEntertainment(sc.nextDouble());

        // Display a summary of the budget, including expenses, their percentages, and remaining budget
        b2.summary();
    }
}
