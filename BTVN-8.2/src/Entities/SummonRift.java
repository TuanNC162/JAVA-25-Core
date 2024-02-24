package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SummonRift {
    private LocalTime time;
    private ArrayList<Figue> g2List;
    private ArrayList<Figue> sktList;

    public SummonRift(LocalTime time, ArrayList<Figue> g2List, ArrayList<Figue> sktList) {
        this.time = time;
        this.g2List = g2List;
        this.sktList = sktList;
    }

    public LocalTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "SummonRift{" +
                "time=" + time +
                ", g2List=" + g2List +
                ", sktList=" + sktList +
                '}';
    }
}
