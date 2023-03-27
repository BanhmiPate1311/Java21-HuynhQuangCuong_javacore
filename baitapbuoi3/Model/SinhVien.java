package Model;

import java.util.Scanner;

public class SinhVien {
    private String ten;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTrungBinh;
    private String xepLoai;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, int diemToan, int diemLy, int diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapThongtin() {
        System.out.println("Vui lòng nhập thông tin cho Sinh diên: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên Sinh diên: ");
        this.ten = scanner.nextLine();
        System.out.print("Tuoi Sinh diên: ");
        this.tuoi = scanner.nextInt();
        System.out.print("Điêm toán của Sinh diên: ");
        this.diemToan = scanner.nextDouble();
        System.out.print("Điểm Lý của Sinh diên: ");
        this.diemLy = scanner.nextDouble();
        System.out.print("Điểm Hóa của Sinh diên: ");
        this.diemHoa = scanner.nextDouble();
    }

    public void xuatTin() {
        System.out.print("Tên Sinh diên: " + this.ten);
        System.out.print("Tuổi Sinh diên: " + this.tuoi);
        System.out.print("Điểm toán của Sinh diên: " + this.diemToan);
        System.out.print("Điểm lý của Sinh diên: " + this.diemLy);
        System.out.print("Điểm hóa của Sinh diên: " + this.diemHoa);
        System.out.print("Xếp loại của Sinh diên: " + this.xepLoai);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void tinhTrungBinh() {
        this.diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
    }

    public void xepLoai() {
        if (diemTrungBinh >= 9) {
            this.xepLoai = "Giỏi";
        } else if (diemTrungBinh >=7) {
            this.xepLoai = "Khá";
        } else if (diemTrungBinh >= 4) {
            this.xepLoai = "Trung Bình";
        } else {
            this.xepLoai = "Yếu";
        }
    }
}
