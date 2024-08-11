package B2;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private Nsx x;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hang: ");
        maHang = scanner.nextLine();
        System.out.println("Moi ban nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.println("Moi ban nhap NSX: ");
        x = new Nsx();
        x.nhap();
    }

    public void xuat(){
        System.out.println("=====THONG TIN VUA NHAP LA=====");
        System.out.println("Ma hang la: " + maHang);
        System.out.println("Ten hang la: " + tenHang);
        System.out.println("Nha San xuat la: ");
        x.xuat();
    }

}
