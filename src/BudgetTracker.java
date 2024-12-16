import java.text.DecimalFormat;

public class BudgetTracker {
    // Instance variables to store budget-related data
    private double monthly_income, rent, groceries, transportation;
    private double entertainment;

    // DecimalFormat object to format numbers to two decimal places
    DecimalFormat df = new DecimalFormat("#.00");

    // Example constructor (commented out)
    /*
    public BudgetTracker(Double monthly_income, Double rent, Double groceries,
                         Double transportation, Double entertainment) {
        this.monthly_income = monthly_income;
        this.rent = rent;
        this.groceries = groceries;
        this.transportation = transportation;
        this.entertainment = entertainment;
    }
    */

    // Setter method for monthly income
    public void setMonthly_income(double monthly_income) {
        this.monthly_income = monthly_income;
    }

    // Getter method for monthly income
    public double getMonthly_income() {
        return monthly_income;
    }

    // Setter method for rent
    public void setRent(double rent) {
        this.rent = rent;
    }

    // Getter method for rent
    public double getRent() {
        return rent;
    }

    // Setter method for groceries
    public void setGroceries(double groceries) {
        this.groceries = groceries;
    }

    // Getter method for groceries
    public double getGroceries() {
        return groceries;
    }

    // Setter method for transportation
    public void setTransportation(double transportation) {
        this.transportation = transportation;
    }

    // Getter method for transportation
    public double getTransportation() {
        return transportation;
    }

    // Setter method for entertainment
    public void setEntertainment(double entertainment) {
        this.entertainment = entertainment;
    }

    // Getter method for entertainment
    public double getEntertainment() {
        return entertainment;
    }

    // Method to calculate the total expenses by summing all expense categories
    public double totalExpenses() {
        return getRent() + getGroceries() + getTransportation() + getEntertainment();
    }

    // Method to calculate the remaining budget after deducting total expenses from income
    public double remainingBudget() {
        return getMonthly_income() - totalExpenses();
    }

    // Method to calculate the percentage of a specific expense relative to the monthly income
    public double percentage(double expense) {
        return (expense / getMonthly_income()) * 100;
    }

    // Method to display a summary of income, expenses, and their percentages
    public void summary() {
        System.out.println("\nMonthly Income: " + df.format(this.getMonthly_income()));

        System.out.println("\nRent: " + df.format(this.getRent()));
        System.out.println("Percentage of expense: " + df.format(percentage(getRent())) + "%");

        System.out.println("\nGroceries: " + df.format(this.getGroceries()));
        System.out.println("Percentage of expense: " + df.format(percentage(getGroceries())) + "%");

        System.out.println("\nTransportation: " + df.format(this.getTransportation()));
        System.out.println("Percentage of expense: " + df.format(percentage(getTransportation())) + "%");

        System.out.println("\nEntertainment: " + df.format(this.getEntertainment()));
        System.out.println("Percentage of expense: " + df.format(percentage(getEntertainment())) + "%");

        System.out.println("\nTotal Expenses: " + df.format(totalExpenses()));
        System.out.println("\nRemaining Budget: " + df.format(remainingBudget()));
    }
}
