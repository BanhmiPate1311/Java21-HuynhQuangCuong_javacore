package Model;

import java.util.Scanner;

public class Bai19 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai19() {
        System.out.println("Chương trình giải phương trình bậc 1 và bậc 2:");
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("0. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        } else if (choice == 1) {
            System.out.println("Bạn đã chọn giải phương trình bậc 1");
            giaiPTBac1();
        } else if (choice == 2) {
            System.out.println("Bạn đã chọn giải phương trình bậc 2");
            giaiPTBac2();
        } else {
            System.out.println("Đây không phải phương trình bậc 1 hoặc 2.");
        }
    }

    public void giaiPTBac1() {
        // Nhập hệ số a và b
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        // Giải phương trình bậc 1
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất x = " + x);
        }
    }

    public void giaiPTBac2() {
        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Giải phương trình bậc 2
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
