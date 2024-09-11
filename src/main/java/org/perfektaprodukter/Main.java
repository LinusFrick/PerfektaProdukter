package org.perfektaprodukter;

import org.perfektaprodukter.system.ManagementSystem;
import org.perfektaprodukter.employees.PermanentEmployee;
import org.perfektaprodukter.employees.Intern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementSystem system = new ManagementSystem();

        while (true) {
            System.out.println("1. Lägg till fastanställd");
            System.out.println("2. Lägg till praktikant");
            System.out.println("3. Visa all personal");
            System.out.println("4. Visa snittlön för män");
            System.out.println("5. Visa snittlön för kvinnor");
            System.out.println("6. Lista anställda efter anställningsdatum");
            System.out.println("7. Avsluta");
            System.out.print("Välj ett alternativ: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPermanentEmployee(scanner, system);
                    break;
                case 2:
                    addIntern(scanner, system);
                    break;
                case 3:
                    System.out.println("Totalt antal personal: " + system.totalEmployees());
                    break;
                case 4:
                    System.out.println("Snittlön för män: " + system.averageSalaryByGender("Male"));
                    break;
                case 5:
                    System.out.println("Snittlön för kvinnor: " + system.averageSalaryByGender("Female"));
                    break;
                case 6:
                    system.listEmployeesByStartDate().forEach(emp ->
                            System.out.println("Namn: " + emp.getName() + ", Anställningsdatum: " + emp.getStartDate()));
                    break;
                case 7:
                    System.out.println("Avslutar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private static void addPermanentEmployee(Scanner scanner, ManagementSystem system) {
        System.out.print("Ange namn: ");
        String name = scanner.next();
        System.out.print("Ange kön (Male/Female): ");
        String gender = scanner.next();
        System.out.print("Ange anställningsdatum (YYYY-MM-DD): ");
        String startDate = scanner.next();
        System.out.print("Ange anställnings-ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Ange lön: ");
        double salary = scanner.nextDouble();
        system.addEmployee(new PermanentEmployee(name, gender, startDate, employeeId, salary));
    }

    private static void addIntern(Scanner scanner, ManagementSystem system) {
        System.out.print("Ange namn: ");
        String name = scanner.next();
        System.out.print("Ange kön (Male/Female): ");
        String gender = scanner.next();
        System.out.print("Ange praktik startdatum (YYYY-MM-DD): ");
        String startDate = scanner.next();
        System.out.print("Ange anställnings-ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Ange slutdatum för praktik (YYYY-MM-DD): ");
        String endDate = scanner.next();
        system.addEmployee(new Intern(name, gender, startDate, employeeId, endDate));
    }
}
