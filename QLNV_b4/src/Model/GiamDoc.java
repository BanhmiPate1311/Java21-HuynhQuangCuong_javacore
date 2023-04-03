package Model;

public class GiamDoc extends NhanSu {
    protected String loaiNhanVien = "GiamDoc";
    protected double luongMotNgay = 300;
    protected double coPhan;

    public GiamDoc(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.coPhan = coPhan;
    }

    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }

    @Override
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    @Override
    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    @Override
    public double tinhLuong() {
        return (soNgayLamViec * luongMotNgay);
    }
}
