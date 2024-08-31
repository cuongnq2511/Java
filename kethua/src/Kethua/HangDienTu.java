package Kethua;


import java.util.Scanner;

public class HangDienTu extends SanPham{

    protected float congSuat;
    protected String dongDien;

    public HangDienTu() {
    }

    public HangDienTu(String maSp, String tenSp, String ngaSX, float trongLuong, String mauSac, float congSuat, String dongDien) {
        super(maSp, tenSp, ngaSX, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDien = dongDien;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap MSP");
            maSp = scanner.nextLine();
            System.out.println("Moi ban nhap TSP");
            tenSp = scanner.nextLine();
            System.out.println("Moi ban nhap ngay san xuat:");
            ngaSX = scanner.nextLine();
            System.out.println("Moi ban nhap trong luong");
            trongLuong = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Moi ban nhap mau sac");
            mauSac = scanner.nextLine();
            System.out.println("Moi ban nhap cong suat");
            congSuat = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Moi ban nhap dong dien");
            dongDien = scanner.nextLine();
        }

        public void xuat(){
            System.out.printf("%-10s | %-20s | %-12s | %-12.2f | %-10s | %-10.2f | %-10s%n",
                    maSp, tenSp, ngaSX, trongLuong, mauSac, congSuat, dongDien);
            System.out.println("====================================================================================================");
        }


}

