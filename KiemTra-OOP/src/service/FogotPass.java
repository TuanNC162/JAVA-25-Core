package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FogotPass {
//    public boolean forgotPass(Scanner scanner, ArrayList<User> userList, UserService userService) {
//            System.out.println("Nhập email: ");
//            String email = scanner.nextLine();
//            for (User user : userList) {
//                if (user.getEmail().equals(email)) {
//                    boolean check;
//                    do {
//                        System.out.println("Nhập mật khẩu mới: ");
//                        String newPassword = scanner.nextLine();
//                        check = userService.isValidPassword(newPassword,userList);
//                        if (check){
//                            user.setPassword(newPassword);
//                            System.out.println("Đổi mật khẩu thành công!");
//                            return true;
//                        } else {
//                            System.out.println("Passwword sai định dạng, mời bạn nhập lại passwword!");
//                        }
//                    }while (!check);
//                } else {
//                    System.out.println("Email không đúng với tài khoản!");
//                    break;
//                }
//            }
//        return true;
//    }

    public User passwordChange (Scanner scanner, String newPassword, UserService userService) {
        System.out.print("Enter your new password: ");
        newPassword = scanner.nextLine();

        if(user.getPassword().equals(newPassword))
            System.out.println("Please enter another password...");
        else {
            if(userService.isValidPassword(newPassword)){
                user.setPassword(newPassword);
                System.out.println("You are change password change successfully");
            } else
                System.out.println("Please enter a password from 7 to 15 characters, containing at least 1 capital letter, 1 special character");
        }
    }

    public void forgotPassword(Scanner scanner, User user) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if(user.getEmail().equals(email)) {
            passwordChange(scanner, user);
        } else {
            System.out.println("Email no exist. Please register new an account");
        }
    }
}

}
