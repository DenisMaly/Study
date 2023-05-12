import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();
        ArrayList<Employee> employeesOperator = new ArrayList<>();
        ArrayList<Employee> employeesManager = new ArrayList<>();
        ArrayList<Employee> employeesTopManager = new ArrayList<>();
        for (int i = 0; i <= 180; i++) {
            employeesOperator.add(new Operator());
        }
        company1.hireAll(employeesOperator);
        for (int i = 0; i <= 80; i++) {
            employeesManager.add(new Manager());
        }
        company1.hireAll(employeesManager);
        for (int i = 0; i <= 10; i++) {
            employeesTopManager.add(new TopManager(company1.getIncome()));
        }
        company1.hireAll(employeesTopManager);
        company1.getTopSalaryStaff(15);
        company1.getLowestSalaryStaff(30);

        company1.fire(122);
        company1.getTopSalaryStaff(15);
        company1.getLowestSalaryStaff(30);

    }
}