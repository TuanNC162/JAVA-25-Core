public class Employee extends Person {

    private double experience;
    private String placeWork;



    public Employee(int id, String name, String address, int age, double experience, String placeWork) {
        super(id, name, address, age);
        this.experience = experience;
        this.placeWork = placeWork;

    }

    @Override
    public String toString() {

        return "Employee{" +
                "id='" + getId() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age='" + getAge() + '\'' +
                ", experience=" + experience +  '\'' +
                ", placeWork='" + placeWork + '\'' +

                '}';
    }
}
