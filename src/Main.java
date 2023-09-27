// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Initial credit card balance
        double balance = 5000.0;

        // Interest rate (17%)
        double interestRate = 0.17;

        // Calculate interest after one month
        double interestAfterOneMonth = balance * interestRate;

        // Calculate interest after two months
        double interestAfterTwoMonths = balance * interestRate * 2;

        // Display the interest due after one month and two months
        System.out.println("Interest due after one month: $" + interestAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestAfterTwoMonths);
    }
}