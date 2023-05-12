import java.util.concurrent.Callable;

public class Operator implements Employee {
    private double salary = 35_000;
    private double profit = 0;

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public double getProfit() {
        return profit;
    }

}
