import Entities.Figue;
import Entities.G2;
import Entities.SKT;
import Entities.SummonRift;
import Service.G2Service;
import Service.SKTService;
import Service.SummonRiftService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SummonRiftService summonRiftService = new SummonRiftService();
        summonRiftService.inputSummonRift(scanner);

    }
}
