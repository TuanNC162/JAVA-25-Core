package Service;

import Entities.Figue;
import Entities.SKT;
import java.util.ArrayList;
import java.util.Scanner;

public class SKTService {
    public ArrayList<Figue>  inputInfoSKT (Scanner scanner) {
        System.out.println("Mời bạn nhập thông tin các tướng của đội SKT: ");
        ArrayList<Figue> sktList = new ArrayList<>();
        FigueService figueService = new FigueService();
        sktList = figueService.saveFigue(scanner);

        return sktList;
    }
}
