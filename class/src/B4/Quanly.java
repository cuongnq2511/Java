package B4;

import java.util.Scanner;

public class Quanly {
    private String maQuanLy;
    private String hoTen;


    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma quan ly: ");
        maQuanLy = scanner.nextLine();
        System.out.println("Moi ban nhap ho ten quan ly: ");
        hoTen = scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan ly la: " + maQuanLy);
        System.out.println("Ho ten quan ly la: " + hoTen);
    }
}
