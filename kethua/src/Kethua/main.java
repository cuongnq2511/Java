package Kethua;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Moi ban nhap so luong hang dien tu :");
        n = scanner.nextInt();

        HangDienTu[] hangDienTu = new HangDienTu[n];
        int menu;
        do {
            System.out.println("===========================MENU===========================");
            System.out.println("1. Nhap danh sach n hang dien tu:");
            System.out.println("2. IN danh sach n hang dien tu:");
            System.out.println("3. In ra cac mat hang co trong luong MIN :");
            try {
                menu = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so! ");
                return;
            }

            switch (menu){
                case 1:
                    nhapDanhSach(hangDienTu, n);
                    break;
                case 2:
                    xuatDanhSach(hangDienTu);
                    break;
                case 3:
                    matHangThapNhat(hangDienTu);
                    break;
                case 0:
                    System.out.println("Ban chon thoat! ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le: ");
                    break;
            }

        }while (menu !=0);
    }
    protected static void nhapDanhSach(HangDienTu[]hangDienTu,int n){
        System.out.println("==================Nhap thong tin====================");
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap san pham thu " + (i + 1) + " :");
            hangDienTu[i] = new HangDienTu();
            hangDienTu[i].nhap();
        }
    }
    protected static void xuatDanhSach(HangDienTu[]hangDienTu){
        System.out.println("===============================================THONG TIN SAN PHAM=========================================");
        System.out.printf("%-10s | %-20s | %-12s | %-12s | %-10s | %-10s | %-10s%n",
                "Ma SP", "Ten SP", "Ngay SX", "Trong luong", "Mau sac", "Cong suat", "Dong dien");
        for (int i = 0; i < hangDienTu.length; i++) {
            hangDienTu[i].xuat();
        }
    }

    protected static void matHangThapNhat(HangDienTu[] hangDienTu){
        float min = hangDienTu[0].trongLuong;
        for (int i = 0; i <hangDienTu.length ; i++) {
            min = Math.min(min,hangDienTu[i].trongLuong);
        }
        System.out.println("===================================THONG TIN SAN PHAM CO TRONG LUONG MIN=====================================");
        System.out.printf("%-10s | %-20s | %-12s | %-12s | %-10s | %-10s | %-10s%n",
                "Ma SP", "Ten SP", "Ngay SX", "Trong luong", "Mau sac", "Cong suat", "Dong dien");
        for (int i = 0; i < hangDienTu.length; i++) {
            if (min == hangDienTu[i].trongLuong){
                hangDienTu[i].xuat();
            }
        }
    }
}
