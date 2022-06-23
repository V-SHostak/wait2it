package Salary;

public class EmployeeSalaryMonth implements Salary{

    private int monthWork;
    private double salaryInMonth;
    private double salaryEmloyeeTwo;

    public EmployeeSalaryMonth(int monthWork, double salaryInMonth) {
        this.monthWork = monthWork;
        this.salaryInMonth = salaryInMonth;
    }

    @Override
    public double salary() {
        salaryEmloyeeTwo = monthWork*salaryInMonth;
        return salaryEmloyeeTwo;
    }

    @Override
    public String toString() {
        return "Second employee works " + monthWork +
                " months, his salary in month is " + salaryInMonth +
                "$. Second employee earned ";
    }
}
