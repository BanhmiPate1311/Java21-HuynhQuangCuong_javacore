package Model;

import java.util.Random;
import java.util.Scanner;

public class Bai17 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai17() {
        // Tạo ra số ngẫu nhiên
        Random random = new Random();
        int randomnumber = random.nextInt(1000) + 1;
//        System.out.println("Số bí mật: " + randomnumber);
        game(randomnumber);
    }

    public void game(int random) {
        // Nhập số do người dùng đoán
        System.out.print("Hãy đoán số bí mật: ");
        int x = scanner.nextInt();
        if (x == random){
            System.out.println("EndGame");
        } else if (x > random) {
            System.out.println("Số bí mật nhỏ hơn");
        } else {
            System.out.println("Số bí mật lớn hơn");
        }
    }
}
