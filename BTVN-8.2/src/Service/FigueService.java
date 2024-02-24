package Service;

import Entities.Figue;
import Entities.G2;

import java.util.ArrayList;
import java.util.Scanner;

public class FigueService {

    public Figue inputInfoFigue (Scanner scanner) {
        System.out.println("Mời bạn nhập tên tướng: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập vị trí của vị tướng: ");
        String position = scanner.nextLine();
        return new Figue(name, position);
    }

    public ArrayList<Figue> saveFigue (Scanner scanner){
        ArrayList<Figue> figueList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Tướng thứ: " +(i+1));
            Figue summonRift = inputInfoFigue(scanner);
            figueList.add(summonRift);
        }
        return figueList;
    }
}
