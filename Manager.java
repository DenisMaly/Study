public class Manager implements Employee {
    private double prize = 0.05;
    private double salary = 30_000;
    int maxProfit = 140_000;
    int minProfit = 115_000;
    private double salaryWithBonus;
    private double profit;


    @Override
    public double getMonthSalary() {
        profit = (int) (Math.random() * (maxProfit - minProfit) + minProfit);
        salaryWithBonus = salary + prize * profit;
        return salaryWithBonus;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
