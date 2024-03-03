package service;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterService {

    public void registerAccount(Scanner scanner, ArrayList<User> userList,UserService userService) {
        System.out.println("Mời bạn nhập username: ");
        String newUsername = scanner.nextLine();
        System.out.println("Mời bạn nhập email: ");
        String newEmail = scanner.nextLine();
        System.out.println("Mời bạn nhập password: ");
        String newPassword = scanner.nextLine();
        if (userService.isValidUsername(newUsername, userList) && userService.isValidEmail(newEmail, userList) && userService.isValidPassword(newPassword, userList)) {
            userList.add(new User(newUsername, newEmail, newPassword));
            System.out.println("Chúc mừng bạn tạo thành công tài khoản mới!");
        }else
            System.out.println("Xin lỗi! Mời bạn tạo lại tài khoản mới!");
    }
}
