package Model;

import java.util.Scanner;

public class Bai4 {
    public void tongCacChuSo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số tự nhiên:");
        int x = scanner.nextInt();
        int ketQua = 0;
        while (x != 0) {
            ketQua += x % 10;
            x = x / 10;
        }
        System.out.println("Tổng các chữ số là: " + ketQua);
    }
}
