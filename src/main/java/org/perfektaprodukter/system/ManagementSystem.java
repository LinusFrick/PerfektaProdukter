package org.perfektaprodukter.system;

import org.perfektaprodukter.employees.PermanentEmployee;
import org.perfektaprodukter.employees.Intern;
import org.perfektaprodukter.employees.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ManagementSystem {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int totalEmployees() {
        return employees.size();
    }

    public double averageSalaryByGender(String gender) {
        List<PermanentEmployee> filteredEmployees = employees.stream()
                .filter(emp -> emp instanceof PermanentEmployee && emp.getGender().equals(gender))
                .map(emp -> (PermanentEmployee) emp)
                .collect(Collectors.toList());

        if (filteredEmployees.isEmpty()) {
            return 0;
        }

        double totalSalary = filteredEmployees.stream().mapToDouble(PermanentEmployee::getSalary).sum();
        return totalSalary / filteredEmployees.size();
    }

    public List<Employee> listEmployeesByStartDate() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getStartDate))
                .collect(Collectors.toList());
    }
}
