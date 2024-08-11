package B3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private String donGia;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hang:");
        maHang = scanner.nextLine();
        System.out.println("Moi ban nhap ten hang hang:");
        tenHang = scanner.nextLine();
        System.out.println("Moi ban don gia:");
        donGia = scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ma hang la: " + maHang);
        System.out.println("Ten hang la: " + tenHang);
        System.out.println("Don gia la: " + donGia);
    }
}
