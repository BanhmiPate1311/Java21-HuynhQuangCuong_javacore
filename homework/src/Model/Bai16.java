package Model;

import java.util.Scanner;

public class Bai16 {

    public void lamBai16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int y = scanner.nextInt();
        kiemTraNamNhuan(y);
    }



    public void kiemTraNamNhuan(int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            System.out.print("Năm " + nam + " là năm nhuận nhá!");
        } else {
            System.out.print("Năm " + nam + " không phải là năm nhuận nhá!");
        }
    }


}
