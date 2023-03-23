import java.util.Scanner;

public class Bai2 {
    public void doiNhiPhan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số thập phân: ");
        int x = scanner.nextInt();
        int temp = 0;
        int ketQua = 0;
        while (x != 0) {
            ketQua += x % 2 * Math.pow(10, temp);
            x = x / 2;
            temp++;
            System.out.println("Số x: " + x);
        }

        System.out.println("Số nhị phân: " + ketQua);
    }
}
