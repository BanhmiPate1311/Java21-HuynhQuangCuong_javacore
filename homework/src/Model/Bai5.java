package Model;

import java.util.Scanner;

public class Bai5 {
    int x1;
    int x2;
    int y1;
    int y2;
    Scanner scanner = new Scanner(System.in);

    public Bai5() {
        System.out.println("Nhập tọa độ x1: ");
        this.x1 = scanner.nextInt();
        System.out.println("Nhập tọa độ x2: ");
        this.x2 = scanner.nextInt();
        System.out.println("Nhập tọa độ y1: ");
        this.y1 = scanner.nextInt();
        System.out.println("Nhập tọa độ y2: ");
        this.y2 = scanner.nextInt();
    }

    public void tinhDoDai(){
        double ketQua = Math.sqrt((Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2)));
        System.out.println("Độ dài đoạn thẳng là: " + ketQua);
    }
}
