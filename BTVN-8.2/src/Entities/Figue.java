package Entities;

public class Figue {
    private String name;
    private String position;

    public Figue(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Figue{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
