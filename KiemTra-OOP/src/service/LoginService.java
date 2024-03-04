package service;

import controller.Menu;
import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService {
    public void loginAccount(Scanner scanner, ArrayList<User> userList, UserService userService) {
        boolean isValid = false;
        Menu menu = new Menu();
        String username;
        String password;
        do {
            System.out.println("Mời bạn nhập username: ");
            username = scanner.nextLine();
            System.out.println("Mời bạn nhập password: ");
            password = scanner.nextLine();

            if (userService.isValidUsername(username, userList)) {
                System.out.println("Kiểm tra lại username!");
                menu.displaylogin(userList, userService);
                continue;
            }
            if (userService.checkPassword(password, userList)) {
                System.out.println("Mật khẩu không đúng!");
                menu.displayloginAgain(userList, userService);
            }
            isValid = true;
        } while (!isValid);
        menu.displayloginWelcome(userList, username, userService);
    }
}
