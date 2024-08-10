package BangDiemCaNhan;

import java.util.Scanner;

public class BangDiem{
    private String maSinhVien;

    private String hoTen;

    private String ngaySinh;

    private String nganh;

    private HocPhan[] listHocPhan;

    public BangDiem() {
    }

    public BangDiem (String maSinhVien, String hoTen, String ngaySinh, String nganh, HocPhan[] listHocPhan) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganh = nganh;
        this.listHocPhan = listHocPhan;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua bang diem");
        System.out.print("Nhap ma Sinh vien:");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh:");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap nganh:");
        nganh = scanner.nextLine();

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
        System.out.println("=============================================================================");
        System.out.print(String.format("| %-15s  %-20s ", "Ma sinh vien:", maSinhVien));
        System.out.println(String.format(" %-15s  %-20s |", "Ho ten:", hoTen));
        System.out.print(String.format("| %-15s  %-20s ", "Ngay sinh:", ngaySinh));
        System.out.println(String.format(" %-15s  %-20s |", "Nganh:", nganh));

        System.out.println("=================================================================================");
        System.out.println(String.format("| %-5s | %-10s | %-20s | %-5s | %-5s |", "STT", "Mã HP", "Tên HP", "Số TC", "Điểm"));

        float tong = 0;
        int cntTc = 0;

        for (int i=0; i< listHocPhan.length ;i++) {
//            System.out.println("Thong tin hoc phan " + (i+1) +":");
            listHocPhan[i].show(i+1);

            tong += listHocPhan[i].getSoTc() * listHocPhan[i].getDiem();
            cntTc += listHocPhan[i].getSoTc();
        }

        System.out.println("Diem tong ket:" + tong/cntTc);

    }

    public void showDiemDuoi(float diem) {

        for (int i=0; i< listHocPhan.length ;i++) {

            if (listHocPhan[i].getDiem() < diem) {
                System.out.println("Hoc Phan Duoi 6.0 la hoc phan thu " + (i+1) +":");
                listHocPhan[i].show(i+1);
            }
        }
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin moi ve sing vien");
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh:");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap nganh:");
        nganh = scanner.nextLine();
        System.out.println("Sua thanh cong!");
    }

    public void suaHocPhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon hoc phan sua muon:");
        String maHocPhan = scanner.nextLine();
        for (int i=0; i< listHocPhan.length ;i++) {

            if (listHocPhan[i].getMaHocPhan().equals(maHocPhan)) {
                System.out.println("Nhap thong tin moi cua hoc phan: ");
                listHocPhan[i].nhap();
            }
        }
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public HocPhan[] getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(HocPhan[] listHocPhan) {
        this.listHocPhan = listHocPhan;
    }
}