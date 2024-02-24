package Service;

import Entities.Figue;
import Entities.G2;
import Entities.SKT;
import Entities.SummonRift;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {

    public void inputSummonRift (Scanner scanner) {
        System.out.println("Mời bạn nhập thời gian bắt đầu trận đấu: ");
        String timeString = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
        G2Service g2Service = new G2Service();
        ArrayList<Figue> g2Team = g2Service.inputInfoG2(scanner);
        SKTService sktService = new SKTService();
        ArrayList<Figue> sktTeam = sktService.inputInfoSKT(scanner);

        SummonRift summonRift =  new SummonRift(time, g2Team, sktTeam);

        System.out.println(summonRift);
    }
}
