import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thành viên: ");
        int n = Integer.parseInt(sc.nextLine());

        Employee [] arrEmployee = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập ID của nhân viên " + (i+1) + ":" );
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập tên của nhân viên " + (i+1) + ":" );
            String name = sc.nextLine();
            System.out.println("Mời bạn nhập địa chỉ của nhân viên " + (i+1) + ":" );
            String address = sc.nextLine();
            System.out.println("Mời bạn nhập tuổi của nhân viên " + (i+1) + ":" );
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập kinh nghiệm làm việc của nhân viên " + (i+1) + ":" );
            double experience = Double.parseDouble(sc.nextLine());
            System.out.println("Mời bạn nhập nơi làm việc của nhân viên " + (i+1) + ":" );
            String placeWork = sc.nextLine();
            arrEmployee [i] = new Employee (id, name, address, age, experience, placeWork);
        }

        for (Employee employee : arrEmployee) {
            System.out.println(employee);
        }

    }
}
