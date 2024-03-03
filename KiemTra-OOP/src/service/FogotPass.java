package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FogotPass {
    public boolean fogotPass(Scanner scanner, ArrayList<User> userList, UserService userService) {
            System.out.println("Nhập email: ");
            String email = scanner.nextLine();
            for (User user : userList) {
                if (user.getEmail().equals(email)) {
                    boolean check;
                    do {
                        System.out.println("Nhập mật khẩu mới: ");
                        String newPassword = scanner.nextLine();
                        check = userService.isValidPassword(newPassword,userList);
                        if (check){
                            user.setPassword(newPassword);
                            System.out.println("Đổi mật khẩu thành công!");
                            return true;
                        } else {
                            System.out.println("Passwword sai định dạng, mời bạn nhập lại passwword");
                        }
                    }while (!check);

                } else {
                    System.out.println("Email không đúng. Chưa tồn tại tài khoản.");
                    return false;
                }
            }
        return true;
    }
}
