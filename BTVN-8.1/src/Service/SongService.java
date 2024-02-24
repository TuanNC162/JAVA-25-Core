package Service;

import Entities.Songs;

import java.util.ArrayList;
import java.util.Scanner;

public class SongService {
    public Songs inputSong(Scanner scanner) {
        System.out.print("Nhập tên id bài hát: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tên ca sĩ: ");
        String singer = scanner.nextLine();
        return new Songs(id, name, singer);
    }
}
