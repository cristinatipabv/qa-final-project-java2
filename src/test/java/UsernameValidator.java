import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.println("===== Username Validator =====");

        do {

            System.out.print("Introduceti un username: ");

            username = scanner.nextLine();

            if (username == null || username.length() < 6 || username.length() > 12 || !username.matches("^[A-Za-z0-9_]+$"))

            {

                System.out.println("❌ Username invalid! Regulile sunt:");

                System.out.println("- Minimum 6 caractere");

                System.out.println("- Maximum 12 caractere");

                System.out.println("- Doar litere, cifre si underscore");

                System.out.println("Incearca din nou.\n");

                continue;

            }

            System.out.println("✅ Username valid!");

            break;

        } while (true);
        scanner.close();

    }

}