package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }

    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Silvio";
        String passwordDB = "sla123";
        System.out.println("Type username");
        String username = scanner.nextLine();
        System.out.println("Type password");
        String password = scanner.nextLine();

        if (!usernameDB.equals(username) || !passwordDB.equals(password)) {
            throw new LoginInvalidException("Username or password is invalid");
        }
        System.out.println("Login completed");
    }
}
