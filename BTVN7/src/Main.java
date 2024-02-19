import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập tổng số sinh viên của Techmaster: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0);
        SinhVienTechMaster [] sinhVienList = new SinhVienTechMaster[n];
        for (int i =0; i< n; i++){
            int select;
            do {
                System.out.println("Mời bạn lựa chọn: ");
                System.out.println("1. SinhVienIT");
                System.out.println("2. SinhVienBIZ");
                select = Integer.parseInt(scanner.nextLine());
            } while (select <1 || select >2);
            switch (select){
                case 1:
                    System.out.println("Họ và tên: ");
                    String nameIT = scanner.nextLine();
                    System.out.println("Điểm JAVA: ");
                    double java = Double.parseDouble(scanner.nextLine());
                    System.out.println("Điểm HTML: ");
                    double html = Double.parseDouble(scanner.nextLine());
                    System.out.println("Điểm CSS: ");
                    double css = Double.parseDouble(scanner.nextLine());
                    SinhVienIT sinhVienIT = new SinhVienIT(nameIT, "IT", java, html, css);
                    sinhVienList [i] = new SinhVienIT(nameIT, "IT", java, html, css);
                    break;
                case 2:
                    System.out.println("Họ và tên: ");
                    String nameBiz = scanner.nextLine();
                    System.out.println("Điểm MARKETING: ");
                    double marketing = Double.parseDouble(scanner.nextLine());
                    System.out.println("Điểm SALES: ");
                    double sales = Double.parseDouble(scanner.nextLine());
                    SinhVienBIZ sinhVienBIZ = new SinhVienBIZ(nameBiz, "BIZ", marketing, sales);
                    sinhVienList [i] = new SinhVienBIZ(nameBiz, "BIZ", marketing, sales);
                    break;
                default:
                    System.out.println("Mời nhập lại: ");
                    break;
            }
        }
        for (SinhVienTechMaster sinhVienTechMaster: sinhVienList){
            System.out.println(sinhVienTechMaster);
            System.out.println("Điểm trung bình là: " +sinhVienTechMaster.getDiem());
            System.out.println(sinhVienTechMaster.getHocLuc());
            System.out.println("==========================");
        }
    }
}
