package com.cristina.hw2;

public class Main {
    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        try {
            User u1 = new User("testuser", 25);
            repo.addUser(u1);
            System.out.println("User adaugat cu succes: " + u1.getUsername());
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea utilizatorului: " + e.getMessage());
        }

        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repo.addUser(admin);
            System.out.println("User admin adaugat cu succes: " + admin.getUsername());
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea adminului: " + e.getMessage());
        }

        try {
            User u2 = new User("ab", 22);
            repo.addUser(u2);
            System.out.println("User adaugat cu succes: " + u2.getUsername());
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea userului, username prea scurt: " + e.getMessage());
        }

        try {
            User u3 = new User("baduser", -5);
            repo.addUser(u3);
            System.out.println("User adaugat cu succes: " + u3.getUsername());
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea userului, varsta negativa: " + e.getMessage());
        }

        System.out.println("\nUtilizatori adaugati cu succes:");
        for (User u : repo.getAllUsers()) {
            System.out.println(u);
        }
    }
}