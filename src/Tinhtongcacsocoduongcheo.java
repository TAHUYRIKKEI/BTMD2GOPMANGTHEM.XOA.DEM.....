import java.util.Scanner;

public class Tinhtongcacsocoduongcheo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int dongCot;
        int tong = 0;
        System.out.println("nhập vào số dòng và cột của ma trận vuông");
        dongCot = scanner.nextInt();
        int[][] array = new int[dongCot][dongCot];
        System.out.println("nhập các phần tử ma trận");
        for (int i = 0; i < dongCot; i++) {
            for (int j = 0; j < dongCot; j++) {
                System.out.println("array["+(i)+"]["+(j)+"] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dongCot; i++) {
            for (int j = 0; j < dongCot; j++) {
                if (i == j){
                    tong +=array[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo chính là: " + tong);
    }
}
