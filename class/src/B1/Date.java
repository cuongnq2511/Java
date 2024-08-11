package B1;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.println("Moi ban nhap thang: ");
        thang = scanner.nextInt();
        System.out.println("Moi ban nhap nam: ");
        nam = scanner.nextInt();
    }


    public void xuat(){
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

}
