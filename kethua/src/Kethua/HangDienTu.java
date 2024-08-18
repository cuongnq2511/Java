package Kethua;


import java.util.Scanner;

public class HangDienTu extends SanPham{

    protected float[] congSuat;
    protected String[] dongDien;


    public HangDienTu() {
    }

    public HangDienTu(String[] maSp, String[] tenSp, String[] ngaSX, float[] trongLuong, String[] mauSac, float[] congSuat, String[] dongDien) {
        super(maSp, tenSp, ngaSX, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDien = dongDien;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong san pham: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        maSp = new String[n];
        tenSp = new String[n];
        ngaSX = new String[n];
        trongLuong = new float[n];
        mauSac = new String[n];
        congSuat = new float[n];
        dongDien = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap san pham thu " + (i +1 ) + ": ");
            System.out.println("Moi ban nhap MSP");
            maSp[i] = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Moi ban nhap TSP");
            tenSp[i] = scanner.nextLine();
            System.out.println("Moi ban nhap ngay san xuat:");
            ngaSX[i] = scanner.nextLine();
            System.out.println("Moi ban nhap trong luong");
            trongLuong[i] = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Moi ban nhap mau sac");
            mauSac[i] = scanner.nextLine();
            System.out.println("Moi ban nhap cong suat");
            congSuat[i] = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Moi ban nhap dong dien");
            dongDien[i] = scanner.nextLine();
        }
    }
    public void xuat(){
        System.out.println("=================================THONG TIN SAN PHAM=================================");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                "MSp", "TSP", "NSX", "Trong Luong", "Mau Sac", "Dong Dien", "Cong Suat"));
        for (int i = 0; i < maSp.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                    maSp[i], tenSp[i], ngaSX[i], trongLuong[i], mauSac[i], dongDien[i], congSuat[i]));
        }
        System.out.println("========================================================================");
    }

    public void trongLuongThapNhat(){
        for (int i = 0; i < trongLuong.length -1 ; i++) {
            for (int j = 0; j < trongLuong.length -1 - i ; j++) {
                if (trongLuong[i] > trongLuong[j ]){

                    float tempTrongLuong = trongLuong[j];
                    trongLuong[j] = trongLuong[j + 1];
                    trongLuong[j + 1] = tempTrongLuong;


                    String tempMaSp = maSp[j];
                    maSp[j] = maSp[j + 1];
                    maSp[j + 1] = tempMaSp;

                    String tempTenSp = tenSp[j];
                    tenSp[j] = tenSp[j + 1];
                    tenSp[j + 1] = tempTenSp;

                    String tempNhaSX = ngaSX[j];
                    ngaSX[j] = ngaSX[j + 1];
                    ngaSX[j + 1] = tempNhaSX;

                    String tempMauSac = mauSac[j];
                    mauSac[j] = mauSac[j + 1];
                    mauSac[j + 1] = tempMauSac;

                    float tempCongSuat = congSuat[j];
                    congSuat[j] = congSuat[j + 1];
                    congSuat[j + 1] = tempCongSuat;

                    String tempDongDien = dongDien[j];
                    dongDien[j] = dongDien[j + 1];
                    dongDien[j + 1] = tempDongDien;
                }
            }
        }
        System.out.println("=================================trong Luong Thap nhat=================================");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                "MSp", "TSP", "NSX", "Trong Luong", "Mau Sac", "Dong Dien", "Cong Suat"));
        for (int i = 0; i < trongLuong.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                    maSp[i], tenSp[i], ngaSX[i], trongLuong[i], mauSac[i], dongDien[i], congSuat[i]));
        }
        System.out.println("========================================================================");

    }

    public float[] getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float[] congSuat) {
        this.congSuat = congSuat;
    }

    public String[] getDongDien() {
        return dongDien;
    }

    public void setDongDien(String[] dongDien) {
        this.dongDien = dongDien;
    }
}
