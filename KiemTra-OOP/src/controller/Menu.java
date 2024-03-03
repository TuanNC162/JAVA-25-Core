package controller;

import entities.User;
import service.FogotPass;
import service.LoginService;
import service.RegisterService;
import service.UserService;
import utils.Constant;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);
    public void displaylogin(ArrayList<User>userList, UserService userService) {
        int choose;
        do {
            System.out.println("========== Mời bạn lựa chọn =========");
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case Constant.DISPLAY_LOGIN_INPUT:
                    LoginService loginService = new LoginService();
                    loginService.loginAccount(SCANNER, userList, userService);
                case Constant.DISPLAY_REGISTER_INPUT:
                    RegisterService registerService = new RegisterService();
                    registerService.registerAccount(SCANNER, userList, userService);
                    displaylogin(userList, userService);
                    break;
            }
        }while (choose != 2);
    }

    public void displayloginAgain (ArrayList<User>userList, UserService userService) {
        int choose;
        do {
            System.out.println("========== Mời bạn lựa chọn =========");
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");
            LoginService loginService = new LoginService();
            FogotPass fogotPass = new FogotPass();
            choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case Constant.DISPLAY_LOGIN_AGAIN_INPUT:
                    loginService.loginAccount(SCANNER, userList, userService);
                    break;
                case Constant.DISPLAY_FOGOTPASS_INPUT:
                    boolean getPasswordSuccessful = fogotPass.fogotPass(SCANNER, userList, userService);
                    if (getPasswordSuccessful) {
                        displaylogin(userList, userService);
                    }
                    break;
            }
        }while (choose != 2) ;
    }

    public void displayloginWelcome(ArrayList<User> userList, String username, UserService userService) {
        int choose;
        do {
            System.out.println("Chào mừng " +username + "," + "bạn có thể thực hiện các công việc sau: ");
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose){
                case Constant.DISPLAY_CHANGE_USERNAME:
                    userService.changeUsername(SCANNER, username, userList);
                    System.out.println(userList);
                    break;

                case Constant.DISPLAY_CHANGE_EMAIL:
                    userService.changeEmail(SCANNER, username, userList);
                    System.out.println(userList);
                    break;
                case Constant.DISPLAY_CHANGE_PASSWORD:
                    userService.changePassword(SCANNER, username, userList);
                    System.out.println(userList);
                    break;
                case Constant.DISPLAY_LOGOUT_INPUT:
                    displaylogin(userList,userService);
                    break;
                case Constant.DISPLAY_EXIT_PROGRAM:
                    System.exit(0);
                    break;
            }
        } while (choose != 4);
    }
}
