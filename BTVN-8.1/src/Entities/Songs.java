package Entities;

import java.util.ArrayList;

public class Songs {
    private int id;
    private String name;
    private String singer;

    public Songs(int id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
