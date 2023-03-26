package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
    Scanner scanner = new Scanner(System.in);

    public void lamBai13() {
        List<Integer> arrNumber = nhapMang();
        tinhTrungBinh(arrNumber);
        minMax(arrNumber);
        minMaxNeg(arrNumber);
        minMaxPos(arrNumber);
        inChanLe(arrNumber);
        themPhanTu(arrNumber);
        xoaPhanTu(arrNumber);
    }

    public List<Integer> nhapMang() {
        System.out.print("Nhập vào số phần tử của mảng: ");
        int x = scanner.nextInt();
        List<Integer> arrNumber = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arrNumber.add(scanner.nextInt()) ;
        }
        return arrNumber;
    }

    public void tinhTrungBinh(List<Integer> arrNumber) {
        double tB = 0;
        for (int number:arrNumber) {
            tB +=number;
        }
        System.out.println("Trung bình là: " + tB/arrNumber.size());
    }

    public void minMax(List<Integer> arrNumber){
        int min = arrNumber.get(0);
        int max = arrNumber.get(0);
        for (int i = 1; i < arrNumber.size(); i++) {
            if (min > arrNumber.get(i)) {
                min = arrNumber.get(i);
            }
            if (max < arrNumber.get(i)) {
                max = arrNumber.get(i);
            }
        }
        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Số lớn nhất là: " + max);
    }

    public void minMaxNeg(List<Integer> arrNumber){
        int maxNeg = Integer.MIN_VALUE;
        int minNeg = Integer.MAX_VALUE;
        for (int i = 0; i < arrNumber.size(); i++) {
            if (arrNumber.get(i) < 0) {
                if (arrNumber.get(i) > maxNeg) {
                    maxNeg = arrNumber.get(i);
                }
                if (arrNumber.get(i) < minNeg) {
                    minNeg = arrNumber.get(i);
                }
            }
        }
        if (maxNeg == Integer.MIN_VALUE) {
            System.out.println("Không có phần tử âm trong mảng.");
        } else {
            System.out.println("Phần tử âm lớn nhất: " + maxNeg);
            System.out.println("Phần tử âm nhỏ nhất: " + minNeg);
        }
    }

    public void minMaxPos(List<Integer> arrNumber){
        int maxNeg = Integer.MIN_VALUE;
        int minNeg = Integer.MAX_VALUE;
        for (int i = 0; i < arrNumber.size(); i++) {
            if (arrNumber.get(i) > 0) {
                if (arrNumber.get(i) > maxNeg) {
                    maxNeg = arrNumber.get(i);
                }
                if (arrNumber.get(i) < minNeg) {
                    minNeg = arrNumber.get(i);
                }
            }
        }
        if (maxNeg == Integer.MIN_VALUE) {
            System.out.println("Không có phần tử dương trong mảng.");
        } else {
            System.out.println("Phần tử âm lớn nhất: " + maxNeg);
            System.out.println("Phần tử âm nhỏ nhất: " + minNeg);
        }
    }

    public void inChanLe(List<Integer> arrNumber) {
        List<Integer> soChan = new ArrayList<>();
        List<Integer> soLe = new ArrayList<>();
        for (int i : arrNumber) {
            if (i % 2 == 0) {
                soChan.add(i);
            } else {
                soLe.add(i);
            }
        }
        System.out.println("Số chẵn là: " + soChan);
        System.out.println("Số lẻ là: " + soLe);
    }

    public void themPhanTu(List<Integer> arrNumber){
        System.out.println("Nhập phần tử cần thêm: ");
        int pt = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int vt = scanner.nextInt();
        arrNumber.add(vt-1,pt);
        System.out.println("Mảng sau khi thêm: " + arrNumber);
    }

    public void xoaPhanTu(List<Integer> arrNumber){

        System.out.print("Nhập vị trí cần xóa: ");
        int vt = scanner.nextInt();
        arrNumber.remove(vt-1);
        System.out.println("Mảng sau khi xóa: " + arrNumber);
    }
}
