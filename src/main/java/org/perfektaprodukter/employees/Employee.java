package org.perfektaprodukter.employees;

public class Employee {
    private String name;
    private String gender;
    private String startDate;
    private int employeeId;

    public Employee(String name, String gender, String startDate, int employeeId) {
        this.name = name;
        this.gender = gender;
        this.startDate = startDate;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
