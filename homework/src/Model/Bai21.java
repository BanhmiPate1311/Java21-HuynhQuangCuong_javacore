package Model;

import java.util.Scanner;

public class Bai21 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai21(){
        System.out.println("Chương trình ngồi xem 2 con kangaroo có gặp nhau hok :");
        System.out.print("Nhập vị trí xuất phát của kangaroo 1(phải lớn hơn 0 và nhỏ hơn vị trí của kan2): ");
        int x1 = scanner.nextInt();
        System.out.print("Nhập vị trí xuất phát của kangaroo 2(phải lớn hơn vị trí của kan1 và nhỏ hơn 10000: ");
        int x2 = scanner.nextInt();
        System.out.print("Nhập vận tốc của kangaroo 1: ");
        int v1 = scanner.nextInt();
        System.out.print("Nhập vận tốc của kangaroo 2(Phải lớn hơn vận tốc kan1): ");
        int v2 = scanner.nextInt();
        if (x1 >= 0 && x1 < x2 && x2 < 10000 && v1 > v2) {
            duDoan(x1, x2, v1, v2);
        } else {
            System.out.print("Nhập sai thông tin yêu cầu: ");
        }
    }

    public void duDoan(int x1, int x2, int v1, int v2) {
        while (x1 < x2){
            x1 += v1;
            x2 += v2;
        }
        if (x1 == x2) {
            System.out.print("2 con này có gặp nhau nha ");
        } else {
            System.out.print("2 con này không gặp nhau nha ");
        }
    }
}
