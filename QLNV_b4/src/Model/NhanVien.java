package Model;

public class NhanVien extends NhanSu {
    protected String loaiNhanVien = "NhanVien";
    protected double luongMotNgay = 100;
    protected TruongPhong truongPhong;


    public NhanVien(int maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
    }

    @Override
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public TruongPhong getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(TruongPhong truongPhong) {
        this.truongPhong = truongPhong;
    }

    @Override
    public double tinhLuong() {
        return (soNgayLamViec * luongMotNgay);
    }
}
