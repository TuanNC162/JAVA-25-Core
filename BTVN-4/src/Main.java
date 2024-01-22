import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        //BTVN4-1
//        System.out.println("Mời bạn nhập số dòng: ");
//        int row = Integer.parseInt(scanner.nextLine());
//        System.out.println("Mời bạn nhập số cột: ");
//        int colum = Integer.parseInt(scanner.nextLine());
//        int [][] arr = new int[row][colum];
//        int sum = 0;
//
//
//        for (int i=0; i<row; i++) {
//            for (int j=0; j<colum; j++ ){
//                System.out.println("Nhập phần tử thứ " + (i+1) );
//                arr[i][j] = Integer.parseInt(scanner.nextLine());
//
//                if (arr[i][j]%3==0){
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//        System.out.println("Tổng các số chia hết cho 3 là: " +sum);



        //BTVN4-2

        System.out.println("Mời bạn nhập số dòng của ma trận A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số cột của ma trận A: ");
        int coluA = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số dòng của ma trận B: ");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số vột của ma trận B: ");
        int coluB = Integer.parseInt(scanner.nextLine());
        int [][] arrA = new int[rowA][coluA];
        int [][] arrB = new int[rowB][coluB];
        int [][] arrC = new int[rowA][coluA];

        if (rowA != rowB || coluA != coluB) {
            System.out.println("Không thế thực hiện được");
        } else {
            for (int i=0; i<rowA; i++) {
                for (int j = 0; j < coluA; j++) {
                    System.out.println("Nhập phần tử thứ " + (i + 1) + "ma trận A");
                    arrA[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            for (int i=0; i<rowB; i++) {
                for (int j = 0; j < coluB; j++) {
                    System.out.println("Nhập phần tử thứ " + (i + 1) + "ma trận B");
                    arrB[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            for (int i=0; i<rowA; i++) {
                for (int j = 0; j < coluA; j++) {
                    arrC[i][j] = arrA[i][j] + arrB[i][j];
                }
            }

            System.out.println("Ma trận C là: ");
            for (int i=0; i<rowA; i++) {
                for (int j = 0; j < coluA; j++) {

                    System.out.print(arrC[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
