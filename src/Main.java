import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        String principal = scanner.nextLine().trim();

        System.out.print("Annual Interest Rate: ");
        String annualInterestRate = scanner.nextLine().trim();

        System.out.print("Period (Years): ");
        String period = scanner.nextLine().trim();

        double monthlyInterestRate;

        monthlyInterestRate =  Double.parseDouble(annualInterestRate) / 1200;

        double numMonths = Double.parseDouble(period) * 12;

        double mortgage = Double.parseDouble(principal) *
                (((monthlyInterestRate)*(Math.pow((1+monthlyInterestRate), numMonths))) /
                ((Math.pow((1+monthlyInterestRate), numMonths)) - 1));

        NumberFormat result = NumberFormat.getCurrencyInstance();
        String printedMortgage = result.format(mortgage);
        System.out.print("Mortgage: " + printedMortgage);
    }
}
