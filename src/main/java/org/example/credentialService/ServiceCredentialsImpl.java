package org.example.credentialService;

import org.example.model.Employee;

import java.util.Random;

public class ServiceCredentialsImpl implements ServiceCredentials {
    private static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "@!#$%^&*";
    private static final String PASSWORD_ALLOW_BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$%^&*";
    private static final Random random = new Random();

    public ServiceCredentialsImpl() {
    }

    public String generateEmailAddress(String firstName, String lastName, String departName, String company) {
        String generatedEmail = firstName + lastName + "@" + departName + "." + company + ".com";
        return generatedEmail;
    }

    public String generateCredentials(int maxLength) {
        StringBuilder passwordBuilder = new StringBuilder(maxLength);
        passwordBuilder.append("abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt("abcdefghijklmnopqrstuvwxyz".length())));
        passwordBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".length())));
        passwordBuilder.append("0123456789".charAt(random.nextInt("0123456789".length())));
        passwordBuilder.append("@!#$%^&*".charAt(random.nextInt("@!#$%^&*".length())));

        for(int i = 4; i < maxLength; ++i) {
            passwordBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$%^&*".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$%^&*".length())));
        }

        char[] passwordChars = passwordBuilder.toString().toCharArray();
        int i = 0;
        if (i < passwordChars.length) {
            int j = random.nextInt(passwordChars.length);
            char temp = passwordChars[j];
            passwordChars[i] = passwordChars[j];
            passwordChars[j] = temp;
            return new String(passwordChars);
        } else {
            return null;
        }
    }

    public void displayCredentials(Employee employee) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
        System.out.println("Email\t\t" + employee.getEmail());
        System.out.println("Password\t" + employee.getPassword());
    }
}

