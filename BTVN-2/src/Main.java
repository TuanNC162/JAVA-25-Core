import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime futureDateTime = nowDateTime.plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Thời gian hiện tại: " + nowDateTime.format(formatter));
        System.out.println("Thời gian sau 3 ngày: " + futureDateTime.format(formatter));
    }
}
