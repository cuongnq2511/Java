package B1;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date ngaySinh;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma nhan su: ");
        maNhanSu = scanner.nextLine();
        System.out.println("Moi ban nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Moi ban nhap ngay sinh: ");
        ngaySinh = new Date();
        ngaySinh.nhap();
    }

    public void xuat(){
        System.out.println("=====THONG TIN VUA NHAP LA=====");
        System.out.println("Ma nhan su la: " + maNhanSu);
        System.out.println("Ho ten la: " + hoTen);
        System.out.println("Ngay sinh la: " );
        ngaySinh.xuat();

    }

}
