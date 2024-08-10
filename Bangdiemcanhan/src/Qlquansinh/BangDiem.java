package Qlquansinh;

import java.util.Scanner;

public class BangDiem {
    private String maSinhVien;

    private String hoTen;

    private String namSinh;

    private String gioiTinh;

    private HocPhan[] listHocPhan;

    public BangDiem() {
    }

    public BangDiem(String maSinhVien, String hoTen, String namSinh, String gioiTinh, HocPhan[] listHocPhan) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.listHocPhan = listHocPhan;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua bang diem");
        System.out.print("Nhap ma Sinh vien:");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh:");
        namSinh = scanner.nextLine();
        System.out.print("Nhap Gioi tinh:");
        gioiTinh = scanner.nextLine();

        System.out.println("Moi ban nhap so luong hoc phan: ");
        int n = scanner.nextInt();
        listHocPhan = new HocPhan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap hoc phan thu: " + (i+1) );
            listHocPhan[i] = new HocPhan();
            listHocPhan[i].nhap();
        }

    }
    public void show(){
        System.out.println("===================================================================================");
        System.out.print(String.format("| %-15s  %-20s ", "Ma sinh vien:", maSinhVien));
        System.out.println(String.format(" %-15s  %-20s |", "Ho ten:", hoTen));
        System.out.print(String.format("| %-15s  %-20s ", "Nam sinh:", namSinh));
        System.out.println(String.format(" %-15s  %-20s |", "Gioi tinh:", gioiTinh));

        System.out.println("===================================================================================");
        System.out.println(String.format("| %-5s | %-10s | %-20s | %-5s | %-5s |", "STT", "Mã HP", "Tên HP", "Số TC", "Điểm"));

        float tong = 0;
        int cntTc = 0;

        for (int i=0; i< listHocPhan.length ;i++) {
            listHocPhan[i].show(i+1);

            tong += listHocPhan[i].getSoTc() * listHocPhan[i].getDiem();
            cntTc += listHocPhan[i].getSoTc();
        }

        System.out.println("Diem tong ket:" + tong/cntTc);

    }
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin moi ve sinh vien");
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh:");
        namSinh = scanner.nextLine();
        System.out.print("Nhap Gioi tinh:");
        gioiTinh = scanner.nextLine();
        System.out.println("Sua thanh cong!");
    }

    public void suaHocPhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon hoc phan  muon sua diem:");
        String maHocPhan = scanner.nextLine();
        for (int i=0; i< listHocPhan.length ;i++) {

            if (listHocPhan[i].getMaHocPhan().equals(maHocPhan)) {
                System.out.println("Nhap thong tin moi cua diem hoc phan: ");
                float diem = scanner.nextInt();
                listHocPhan[i].setDiem(diem);
            }
        }
        System.out.println("Ban da sua diem thanh cong: ");
    }



    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public HocPhan[] getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(HocPhan[] listHocPhan) {
        this.listHocPhan = listHocPhan;
    }
}
