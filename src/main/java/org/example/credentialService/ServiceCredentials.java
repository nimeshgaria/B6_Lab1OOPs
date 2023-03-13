package org.example.credentialService;

import org.example.model.Employee;

public interface ServiceCredentials {
    String generateEmailAddress(String var1, String var2, String var3, String var4);

    String generateCredentials(int var1);

    void displayCredentials(Employee var1);
}