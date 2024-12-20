package QlBanHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<LoaiHang> loaiHangs = new ArrayList<>();
        ArrayList<Hang> hangs = new ArrayList<>();
        ArrayList<KhachHang> khachHangs = new ArrayList<>();
        ArrayList<GioHang> gioHangs = new ArrayList<>();


        loaiHangs.add(new LoaiHang(1, "Dien Tu"));
        loaiHangs.add(new LoaiHang(2, "Gia Dung"));
        loaiHangs.add(new LoaiHang(3, "Do An"));

        hangs.add(new Hang(1, 1, "Tivi", 10, 500));
        hangs.add(new Hang(2, 2, "Quat Dien", 10, 700));
        hangs.add(new Hang(3, 3, "Com Suon", 10, 50));

        khachHangs.add(new KhachHang(1, "Nguyen Quoc Cuong", 1));
        khachHangs.add(new KhachHang(2, "Nguyen Quang Truong", 2));
        khachHangs.add(new KhachHang(3, "Nguyen Anh Khoa", 3));

        gioHangs.add(new GioHang(1, "Tivi", 1));
        gioHangs.add(new GioHang(2, "Quat Dien", 2));
        gioHangs.add(new GioHang(3, "Com Suon", 3));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=================== MENU========================");
            System.out.println("1. Hiển thị danh sách loại hàng");
            System.out.println("2. Hiển thị danh sách hàng");
            System.out.println("3. Hiển thị danh sách khách hàng");
            System.out.println("4. Hiển thị danh sách khách mua hàng");
            System.out.println("5. Hiển thị giỏ hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hienThiDanhSachLoaiHang(loaiHangs);
                    break;
                case 2:
                    hienThiDanhSachHang(hangs);
                    break;
                case 3:
                    hienThiDanhSachKhachHang(khachHangs);
                    break;
                case 4:
                    hienThiDanhSachKhachMuaHang(khachHangs,gioHangs);
                    break;
                case 5:
                    hienThiGioHang(gioHangs);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void hienThiDanhSachLoaiHang(ArrayList<LoaiHang> loaiHangs) {
        System.out.println("==========Danh sách loại hàng:==========");
        System.out.println(String.format("| %-5s | %-10s |" , "ID","Ten Loai Hang"));
        for (LoaiHang loaiHang : loaiHangs) {
            System.out.println(String.format("| %-5s | %-10s | " , loaiHang.getId(),loaiHang.getTenLoai()));
        }
    }


    public static void hienThiDanhSachHang(ArrayList<Hang> hangs) {
        System.out.println("==========Danh sách hàng:==========");
        System.out.println(String.format("| %-5s | %-10s | %-15s | %-10s | %-8s |" ,"ID" ,"Loai Hang ID","Ten Hang","So Luong","DOn Gia"));
        for (Hang hang : hangs) {
            System.out.println(String.format("| %-5s | %-12s | %-15s | %-10s | %-8s |", hang.getId() , hang.getLoaiHangID() ,
                    hang.getTenHang() ,hang.getSoLuong() , hang.getDonGia()));
        }
    }


    public static void hienThiDanhSachKhachHang(ArrayList<KhachHang> khachHangs) {
        System.out.println("==========Danh sách khách hàng:==========");
        System.out.println(String.format("| %-5s | %-20s | %-10s |" ,"ID","Ten Khach Hang" ,"Loai Hang ID"));
        for (KhachHang khachHang : khachHangs) {
            System.out.println(String.format("| %-5s | %-20s | %-12s |" ,khachHang.getId(),khachHang.getTenKhachHang(),khachHang.getLoaiHangID()));
        }
    }


    public static void hienThiGioHang(ArrayList<GioHang> gioHangs) {
        System.out.println("==========Danh sách giỏ hàng:==========");
        System.out.println(String.format("| %-5s | %-10s | %-15s |","ID","Ten Hang","Loai Hang ID" ));
        for (GioHang gioHang : gioHangs) {
            System.out.println(String.format("| %-5s | %-10s | %-15s |" , gioHang.getId(),gioHang.getTenHang(),gioHang.getLoaiHangID()));
        }
    }
    public static void hienThiDanhSachKhachMuaHang(ArrayList<KhachHang> khachHangs, ArrayList<GioHang> gioHangs) {
        System.out.println("==========Danh sách khách mua hàng:==========");
        for (KhachHang khachHang : khachHangs) {
            System.out.println("Khách hàng: " + khachHang.getTenKhachHang());
            System.out.println("Các mặt hàng đã mua:");
            boolean hasItems = false;

            for (GioHang gioHang : gioHangs) {
                if (gioHang.getLoaiHangID() == khachHang.getId()) {
                    System.out.println(gioHang.getTenHang());
                    hasItems = true;
                    if (!hasItems) {
                        System.out.println(" - Không có sản phẩm nào.");
                    }
                    System.out.println();
                }
            }
        }
    }
}