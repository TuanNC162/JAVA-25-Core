import entity.FoodItem;
import entity.Movie;
import entity.Showtimes;
import entity.User;
import service.FoodItemService;
import service.MenuManagement;
import service.MovieService;
import service.UserService;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        MenuManagement menuManagement = new MenuManagement();
//        menuManagement.logInAndCreateAccount();
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalTime a = LocalTime.parse("17:30:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
//        ObjectOutputStream writeFile123 = new ObjectOutputStream(new FileOutputStream("huy.data"));
//        writeFile123.writeObject(a);
//        writeFile123.close();

        ObjectInputStream readFile = null;
        try {
            readFile = new ObjectInputStream(new FileInputStream("huy.data"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            LocalTime b = (LocalTime) readFile.readObject();
            System.out.println("aaaa");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
