package Salary;

public class EmployeeSalaryHour implements Salary {

    private double hourWork;
    private double salaryInHour;
    private double salaryEmployee;

    public EmployeeSalaryHour(double hourWork, double salaryInHour) {
        this.hourWork = hourWork;
        this.salaryInHour = salaryInHour;
    }

    @Override
    public double salary() {
        salaryEmployee = hourWork * salaryInHour;
        return salaryEmployee;
    }

    @Override
    public String toString() {
        return "First employee works " + hourWork +
                " hours, his salary per hours is " + salaryInHour +
                "$. First employee earned ";
    }
}
