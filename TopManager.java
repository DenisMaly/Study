
public class TopManager extends Company implements Employee {


    private double salary = 30_000;
    private double salaryWithBonus;
    private final double bonus = 1.5 * salary;
    private double profit = 0;
    private double incomeCompany;

    public TopManager(double incomeCompany) {
        this.incomeCompany = incomeCompany;
    }

    @Override
    public double getMonthSalary() {
        if (incomeCompany > 10_000) {
            salaryWithBonus = salary + bonus;
        } else {
            salaryWithBonus = salary;
        }
        return salaryWithBonus;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
