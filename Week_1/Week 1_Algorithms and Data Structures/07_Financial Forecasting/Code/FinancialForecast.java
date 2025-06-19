import java.util.Scanner;

public class FinancialForecast {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current amount (present value): ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100;

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Predicted value after %d years: ₹%.2f%n", years, futureValue);

        scanner.close();
    }
}
