package Entities;

import java.util.ArrayList;

public class Idols {
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers ;
    private String group;

    public Idols(String name, int id, String email, ArrayList<Follower> followers, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
