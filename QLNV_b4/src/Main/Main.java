package Main;


import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<NhanSu> danhSachNhanVien = new ArrayList<>();
        QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();
        CongTy congTy = new CongTy();
        double doanhThuThang;


        // Thêm nhân viên vào list nhân viên bằng tay cho đỡ mệt
        NhanSu nhanVien1 = new NhanVien(1, "Nguyen Văn A", "12345",15);
        danhSachNhanVien.add(nhanVien1);
        NhanSu nhanVien2 = new NhanVien(2, "Nguyen Văn B", "12345",21);
        danhSachNhanVien.add(nhanVien2);
        NhanSu nhanVien3 = new NhanVien(3, "Nguyen Văn C", "12345",22);
        danhSachNhanVien.add(nhanVien3);
        NhanSu nhanVien4 = new NhanVien(4, "Nguyen Văn D", "12345",23);
        danhSachNhanVien.add(nhanVien4);

        // Thêm Trưởng phòng vào list nhân viên bằng tay cho đỡ mệt
        NhanSu truongPhong1 = new TruongPhong(5, "Truong Phong A", "12345",24);
        danhSachNhanVien.add(truongPhong1);
        NhanSu truongPhong2 = new TruongPhong(6, "Truong Phong B", "12345",22);
        danhSachNhanVien.add(truongPhong2);

        // Thêm giám đốc vào list nhân viên bằng tay cho đỡ mệt
        NhanSu giamDoc1 = new GiamDoc(7, "Giam Doc A", "12345",27,0.1);
        danhSachNhanVien.add(giamDoc1);
        NhanSu giamDoc2 = new GiamDoc(8, "Giam Doc B", "12345",27,0.1);
        danhSachNhanVien.add(giamDoc2);

//        CongTy congTy = quanLyNhanSu.inputCompanyInfo();
//        quanLyNhanSu.assignEmployeeToManager(danhSachNhanVien);
//        quanLyNhanSu.displayAllEmployees(danhSachNhanVien);
//        quanLyNhanSu.findEmployeeWithHighestSalary(danhSachNhanVien);
//        quanLyNhanSu.findManagerWithMostEmployees(danhSachNhanVien);
//        quanLyNhanSu.sortEmployeesByNameASC(danhSachNhanVien);
//        quanLyNhanSu.sortEmployeesBySalaryDESC(danhSachNhanVien);
//        quanLyNhanSu.findDirectorWithMostShares(danhSachNhanVien);

        boolean tiepTuc = true;
        while (tiepTuc){
            System.out.format("+-----+--------------------------------------------------------------+%n");
            System.out.format("| %-3s | %-60s |%n", "STT", "Nội dung");
            System.out.format("+-----+--------------------------------------------------------------+%n");
            System.out.format("| %-3s | %-60s |%n", "1", "Nhập thông tin công ty");
            System.out.format("| %-3s | %-60s |%n", "2", "Phân bổ Nhân viên vào Trưởng phòng");
            System.out.format("| %-3s | %-60s |%n", "3", "Thêm, xóa thông tin một nhân sự");
            System.out.format("| %-3s | %-60s |%n", "4", "Xuất ra thông tin toàn bộ người trong công ty");
            System.out.format("| %-3s | %-60s |%n", "5", "Tính và xuất tổng lương cho toàn công ty");
            System.out.format("| %-3s | %-60s |%n", "6", "Tìm Nhân viên thường có lương cao nhất");
            System.out.format("| %-3s | %-60s |%n", "7", "Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
            System.out.format("| %-3s | %-60s |%n", "8", "Sắp xếp nhân viên toàn công ty theo thứ tự abc");
            System.out.format("| %-3s | %-60s |%n", "9", "Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
            System.out.format("| %-3s | %-60s |%n", "10", "Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
            System.out.format("| %-3s | %-60s |%n", "11", "Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
            System.out.format("| %-3s | %-60s |%n", "0", "Thoát");
            System.out.format("+-----+--------------------------------------------------------------+%n");
            System.out.print("Bạn hãy chọn chức năng cần thực hiện:");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    congTy = quanLyNhanSu.inputCompanyInfo();
                    break;
                case 2:
                    quanLyNhanSu.assignEmployeeToManager(danhSachNhanVien);
                    break;
                case 3:
                    quanLyNhanSu.updateEmployeeInfo(danhSachNhanVien);
                    break;
                case 4:
                    quanLyNhanSu.displayAllEmployees(danhSachNhanVien);
                    break;
                case 5:
                    quanLyNhanSu.displayTotalSalary(danhSachNhanVien);
                    break;
                case 6:
                    quanLyNhanSu.findEmployeeWithHighestSalary(danhSachNhanVien);
                    break;
                case 7:
                    quanLyNhanSu.findManagerWithMostEmployees(danhSachNhanVien);
                    break;
                case 8:
                    quanLyNhanSu.sortEmployeesByNameASC(danhSachNhanVien);
                    break;
                case 9:
                    quanLyNhanSu.sortEmployeesBySalaryDESC(danhSachNhanVien);
                    break;
                case 10:
                    quanLyNhanSu.findDirectorWithMostShares(danhSachNhanVien);
                    break;
                case 11:
                    doanhThuThang = congTy.getdoanhThuThang();
                    quanLyNhanSu.printTotalIncomeForDirectors(danhSachNhanVien,doanhThuThang);
                    break;
                case 0:
                    tiepTuc = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }

    }
}
