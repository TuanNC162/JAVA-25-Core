package service;

import controller.Menu;
import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService {
    public void loginAccount(Scanner scanner, ArrayList<User> userList, UserService userService) {
        Menu menu = new Menu();
        String username;
        User userCheck;
        do {
            System.out.println("Mời bạn nhập username: ");
            username = scanner.nextLine();
            System.out.println("Mời bạn nhập password: ");
            String password = scanner.nextLine();
            userCheck = userService.isValidUsername(username,userList);

            if (userCheck == null) {
                System.out.println("Kiểm tra lại username!");
                menu.displaylogin(userList, userService);
                continue;
            }
            if (userCheck.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công");
                menu.displayloginWelcome(userList, username, userService);
            } else {
                System.out.println("Mật khẩu không đúng!");
                menu.displayloginAgain(userList, userService);
            }
        } while (userCheck == null);
    }

}
