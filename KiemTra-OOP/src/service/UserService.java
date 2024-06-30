package service;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    public User   isValidUsername(String username, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User checkEmail(String email, ArrayList<User> userList){
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public boolean isValidEmail(String email, ArrayList<User> userList) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        boolean isValidFormat = matcher.matches();

        return true;
    }


    public boolean isValidPassword(String password,ArrayList<User> userList) {
            if (password.length() < 7 || password.length() > 15) {
                return false;
            }
            if (!password.matches(".*[A-Z].*")) {
                return false;
            }
            if (!password.matches(".*[.,-_;].*")) {
                return false;
            }
        return true;
    }

    public User checkPassword(String password, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void changeEmail(Scanner scanner, String username, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                while (true) {
                    System.out.println("Mời bạn nhập email mới: ");
                    String newEmail = scanner.nextLine();
                    if (isValidEmail(newEmail,userList)) {
                        user.setEmail(newEmail);
                        System.out.println("Đã thay đổi email cho người dùng: " + username);
                        break;
                    } else {
                        System.out.println("Email không hợp lệ. Vui lòng nhập lại!");
                    }
                }
            }
        }
    }
    public void changeUsername(Scanner scanner, ArrayList<User> userList) {
        System.out.println("Mời bạn nhập username mới: ");
        String newUsername = scanner.nextLine();
        boolean isUsernameExists = false;
        for (User user : userList) {
            if (user.getUsername().equals(newUsername)) {
                isUsernameExists = true;
                break;
            }
        }
        while (isUsernameExists) {
            System.out.println("Tên người dùng đã tồn tại. Mời bạn nhập lại tên khác: ");
            newUsername = scanner.nextLine();
            isUsernameExists = false;
            for (User user : userList) {
                if (user.getUsername().equals(newUsername)) {
                    isUsernameExists = true;
                    break;
                }
            }
        }
        for (User user : userList) {
            user.setUsername(newUsername);
            System.out.println("Đã thay đổi username cho người dùng thành công!");
            break;
        }
//        for (User user : userList) {
//            if (user.getUsername().equals(newUsername)) {
//                System.out.println("Mời bạn đổi lại tên cho người dùng:");
//                newUsername = scanner.nextLine();
//            } else {
//                user.setUsername(newUsername);
//                System.out.println("Đã thay đổi username cho người dùng thành công!");
//                break;
//            }
//        }
    }

    public void changePassword(Scanner scanner, String username, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                while (true){
                    System.out.println("Mời bạn nhập password mới: ");
                    String newPassword = scanner.nextLine();
                    if (isValidPassword(newPassword,userList)){
                        user.setPassword(newPassword);
                        System.out.println("Đã thay đổi password cho người dùng: " + username);
                        break;
                    }else {
                        System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại!");
                    }
                }
            }
        }
    }
}