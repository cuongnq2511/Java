package Mayin;

import java.util.Scanner;

public class LASERPRINTER extends  PRINTER{
    private double doPhanGiai;

    public void nhap (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap trong luong :");
        trongLuong = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Moi ban nhap Hang san xuat :");
        hangSx = scanner.nextLine();
        System.out.println("Moi ban nhap nam san xuat :");
        namSx = scanner.nextInt();
        System.out.println("Moi ban nhap toc do :");
        tocDo = scanner.nextDouble();
        System.out.println("Moi ban nhap do phan giai");
        doPhanGiai = scanner.nextDouble();
    }

    public void xuat(){
        System.out.println("=========Thong tin May in laser la==============");
        System.out.println("Trong luong la :" + trongLuong);
        System.out.println("Hang san xuat la :" + hangSx);
        System.out.println("Nam san xuat la :" + namSx);
        System.out.println("Toc do la :" + tocDo);
        System.out.println("Do phan giai la :" + doPhanGiai);
    }
}
