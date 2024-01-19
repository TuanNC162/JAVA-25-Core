import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập số a= ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số b= ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập phép toán muốn thực hiện: ");
        String calu = scanner.nextLine();

        switch (calu){
            case "+":
                System.out.println("a + b = " +(a+b));
                break;
            case "-":
                System.out.println("a - b = " +(a-b));
                break;
            case "*":
                System.out.println("a * b = " +(a*b));
                break;
            case "/":
                System.out.println("a / b = " +(a/b));
                break;
            case "%":
                System.out.println("a % b = " +(a%b));
                break;
            default:
                System.out.println("Hết rồi");
        }












    }
}
