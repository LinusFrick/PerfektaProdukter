package org.perfektaprodukter.employees;

public class PermanentEmployee extends Employee {
    private double salary;

    public PermanentEmployee(String name, String gender, String startDate, int employeeId, double salary) {
        super(name, gender, startDate, employeeId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
