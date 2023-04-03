package Model;

public class CongTy {
    private String tenCongTy;
    private int maSoThue;
    private double doanhThuThang;

    public CongTy() {
    }

    public CongTy(String tenCongTy, int maSoThue, double doanhThuThang) {
        this.tenCongTy = tenCongTy;
        this.maSoThue = maSoThue;
        this.doanhThuThang = doanhThuThang;
    }

    public String gettenCongTy() {
        return tenCongTy;
    }

    public void settenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public int getmaSoThue() {
        return maSoThue;
    }

    public void setmaSoThue(int maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getdoanhThuThang() {
        return doanhThuThang;
    }

    public void setdoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }
}
