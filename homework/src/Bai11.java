import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    public void lamBai11(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();

        // tính logarit cơ số 2 của n
        int log2n = (int) (Math.log(n) / Math.log(2));

        System.out.print("Số tự nhiên lớn nhất nhỏ hơn log2(n): " + (log2n - 1));
    }
}
