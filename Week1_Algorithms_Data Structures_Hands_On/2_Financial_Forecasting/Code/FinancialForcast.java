import java.util.*;

public class FinancialForcast {
    public static double forecastNextMonth(List<Double> revenues) {
        int n = revenues.size();
        if (n < 3) {
            System.out.println("Not enough data to forecast.");
            return -1;
        }

        double sum = 0;
        for (int i = n - 3; i < n; i++) {
            sum += revenues.get(i);
        }

        return sum / 3;
    }

    public static void main(String[] args) {
        List<Double> monthlyRevenue = Arrays.asList(
                12000.0, 13500.0, 12800.0, 14000.0, 15000.0, 15500.0);

        System.out.println("Historical Revenue: " + monthlyRevenue);

        double nextMonthForecast = forecastNextMonth(monthlyRevenue);

        if (nextMonthForecast != -1) {
            System.out.printf("📈 Forecasted revenue for next month: ₹%.2f\n", nextMonthForecast);
        }
    }
}
