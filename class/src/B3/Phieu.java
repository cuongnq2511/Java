package B3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang x[];
    private int n;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma phieu: ");
        maPhieu = scanner.nextLine();
        System.out.println("Moi ban nhap so luong hang: ");
        n = scanner.nextInt();
        x = new Hang[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap mat hang thu " + (i+1) + " :");
            x[i] = new Hang();
            x[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("=====THONG TIN VUA NHAP LA=====");
        System.out.println("Ma phieu: " + maPhieu);
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin cua mat hang thu " + (i+1) + "la: ");
            x[i].xuat();
        }
    }
}
