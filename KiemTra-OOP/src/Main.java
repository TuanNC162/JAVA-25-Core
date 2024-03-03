import controller.Menu;
import entities.User;
import service.RegisterService;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ArrayList<User>userList = new ArrayList<>();
        userList.add(new User("Tuan", "tuan@gmail.com", "Tuan.123"));
        Menu menu = new Menu();
        menu.displaylogin(userList, userService);
    }
}
