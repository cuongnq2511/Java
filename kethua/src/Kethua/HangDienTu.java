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
        System.out.println("================================================THONG TIN SAN PHAM==========================================================");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                "MSp", "TSP", "NSX", "Trong Luong", "Mau Sac", "Dong Dien", "Cong Suat"));
        for (int i = 0; i < maSp.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                    maSp[i], tenSp[i], ngaSX[i], trongLuong[i], mauSac[i], dongDien[i], congSuat[i]));
        }
        System.out.println("============================================================================================================================");
    }

    public void trongLuongThapNhat(){
        for (int i = 0; i < trongLuong.length - 1; i++) {
            for (int j = i + 1; j < trongLuong.length; j++) {
                if (trongLuong[i] > trongLuong[j]) {

                    float tempTrongLuong = trongLuong[i];
                    trongLuong[i] = trongLuong[j];
                    trongLuong[j] = tempTrongLuong;

                    String tempMaSp = maSp[i];
                    maSp[i] = maSp[j];
                    maSp[j] = tempMaSp;

                    String tempTenSp = tenSp[i];
                    tenSp[i] = tenSp[j];
                    tenSp[j] = tempTenSp;

                    String tempNhaSX = ngaSX[i];
                    ngaSX[i] = ngaSX[j];
                    ngaSX[j] = tempNhaSX;

                    String tempMauSac = mauSac[i];
                    mauSac[i] = mauSac[j];
                    mauSac[j] = tempMauSac;

                    float tempCongSuat = congSuat[i];
                    congSuat[i] = congSuat[j];
                    congSuat[j] = tempCongSuat;

                    String tempDongDien = dongDien[i];
                    dongDien[i] = dongDien[j];
                    dongDien[j] = tempDongDien;
                }
            }
        }
        System.out.println("============================================SAN PHAM CO TRONG LUONG MIN=====================================================");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                "MSp", "TSP", "NSX", "Trong Luong", "Mau Sac", "Dong Dien", "Cong Suat"));
        for (int i = 0; i < trongLuong.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |%15s |",
                    maSp[i], tenSp[i], ngaSX[i], trongLuong[i], mauSac[i], dongDien[i], congSuat[i]));
        }
        System.out.println("============================================================================================================================");

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
