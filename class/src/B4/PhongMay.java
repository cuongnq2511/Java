package B4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private Quanly x;
    private May y[];
    private int n;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma phong: ");
        maPhong = scanner.nextLine();
        System.out.println("Moi ban nhap ten phong: ");
        tenPhong = scanner.nextLine();
        System.out.println("Moi ban nhap dien tich: ");
        dienTich = scanner.nextFloat();
        x = new Quanly();
        x.nhap();

        System.out.println("Moi ban nhap so luong may: ");
        n = scanner.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap may thu " + (i+1) + " :");
            y[i] = new May();
            y[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("=====THONG TIN VUA NHAP LA=====");
        System.out.println("Ma phong " + maPhong);
        System.out.println("Ten phong " + tenPhong);
        System.out.println("Dien tich " + dienTich);
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin cua may thu " + (i+1) + "la: ");
            y[i].xuat();
        }

    }
}
