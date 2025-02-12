package QlNhaHang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosse;
        do {
            System.out.println("====================MENU=====================");
            System.out.println("1. Dich Vu Khach Hang: ");
            System.out.println("2. He Thong Nha Hang:" );
            System.out.println("0. Thoat chuong Trinh: ");

            try {
                chosse = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so! ");
                return;
            }

            switch (chosse){
                case 1:
                    dichVuKhachHang();
                    break;
                case 2:
                    heThongNhaHang();
                    break;
                case 0:
                    System.out.println("Ban chon thoat !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! ");
                    break;
            }
        }while (chosse!= 0);


    }

    public static void dichVuKhachHang(){
        Scanner scanner = new Scanner(System.in);
        int chosse;
        do {
            System.out.println("====================MENU=====================");
            System.out.println("1. Them khach hang:  ");
            System.out.println("2. Dat ban cho khach hang: ");
            System.out.println("3. Hien thi Menu cua quan: ");
            System.out.println("4. Tim kiem (Mon an/Nuoc uong): ");
            System.out.println("5. Dat mon: ");
            System.out.println("6. Hoa don thanh toan: ");
            System.out.println("7. Thanh toan: ");
            System.out.println("0. Thoat chuong Trinh: ");

            try {
                chosse = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so! ");
                return;
            }

            switch (chosse){
                case 1:
                    QuanLyNhaHang.themKhachHang();
                    break;
                case 2:
                    QuanLyNhaHang.datBan();
                    break;
                case 3:
                    QuanLyNhaHang.hienThiThucDon();
                    break;
                case 4:
                    QuanLyNhaHang.timKiemThucDon();
                    break;
                case 5:
                    QuanLyNhaHang.datMon();
                    break;
                case 6:
                    QuanLyNhaHang.hoaDon();
                    break;
                case 7:
                    QuanLyNhaHang.thanhToan();
                case 0:
                    System.out.println("Ban chon thoat !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! ");
                    break;
            }
        }while (chosse!= 0);
    }



    public static void heThongNhaHang(){
        Scanner scanner = new Scanner(System.in);


        int chosse;
        do {
            System.out.println("====================MENU=====================");
            System.out.println("1. Sua khach hang:  ");
            System.out.println("2. Xoa Khach Hang: ");
            System.out.println("3. Them Ban: ");
            System.out.println("4. Sua Ban: ");
            System.out.println("5. Xoa Ban: ");
            System.out.println("6. Them thuc don: ");
            System.out.println("7. Hien thi tat ca hoa don: ");
            System.out.println("0. Ban chon thoat! ");


            try {
                chosse = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so! ");
                return;
            }

            switch (chosse){
                case 1:
                    QuanLyNhaHang.suaKhachHang();
                    break;
                case 2:
                    QuanLyNhaHang.xoaKhachHang();
                    break;
                case 3:
                    QuanLyNhaHang.themBan();
                    break;
                case 4:
                    QuanLyNhaHang.suaBan();
                    break;
                case 5:
                    QuanLyNhaHang.xoaBan();
                    break;
                case 6:
                    QuanLyNhaHang.themThucDon();
                    break;
                case 7:
                    QuanLyNhaHang.hienThiTatCaHoaDon();
                case 0:
                    System.out.println("Ban chon thoat !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! ");
                    break;
            }
        }while (chosse!= 0);
    }



}
