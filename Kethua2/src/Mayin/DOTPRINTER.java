package Mayin;

import java.util.Scanner;

public class DOTPRINTER extends  PRINTER{
    private int matDoKim;


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
        System.out.println("Moi ban nhap mat do kim :");
        matDoKim = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("=========Thong tin May in kim la==============");
        System.out.println("Trong luong la :" + trongLuong);
        System.out.println("Hang san xuat la :" + hangSx);
        System.out.println("Nam san xuat la :" + namSx);
        System.out.println("Toc do la :" + tocDo);
        System.out.println("May do kim :" + matDoKim);
    }

}
