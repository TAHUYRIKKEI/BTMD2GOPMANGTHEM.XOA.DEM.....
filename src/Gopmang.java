import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println(" nhap so luong phan tu");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("nhap so can chen");
        int input_number = scanner.nextInt();
        System.out.println("nhap vi tri muon chen");
        int ichi = scanner.nextInt();
        if ((ichi < 0) || (ichi > array.length)) {
            System.out.println("khong the them");
        } else {
            array[ichi] = input_number;
            for (int i = 0; i < array.length; i++) {
                System.out.printf(array[i] + " ");
            }
        }

    }
}