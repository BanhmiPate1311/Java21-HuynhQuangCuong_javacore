package Main;

import Model.*;


import java.util.*;

import static java.lang.System.out;

public class QuanLyNhanSu {
    Scanner scanner = new Scanner(System.in);

    public CongTy inputCompanyInfo() {
        out.print("Vui lòng nhập tên công ty: ");
        String name = scanner.nextLine();
        out.print("Vui lòng nhập mã số thuế: ");
        int maSoThue = scanner.nextInt();
        scanner.nextLine();
        out.print("Vui lòng nhập doanh thu tháng: ");
        double doanhThuThang = scanner.nextDouble();
        scanner.nextLine();
        return (new CongTy(name,maSoThue,doanhThuThang));
    }

    public int timIndex(ArrayList<NhanSu> danhSachNhanVien, int maNV) {
        int index = -1;
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getMaSo() == maNV) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void assignEmployeeToManager(ArrayList<NhanSu> danhSachNhanVien) {
        out.print("Vui lòng nhập mã số Nhân viên: ");
        int maNV = scanner.nextInt();
        scanner.nextLine();
        int indexNV = timIndex(danhSachNhanVien,maNV);
        if (indexNV == -1) {
            out.println("Không tìm thấy nhân viên này ");
            return;
        }

        String loaiNhanVien = danhSachNhanVien.get(indexNV).getLoaiNhanVien();
        if (!Objects.equals(loaiNhanVien, "NhanVien")) {
            out.println("Nhỏ này là " + loaiNhanVien + " không thể phân bổ vào Trưởng phòng được nhá");
        } else {
            out.println("Tìm Trưởng phòng trong danh sách ");
            out.print("Vui lòng nhập mã số Trưởng phòng: ");
            int maTP = scanner.nextInt();
            scanner.nextLine();
            int indexTP = timIndex(danhSachNhanVien,maTP);
            if (indexTP == -1) {
                out.println("Không tìm thấy nhỏ Trưởng Phòng này ");
                return;
            }
            // Thêm Truong Phong vào nhân viên
            NhanVien nhanVien = (NhanVien) danhSachNhanVien.get(indexNV);
            TruongPhong truongPhong = (TruongPhong) danhSachNhanVien.get(indexTP);
            nhanVien.setTruongPhong(truongPhong);
            truongPhong.updateSoLuongNhanVien(1);
            out.println("Okela Đã phân bổ thành công dồi nha ");
        }
    }

    public void updateEmployeeInfo(ArrayList<NhanSu> danhSachNhanVien) {
        out.format("+-----+--------------------------------------------------------------+%n");
        out.format("| %-3s | %-60s |%n", "STT", "Nội dung");
        out.format("+-----+--------------------------------------------------------------+%n");
        out.format("| %-3s | %-60s |%n", " 1", "Thêm Nhân Viên");
        out.format("| %-3s | %-60s |%n", " 2", "Thêm Trưởng Phòng");
        out.format("| %-3s | %-60s |%n", " 3", "Thêm Giám Đốc");
        out.format("| %-3s | %-60s |%n", " 4", "Xóa Trưởng Phòng");
        out.format("| %-3s | %-60s |%n", " 0", "Thoát");
        out.format("+-----+--------------------------------------------------------------+%n");
        out.print("Bạn hãy chọn chức năng cần thực hiện: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
            case 2:
            case 3:
                themNhanSu(danhSachNhanVien,choice);
                break;
            case 4:
                xoaNhanVien(danhSachNhanVien);
                break;
            default:
                out.println("Vê lại menu chính");
                break;
        }
    }

    public void themNhanSu(ArrayList<NhanSu> danhSachNhanVien, int choice) {
        // Khởi tạo các thông số của nhân viên
        // Kiểm tra mã số người dùng nhập đã tồn tại hay chưa
        int maSo;
        int kiemtra ;
        do {
            out.print("Vui lòng nhập mã số: ");
            maSo = scanner.nextInt();
            scanner.nextLine();
            kiemtra = timIndex(danhSachNhanVien,maSo);
            if (kiemtra != -1) {
                out.println("Mã số đã tồn tại, vui lòng nhập lại");
            }
        } while (kiemtra != -1);

        out.print("Vui lòng nhập họ tên: ");
        String hoten = scanner.nextLine();

        out.print("Vui lòng nhập số điện thoại: ");
        String soDT = scanner.nextLine();

        out.print("Vui lòng nhập số ngày làm: ");
        int soNgayLam = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:{
                out.println("Bạn đã chọn thêm nhân viên: ");
                NhanSu nhanVien = new NhanVien(maSo,hoten,soDT,soNgayLam);
                danhSachNhanVien.add(nhanVien);
            }
            break;
            case 3:{
                out.println("Bạn đã chọn thêm trưởng phòng: ");
                NhanSu truongPhong = new TruongPhong(maSo,hoten,soDT,soNgayLam);
                danhSachNhanVien.add(truongPhong);
            }
            break;
            case 5:{
                out.println("Bạn đã chọn thêm giám đốc: ");
                out.print("Vui lòng nhập số cổ phần: ");
                double coPhan = scanner.nextInt();
                scanner.nextLine();
                NhanSu giamDoc = new GiamDoc(maSo,hoten,soDT,soNgayLam,coPhan);
                danhSachNhanVien.add(giamDoc);
            }
        }
    }

    public void xoaNhanVien(ArrayList<NhanSu> danhSachNhanVien) {
        out.print("Vui lòng nhập mã số nhân viên muốn xóa: ");
        int maSo = scanner.nextInt();
        scanner.nextLine();
        int indexNV = timIndex(danhSachNhanVien, maSo);
        if (indexNV == -1) {
            out.println("Không tìm thấy nhân viên này ");
            return;
        }
        String loaiNhanVien = danhSachNhanVien.get(indexNV).getLoaiNhanVien();
        switch (loaiNhanVien) {
            case "TruongPhong":{
                // Ngắt liên kết giữa nhân viên với trưởng phòng
                for (NhanSu nv:
                        danhSachNhanVien) {
                    NhanVien nhanVien = (NhanVien) nv;
                    if (nhanVien.getTruongPhong().getMaSo() == maSo) {
                        nhanVien.setTruongPhong(null);
                    }
                }

                // remove Truong Phong ra khỏi danh sách
                danhSachNhanVien.removeIf(nv -> nv.getMaSo() == maSo);
                out.println("Đã xóa thành công");
            }
            break;
            case "NhanVien":{
                NhanVien nhanVien = (NhanVien) danhSachNhanVien.get(indexNV);
                if (nhanVien.getTruongPhong() != null) {
                    int maTP = nhanVien.getTruongPhong().getMaSo();
                    int indexTP = timIndex(danhSachNhanVien,maTP);
                    TruongPhong truongPhong = (TruongPhong) danhSachNhanVien.get(indexTP);
                    truongPhong.updateSoLuongNhanVien(-1);
                }
                danhSachNhanVien.removeIf(nv -> nv.getMaSo() == maSo);
                out.println("Đã xóa thành công");
            }
            break;
            case "GiamDoc":{
                danhSachNhanVien.removeIf(nv -> nv.getMaSo() == maSo);
                out.println("Đã xóa thành công");
            }
        }
    }

    public void displayAllEmployees(ArrayList<NhanSu> danhSachNhanVien) {
        out.format("+-------+-----------------------+------------------+---------------+-------------+----------+-----------------+-----------+-----------+%n");
        out.format("| %-5s | %-21s | %-16s | %-13s | %-11s | %-8s | %-15s | %-9s | %-9s |%n", "Mã Số", "Họ tên", "Loại nhân viên", "Số điện thoại","Số ngày làm","Lương","ID Trưởng Phòng","Số NV QL", "Cổ Phần");
        out.format("+-------+-----------------------+------------------+---------------+-------------+----------+-----------------+-----------+-----------+%n");

        double tongluong = displayTotalSalary(danhSachNhanVien);

        for (NhanSu nv : danhSachNhanVien) {
            Integer truongPhongId = null;
            if(nv instanceof NhanVien && (((NhanVien) nv).getTruongPhong() != null) ){
                truongPhongId = ((NhanVien) nv).getTruongPhong().getMaSo();
            }
            int nvQL = 0;
            if (nv instanceof TruongPhong) {
                nvQL = ((TruongPhong) nv).getSoLuongNhanVien();
            }
            Double coPhan = null;
            if (nv instanceof GiamDoc) {
                coPhan = ((GiamDoc) nv).getCoPhan();
            }

            out.format("| %-5s | %-21s | %-16s | %-13s | %-11s | %-8s | %-15s | %-9s | %-9s |%n","  " + nv.getMaSo(), nv.getHoTen(), nv.getLoaiNhanVien(), nv.getSoDienThoai(), nv.getSoNgayLamViec(),nv.tinhLuong(), truongPhongId != null ? truongPhongId : "",nvQL != 0 ? nvQL : "", coPhan != null ? coPhan : "");
        }
        out.format("+-------+-----------------------+------------------+---------------+-------------+----------+-----------------+-----------+-----------+%n");
        out.format("| %-5s | %-21s | %-16s | %-13s | %-11s | %-8s | %-15s | %-9s | %-9s |%n","", "", "", "", "Tổng Lương",tongluong, "","","");
        out.format("+-------+-----------------------+------------------+---------------+-------------+----------+-----------------+-----------+-----------+%n");
        out.println("");
    }

    public interface NhanSuFunction<T> {
        T apply(NhanSu nv);
    }

    public static double timLuongCaoNhat(ArrayList<NhanSu> danhSachNhanVien, NhanSuFunction<Double> function) {
        double maxLuong = function.apply(danhSachNhanVien.get(0));
        for (int i = 1; i < danhSachNhanVien.size(); i++) {
            if (function.apply(danhSachNhanVien.get(i)) > maxLuong) {
                maxLuong = function.apply(danhSachNhanVien.get(i));
            }
        }
        return maxLuong;
    }

//    public int timMaxNV(ArrayList<TruongPhong> danhSachNhanVien, NhanSuFunction<Integer> function) {
//        int maxNV = function.apply(danhSachNhanVien.get(0));
//        for (int i = 1; i < danhSachNhanVien.size(); i++) {
//            if (function.apply(danhSachNhanVien.get(i)) > maxNV) {
//                maxNV = function.apply(danhSachNhanVien.get(i));
//            }
//        }
//        return maxNV;
//    }

//    public static <T extends NhanSu & Comparable<T>> T timMaxmung(ArrayList<NhanSu> danhSachNhanVien, NhanSuFunction<T> function) {
//        T max = function.apply(danhSachNhanVien.get(0));
//        for (int i = 1; i < danhSachNhanVien.size(); i++) {
//            T value = function.apply(danhSachNhanVien.get(i));
//            if (value.compareTo(max) > 0) {
//                max = value;
//            }
//        }
//        return max;
//    }

//    public double timMax(ArrayList<NhanSu> danhSachNhanVien){
//        double maxLuong = danhSachNhanVien.get(0).tinhLuong();
//        for (int i = 1; i < danhSachNhanVien.size(); i++) {
//            if (danhSachNhanVien.get(i).tinhLuong() > maxLuong) {
//                maxLuong = danhSachNhanVien.get(i).tinhLuong();
//            }
//        }
//        return maxLuong;
//    }

    public int timTPNhieuNV(ArrayList<NhanSu> danhSachTruongPhong) {
        int maxNV =((TruongPhong) danhSachTruongPhong.get(0)).getSoLuongNhanVien();
        out.println("maxNV " + maxNV);
        ArrayList<NhanSu> danhSachTPNhieuNV = new ArrayList<>();
        for (NhanSu nv:danhSachTruongPhong) {
            if (((TruongPhong) nv).getSoLuongNhanVien() == maxNV) {
                danhSachTPNhieuNV.add(nv);
            }
        }
        return maxNV;
    }

    public ArrayList<NhanSu> locDanhSach(ArrayList<NhanSu> danhSachNhanVien,String type) {
        ArrayList<NhanSu> danhSachNV = new ArrayList<>();
        for (NhanSu nv:danhSachNhanVien) {
            if (nv.getLoaiNhanVien().equals(type)) {
                danhSachNV.add(nv);
            }
        }
        return danhSachNV;
    }

    public void findEmployeeWithHighestSalary(ArrayList<NhanSu> danhSachNhanVien) {
        String type="NhanVien";
        ArrayList<NhanSu> danhSachNVThuong = locDanhSach(danhSachNhanVien,type);
        double maxLuong = timLuongCaoNhat(danhSachNVThuong,nv -> nv.tinhLuong());
        ArrayList<NhanSu> danhSachLuongCaoNhat = new ArrayList<>();
        for (NhanSu nv:danhSachNhanVien) {
            if (nv.tinhLuong() == maxLuong) {
                danhSachLuongCaoNhat.add(nv);
            }
        }
        out.println("Danh sách " + type + " có lương cao nhất");
        displayAllEmployees(danhSachLuongCaoNhat);
    }

    public void findManagerWithMostEmployees(ArrayList<NhanSu> danhSachNhanVien) {
        String type="TruongPhong";
        ArrayList<NhanSu> danhSachTruongPhong = locDanhSach(danhSachNhanVien,type);
        int maxNV = timTPNhieuNV(danhSachTruongPhong);
        ArrayList<NhanSu> danhSachTruongPhongMaxNV = new ArrayList<>();
        for (NhanSu tp:danhSachTruongPhong) {
            if (((TruongPhong) tp).getSoLuongNhanVien() == maxNV) {
                danhSachTruongPhongMaxNV.add(tp);
            }
        }
        out.println("Danh sách " + type + " có lương cao nhất");
        displayAllEmployees(danhSachTruongPhongMaxNV);

//        int test = timMaxNV( danhSachTruongPhongTyped,nv -> ((TruongPhong) nv).getSoLuongNhanVien());
    }

//    public static void sapXepTheoHoTen(ArrayList<NhanSu> danhSachNhanVien) {
//        Comparator<NhanSu> comparator = new Comparator<NhanSu>() {
//            public int compare(NhanSu ns1, NhanSu ns2) {
//                return ns1.getHoTen().compareTo(ns2.getHoTen());
//            }
//        };
//        Collections.sort(danhSachNhanVien, comparator);
//    }

    public void sortEmployeesByNameASC(ArrayList<NhanSu> danhSachNhanVien) {
        Collections.sort(danhSachNhanVien, Comparator.comparing(NhanSu::getHoTen));
        displayAllEmployees(danhSachNhanVien);
    }

    public void sortEmployeesByNameDESC(ArrayList<NhanSu> danhSachNhanVien) {
        Collections.sort(danhSachNhanVien, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu nv1, NhanSu nv2) {
                return nv2.getHoTen().compareTo(nv1.getHoTen());
            }
        });
        displayAllEmployees(danhSachNhanVien);
    }

    public void sortEmployeesBySalaryASC(ArrayList<NhanSu> danhSachNhanVien) {
        Collections.sort(danhSachNhanVien, Comparator.comparing(NhanSu::tinhLuong));
        displayAllEmployees(danhSachNhanVien);
    }

    public void sortEmployeesBySalaryDESC(ArrayList<NhanSu> danhSachNhanVien) {
        Collections.sort(danhSachNhanVien, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu nv1, NhanSu nv2) {
                return Double.compare(nv2.tinhLuong(), nv1.tinhLuong());
            }
        });
        displayAllEmployees(danhSachNhanVien);
    }

    public void findDirectorWithMostShares(ArrayList<NhanSu> danhSachNhanVien) {
        String type="GiamDoc";
        ArrayList<NhanSu> danhSachGiamDoc = locDanhSach(danhSachNhanVien,type);
        double maxCP = timLuongCaoNhat(danhSachGiamDoc,nv ->((GiamDoc) nv).getCoPhan());
        out.println("Cố Phần cao nhất là: " + maxCP);
        ArrayList<NhanSu> danhSachGDCPCaoNhat = new ArrayList<>();
        for (NhanSu gd:danhSachGiamDoc) {
            if (((GiamDoc) gd).getCoPhan() == maxCP) {
                danhSachGDCPCaoNhat.add(gd);
            }
        }
        out.println("Danh sách " + type + " có cổ phần cao nhất");
        displayAllEmployees(danhSachGDCPCaoNhat);
    }

    public void printTotalIncomeForDirectors(ArrayList<NhanSu> danhSachNhanVien,double doanhThuThang) {
        String type="GiamDoc";
        ArrayList<NhanSu> danhSachGiamDoc = locDanhSach(danhSachNhanVien,type);

        for (NhanSu nv : danhSachGiamDoc) {
            GiamDoc gd = (GiamDoc) nv;
            double luongThang = gd.tinhLuong();

            double coPhan = gd.getCoPhan();
            double tongLuongThang = displayTotalSalary(danhSachNhanVien);

            double loiNhuanCongTy = doanhThuThang - tongLuongThang;

            double thuNhap = luongThang + (coPhan * loiNhuanCongTy);

            out.println("Giám đốc " + gd.getHoTen() + " có tổng thu nhập là: " + thuNhap);
        }

    }

    public double displayTotalSalary(ArrayList<NhanSu> danhSachNhanVien) {
        double tongluong = 0;
        for (NhanSu nv:danhSachNhanVien) {
            tongluong += nv.tinhLuong();
        }
        return tongluong;
    }

}
