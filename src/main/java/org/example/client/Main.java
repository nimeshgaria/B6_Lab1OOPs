package org.example.client;

import org.example.credentialService.ServiceCredentialsImpl;
import org.example.model.Employee;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Nimesh", "Garia");
        employee.setCompany("TCS");
        ServiceCredentialsImpl serviceCredentials = new ServiceCredentialsImpl();
        System.out.println("Please enter the department from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        String generatedEmail;
        String generatedPassword;
        switch (option) {
            case 1:
                generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), employee.getCompany().toLowerCase(), "tech");
                generatedPassword = serviceCredentials.generateCredentials(12);
                employee.setEmail(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredentials(employee);
                break;
            case 2:
                generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), employee.getCompany().toLowerCase(), "admin");
                generatedPassword = serviceCredentials.generateCredentials(12);
                employee.setEmail(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredentials(employee);
                break;
            case 3:
                generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), employee.getCompany().toLowerCase(), "hr");
                generatedPassword = serviceCredentials.generateCredentials(12);
                employee.setEmail(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredentials(employee);
                break;
            case 4:
                generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), employee.getCompany().toLowerCase(), "legal");
                generatedPassword = serviceCredentials.generateCredentials(12);
                employee.setEmail(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredentials(employee);
                break;
            default:
                System.out.println("Enter a valid option");
        }

    }
}