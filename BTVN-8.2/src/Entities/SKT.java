package Entities;

import java.util.ArrayList;

public class SKT{
    private ArrayList<Figue> sktList;

    public SKT(ArrayList<Figue> sktList) {
        this.sktList = sktList;
    }

    public ArrayList<Figue> getSktList() {
        return sktList;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "sktList=" + sktList +
                '}';
    }
}
