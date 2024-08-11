package B4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhNang;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma may: ");
        maMay = scanner.nextLine();
        System.out.println("Moi ban nhap kieu may: ");
        kieuMay = scanner.nextLine();
        System.out.println("Moi ban nhap tinh nang: ");
        tinhNang = scanner.nextLine();
    }

    public void xuat(){
        System.out.println("Ma may la: " + maMay);
        System.out.println("Kieu may la: " + kieuMay);
        System.out.println("Tinh nang : " + tinhNang);
    }

}
