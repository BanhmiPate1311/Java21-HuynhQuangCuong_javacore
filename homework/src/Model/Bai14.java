package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
    public void lamBai14(){
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        // Nhập từng phần tử của mảng
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();

            // Kiểm tra xem phần tử đã tồn tại trong mảng chưa
            if (!arr.contains(x)) {
                arr.add(x);
            }
        }

        // In ra mảng sau khi loại bỏ các phần tử bị lặp lại
        System.out.println("Mảng sau khi loại bỏ các phần tử bị lặp lại:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
