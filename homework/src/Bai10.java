import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public void inSoNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        System.out.println("Nhập số tự nhiên(số dương): ");
        int x = scanner.nextInt();
        for (int i = 2; i <= x; i++) {
            boolean kiemTra = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    kiemTra = false;
                }
            }
            if(kiemTra){
                listNumber.add(i);
            }
        }
        System.out.println("Số nguyên tố là: " + listNumber);
    }
}
