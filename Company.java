import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    private double income;
    public List<Employee> getTopSalaryStaff(int count) {
        System.out.println("Максимальные зарплаты компании");
        ArrayList<Employee> employeesTopSalaryStaff = new ArrayList<>();
        sorting();
        Collections.reverse(employees);
        for (int i = 0; i <= count; i++) {
            employeesTopSalaryStaff.add(employees.get(i));
            System.out.println(employees.get(i).getMonthSalary());
        }
        return employeesTopSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        System.out.println("Минимальные зарплаты компании");
        ArrayList<Employee> employeesLowestSalaryStaff = new ArrayList<>();
        sorting();
        for (int i = 0; i <= count; i++) {
            employeesLowestSalaryStaff.add(employees.get(i));
            System.out.println(employees.get(i).getMonthSalary());
        }
        return employeesLowestSalaryStaff;
    }

    public void hire(Employee employee) {
        employees.add(employee);
        employee.getMonthSalary();
        income += employee.getProfit();

    }

    public List<Employee> sorting() {
        employees.sort(Comparator.comparing(Employee::getMonthSalary));
        return employees;
    }

    public void hireAll(ArrayList<Employee> employeeList) {
        employees.addAll(employeeList);
        for (Employee employee : employeeList) {
            employee.getMonthSalary();
            income += employee.getProfit();
        }
    }

    public void fire(int count) {
        sorting();
        Collections.reverse(employees);
        while (count > 0) {
            System.out.println("сотрудник  " + employees.get(employees.size() - 1).getMonthSalary() + "Уволен");
            employees.remove(employees.size() - 1);
            count--;

        }
    }

    public double getIncome() {
        return income;
    }

    public boolean incomeEnough() {
        if (income >= 10_000_000) {
            return true;
        } else {
            return false;
        }
    }


}
