package Service;

import Entities.Figue;
import Entities.G2;
import java.util.ArrayList;
import java.util.Scanner;

public class G2Service {

    public ArrayList<Figue> inputInfoG2 (Scanner scanner) {
        System.out.println("Mời bạn nhập thông tin các tướng của đội G2: ");
        ArrayList<Figue> g2List = new ArrayList<>();
        FigueService figueService = new FigueService();
        g2List = figueService.saveFigue(scanner);

        return g2List;
    }
}
