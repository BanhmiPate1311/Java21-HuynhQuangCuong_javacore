package Model;

import java.util.Scanner;

public class Bai9 {
    public void kiemTraHaiSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int y = scanner.nextInt();

        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            // Lấy số hàng chục và hàng đơn vị
            int x1 = x / 10;
            int x2 = x % 10;
            int y1 = y / 10;
            int y2 = y % 10;

            if (x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        } else {
            System.out.println("Dzui lòng nhập số có 2 chữ số nhá");
        }


    }
}
