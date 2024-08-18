package Kethua;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangDienTu hangDienTu = new HangDienTu();
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
                    hangDienTu.nhap();
                    break;
                case 2:
                    hangDienTu.xuat();
                    break;
                case 3:
                    hangDienTu.trongLuongThapNhat();
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
}
