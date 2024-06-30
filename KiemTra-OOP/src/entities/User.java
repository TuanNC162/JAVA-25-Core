package entities;

import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


//    public void passwordChange(Scanner scanner) {
//        System.out.print("Enter your new password: ");
//        String newPassword = scanner.nextLine();
//
//        if(user.getPassword().equals(newPassword))
//            System.out.println("Please enter another password...");
//        else {
//            if(userService.passwordValidator(newPassword)){
//                user.setPassword(newPassword);
//                System.out.println("You are change password change successfully");
//            } else
//                System.out.println("Please enter a password from 7 to 15 characters, containing at least 1 capital letter, 1 special character");
//        }
//    }
//
//
//    public void forgotPassword(Scanner scanner) {
//        System.out.print("Enter your email: ");
//        String email = scanner.nextLine();
//
//        if(user.getEmail().equals(email)) {
//            passwordChange(scanner, user);
//        } else {
//            System.out.println("Email no exist. Please register new an account");
//        }
//    }

}
