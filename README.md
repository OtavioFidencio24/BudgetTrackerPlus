# Budget Tracker

## Description
Budget Tracker is a Java-based console application designed to help users manage their monthly budget. This program allows users to input their income and expenses across different categories, calculate the total expenses, and determine the remaining budget. It also provides a summary of expenses along with their respective percentages relative to the total income.

## Features
- Input monthly income and categorize expenses (Rent, Groceries, Transportation, Entertainment).
- Automatically calculate:
  - Total expenses.
  - Remaining budget.
  - Percentage of each expense category relative to the income.
- Display a well-formatted summary of the budget and expenses.

## How It Works
1. **User Input**: The program prompts the user to enter their monthly income and expenses for each category.
2. **Calculations**:
   - Total expenses are calculated by summing all categories.
   - The remaining budget is determined by subtracting total expenses from the monthly income.
   - Percentages are calculated for each expense category.
3. **Summary Output**: A detailed breakdown of income, expenses, percentages, and the remaining budget is displayed.

## Example Output
```plaintext
Hello, Welcome to the Budget Tracker
Please enter your Monthly Income
3000.00
Please enter the value of your Rent
1200.00
Please enter the value of your Groceries
250.33
Please enter the value of your monthly Transportation
250.50
Please enter the value of your monthly Entertainment
215.35

Monthly Income: 3000.00

Rent: 1200.00
Percentage of expense: 40.00%

Groceries: 250.33
Percentage of expense: 8.34%

Transportation: 250.50
Percentage of expense: 8.35%

Entertainment: 215.35
Percentage of expense: 7.18%

Total Expenses: 1916.18

Remaining Budget: 1083.82
```

## Installation
1. Ensure you have Java installed on your system. You can download it [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Clone the repository or download the `.java` files.
3. Compile and run the `Main.java` file in your preferred IDE or terminal.

## Usage
1. Run the `Main.java` file.
2. Follow the prompts to input your income and expenses.
3. Review the calculated summary displayed in the console.

## Files in the Project
- **BudgetTracker.java**: Contains the class to handle the logic for storing income, expenses, and performing calculations.
- **Main.java**: Contains the main method to execute the application and interact with the user.

## Technologies Used
- **Java**: Core programming language.
- **Scanner**: For user input.
- **DecimalFormat**: To format numerical output.

## Future Improvements
- Add a graphical user interface (GUI) for better user interaction.
- Save and load budget data from a file or database.
- Add more customizable expense categories.

## License
This project is open-source and available under the MIT License. Feel free to modify and use it as needed.

## Author
- **Otavio**
  - [GitHub Profile](https://github.com/your-profile)

---

### Thank you for using Budget Tracker! If you have any suggestions or encounter issues, feel free to submit them in the repository's issues section.

