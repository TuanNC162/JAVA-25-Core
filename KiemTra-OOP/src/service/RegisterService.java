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
        if (userService.isValidUsername(newUsername, userList) == null && userService.checkEmail(newEmail, userList) == null) {
            userList.add(new User(newUsername, newEmail, newPassword));
            System.out.println("Chúc mừng bạn tạo thành công tài khoản mới!");
        }else
            System.out.println("Tài khoản đã tồn tại, bạn hãy kiểm tra lại tài khoản hoặc email!");
    }
}
