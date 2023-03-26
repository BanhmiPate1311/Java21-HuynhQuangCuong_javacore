package Model;

import java.util.Scanner;

public class Bai6 {
    String s;

    Scanner scanner = new Scanner(System.in);

    public Bai6() {
        System.out.println("Nhập vào 1 chuỗi: ");
        this.s = scanner.nextLine();

    }

    public void chuoiDaoNguoc(){
        String ch = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ch +=s.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược là: " + ch);
    }
}
