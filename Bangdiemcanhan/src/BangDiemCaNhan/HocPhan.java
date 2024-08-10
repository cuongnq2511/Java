package BangDiemCaNhan;

import java.util.Scanner;

public class HocPhan {
    private String maHocPhan;

    private String tenHocPhan;

    private int soTc;

    private float diem;

    public HocPhan() {
    }

    public HocPhan(String maHocPhan, String tenHocPhan, int soTc, float diem) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTc = soTc;
        this.diem = diem;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua hoc phan");
        System.out.print("Nhap ma hoc phan:");
        maHocPhan = scanner.nextLine();
        System.out.print("Nhap ten hoc phan::");
        tenHocPhan = scanner.nextLine();
        System.out.print("Nhap so tin chi:");
        soTc = scanner.nextInt();
        System.out.print("Nhap diem:");
        diem = scanner.nextFloat();

    }


    public void show(int stt) {
        System.out.println(String.format("| %-5d | %-10s | %-20s | %-5d | %-5.2f |", stt, maHocPhan, tenHocPhan, soTc, diem));
    }

















    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTc() {
        return soTc;
    }

    public void setSoTc(int soTc) {
        this.soTc = soTc;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}