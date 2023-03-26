package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
    int x;
    Scanner scanner = new Scanner(System.in);

    public Bai7() {
        System.out.println("Nhập vào 1 số: ");
        this.x = scanner.nextInt();
    }

    public void timUocSo(){
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                listNumber.add(i);
            }
        }
        System.out.println("Các ước số là: " );
        for (int number:listNumber) {
            System.out.print(number + " ");
        }
    }
}
