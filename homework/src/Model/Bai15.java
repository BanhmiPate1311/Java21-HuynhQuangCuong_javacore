package Model;

import java.util.Scanner;

public class Bai15 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai15() {
        // Nhập vào một chuỗi
        System.out.print("Nhập vào một chuỗi: ");
        String s = scanner.nextLine();
        inDoDaiChuoi(s);
        inKyTu(s);
        kiemTraChuoi(s);
    }
    public void inDoDaiChuoi(String s){
        System.out.println("Độ dài của chuỗi là: " + s.length());
    }

    public void inKyTu(String s){
        System.out.print("Nhập vị trí muốn in: ");
        int index = scanner.nextInt();
        System.out.println("Ký tự tại vị trí " + index +" là: " + s.charAt(index-1));
    }

    public void kiemTraChuoi(String s){
        if (s.contains("abcdef")) {
            System.out.print("Trong chuỗi có chứa chuỗi phụ 'abcdef'");
        } else {
            System.out.print("Trong chuỗi không chứa chuỗi phụ 'abcdef'");
        }

    }

}
