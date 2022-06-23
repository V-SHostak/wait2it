package Salary;

public class SalaryMain {
    public static void main(String[] args) {
        EmployeeSalaryHour employeeSalaryHour = new EmployeeSalaryHour(48,12);
        EmployeeSalaryMonth employeeSalaryMonth = new EmployeeSalaryMonth(4,2500);
        System.out.print(employeeSalaryHour);
        System.out.println(employeeSalaryHour.salary() + "$");
        System.out.println("------------------------------------------------------------------------");
        System.out.print(employeeSalaryMonth);
        System.out.println(employeeSalaryMonth.salary() + "$");

    }

}
