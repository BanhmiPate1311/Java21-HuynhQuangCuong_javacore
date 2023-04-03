package Model;

import java.util.List;

public class TruongPhong extends NhanSu {
    protected String loaiNhanVien = "TruongPhong";

    protected double luongMotNgay = 200;
    protected int soLuongNhanVien;

    public TruongPhong(int maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public void updateSoLuongNhanVien(int value) {
        this.soLuongNhanVien += value;
    }

    @Override
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    @Override
    public double tinhLuong() {
        return (soNgayLamViec * luongMotNgay + 100 * soLuongNhanVien);
    }


}
