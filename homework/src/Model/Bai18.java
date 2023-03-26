package Model;

import java.util.Scanner;

public class Bai18 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai18() {
        // Nhập số tiền của anh X
        System.out.print("Nhập số tiền mà anh X gửi: ");
        double x = scanner.nextInt();
        // Nhập số tiền anh X muốn có
        System.out.print("Nhập số tiền mà anh X muốn có: ");
        double y = scanner.nextInt();
        // Nhập lãi suất ngân hòn
        System.out.print("Nhập lãi suất: ");
        double z = scanner.nextDouble();

    }

    public void tinhSoNam(double x, double y, double z) {
        int nam = 0;
        while (x < y) {
            x += x * z;
            nam++;
        }
        System.out.print("Số năm chờ đợi là: " + nam);
    }
}

