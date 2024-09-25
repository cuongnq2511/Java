package QlSv;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static tblSinhVien[] sinhViens;
    public static tblMonHoc[] monHocs;
    public static tblDiem[] diems;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        themSinhVien(new tblSinhVien("SV01", "Quoc", "Cuong", 2003, false));
        themSinhVien(new tblSinhVien("SV02", "Ngoc", "Lan", 2003, true));
        themSinhVien(new tblSinhVien("SV03", "Nguyen", "Tu", 2003, true));
        themSinhVien(new tblSinhVien("SV04", "Nguyen", "Cuc", 2003, false));
        themSinhVien(new tblSinhVien("SV05", "Vu", "Nam", 2003, true));
        themSinhVien(new tblSinhVien("SV06", "Thao", "Duyen", 2003, false));

        themMonHoc(new tblMonHoc("MH01", "Toan", 3));
        themMonHoc(new tblMonHoc("MH02", "Van", 2));
        themMonHoc(new tblMonHoc("MH03", "Anh", 4));
        themMonHoc(new tblMonHoc("MH04", "Ly", 4));
        themMonHoc(new tblMonHoc("MH05", "Hoa", 2));
        themMonHoc(new tblMonHoc("MH06", "Sinh", 3));

        themBangDiem(new tblDiem("SV01", "MH01", 8));
        themBangDiem(new tblDiem("SV01", "MH04", 9));
        themBangDiem(new tblDiem("SV02", "MH01", 8));
        themBangDiem(new tblDiem("SV02", "MH02", 9));

        themBangDiem(new tblDiem("SV03", "MH05", 7));
        themBangDiem(new tblDiem("SV03", "MH03", 6));
        themBangDiem(new tblDiem("SV04", "MH01", 8));
        themBangDiem(new tblDiem("SV04", "MH02", 8));
        themBangDiem(new tblDiem("SV05", "MH06", 8));
        themBangDiem(new tblDiem("SV05", "MH03", 7));
        themBangDiem(new tblDiem("SV06", "MH01", 8));
        themBangDiem(new tblDiem("SV06", "MH06", 8));

        int choose = -1;
        do {
            System.out.println("==============MENU================");
            System.out.println("1.Quan ly sinh vien :");
            System.out.println("2.Quan ly mon hoc :");
            System.out.println("3.Quan ly bang diem :");
            System.out.println("4.Hien thi bang diem :");
            System.out.println("5.Tim kiem sinh vien:");
            System.out.println("6.Tim kiem mon hoc:");
            System.out.println("0.Ban lua chon thoat !");
            System.out.println("===================================");
            System.out.println("Moi ban lua chon ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap so hop le!");
                scanner.next();
            }

            switch (choose){
                case 1:
                    quanLySinhVien();
                    break;
                case 2:
                    quanLyMonHoc();
                    break;
                case 3:
                    quanLyBangDiem();
                    break;
                case 4:

                    hienThiDanhSachBangDiem();

                    hienThiDanhSacMonHoc();
                    break;
                case 5:
                    timKiemSinhVien();
                    break;
                case 6:
                    timKiemMonHoc();
                    break;
                case 0:
                    System.out.println("Thoat truong trinh !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le moi chon lai ! ");
            }
        }while (choose !=0 );
    }
//========================================================SINH VIEN==================================================


    public static void quanLySinhVien(){
        int choose = -1;
        do {
            System.out.println("=================MENU=============");
            System.out.println("1.Them sinh vien :");
            System.out.println("2.Sua sinh vien :");
            System.out.println("3.xoa sinh vien :");
            System.out.println("4.Sap xep theo ten :");
            System.out.println("0.Ban lua chon thoat !");
            System.out.println("===================================");
            System.out.println("Moi ban lua chon ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap so hop le!");
                scanner.next();
            }

            switch (choose){
                case 1:
                       nhapSinhVien();
                    break;
                case 2:
                        suaSinhVien();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String maXoa = scanner.next();
                    xoaSinhVien(maXoa);
                    hienThiSinhVien();
                    break;
                case 4:
                    sapXepTheoTenSinhVien();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }
        }while (choose != 0);
    }


    public static void nhapSinhVien(){
        System.out.println("Nhap thong tin sinh vien:");
        System.out.print("Ma SV: ");
        String maSV = scanner.next();
        System.out.print("Ho Dem: ");
        String hoDem = scanner.next();
        System.out.print("Ten: ");
        String ten = scanner.next();
        System.out.print("Nam Sinh: ");
        int namSinh = scanner.nextInt();
        System.out.print("Gioi Tinh (true/false): ");
        boolean gioiTinh = scanner.nextBoolean();

        themSinhVien(new tblSinhVien(maSV, hoDem, ten, namSinh, gioiTinh));
        System.out.println("Them sinh vien thanh cong :");
        hienThiSinhVien();
    }
    public static void hienThiSinhVien(){
        System.out.println("Danh sach sinh vien:");
        System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-20s |", "STT", "Ma SV", "Ho Dem", "Ten", "Gioi Tinh"));
        for (int i = 0; i < sinhViens.length; i++) {
            String gioiTinh = sinhViens[i].isGioiTinh() ? "Nam" : "Nu";
            System.out.println(String.format("%3d | %-10s | %-15s | %-10s | %-10s |",
                    i + 1, sinhViens[i].getMaSinhVien(), sinhViens[i].getHoDem(), sinhViens[i].getTen(), gioiTinh
            ));
        }
    }

    public static void themSinhVien(tblSinhVien sinhVienNew){
        if (sinhViens == null){
            sinhViens = new tblSinhVien[1];
            sinhViens[0] = sinhVienNew;
        }else{
            tblSinhVien[] tmp = sinhViens.clone();
            sinhViens = new tblSinhVien[tmp.length +1 ];

            for (int i = 0; i < tmp.length; i++) {
                sinhViens[i] = tmp[i];
            }
            sinhViens[tmp.length] = sinhVienNew;
        }

    }
    public static void suaSinhVien(){
        System.out.println("Nhap thong tin sinh vien can sua:");
        System.out.print("Ma SV: ");
        String maSV = scanner.next();
        System.out.print("Ho Dem: ");
        String hoDem = scanner.next();
        System.out.print("Ten: ");
        String ten = scanner.next();
        System.out.print("Nam Sinh: ");
        int namSinh = scanner.nextInt();
        System.out.print("Gioi Tinh (true/false): ");
        boolean gioiTinh = scanner.nextBoolean();
        sinhVienUpDate(new tblSinhVien(maSV, hoDem, ten, namSinh, gioiTinh));
        hienThiSinhVien();
    }
    public static void sinhVienUpDate(tblSinhVien sinhVienSua){
        for (int i = 0; i < sinhViens.length; i++) {
            if (Objects.equals(sinhVienSua.getMaSinhVien(), sinhViens[i].getMaSinhVien())) {
                sinhViens[i] = sinhVienSua;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Sinh vien can sua khong ton tai!");
    }
    public static void xoaSinhVien(String maSV){
        if (sinhViens.length == 0) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }

        tblSinhVien[] ans = null;

        for (int i = 0; i < sinhViens.length; i++) {
            if (!Objects.equals(maSV, sinhViens[i].getMaSinhVien())) {
                if (ans == null) {
                    ans = new tblSinhVien[1];
                    ans[0] = sinhViens[i];
                } else {
                    tblSinhVien[] tmp = ans.clone();
                    ans = new tblSinhVien[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = sinhViens[i];
                }
            }
        }

        if (ans.length == sinhViens.length) {
            System.out.println("Ma sinh vien khong ton tai!");
        } else {
            sinhViens = ans.clone();
            System.out.println("Xoa sinh vien thanh cong!");
        }
    }
    public static void sapXepTheoTenSinhVien(){
        for (int i = 0; i < sinhViens.length -1 ; i++) {
            for (int j = i+1; j < sinhViens.length; j++) {
                if (sinhViens[i].getTen().compareTo(sinhViens[j].getTen()) > 0){
                    tblSinhVien tmp = sinhViens[i];
                    sinhViens[i] = sinhViens[j];
                    sinhViens[j] = tmp;
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep ");
        System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-20s |", "STT", "Ma SV", "Ho Dem", "Ten", "Gioi Tinh"));
        for (int i = 0; i < sinhViens.length; i++) {
            String gioiTinh = sinhViens[i].isGioiTinh() ? "Nam" : "Nu";
            System.out.println(String.format("%3d | %-10s | %-15s | %-10s | %-10s |",
                    i + 1,
                    sinhViens[i].getMaSinhVien(),
                    sinhViens[i].getHoDem(),
                    sinhViens[i].getTen(),
                    gioiTinh
            ));
        }
    }




    //=====================================================MON HOC====================================================
    public static void quanLyMonHoc(){
        int choose = -1;
        do {
            System.out.println("=================MENU=============");
            System.out.println("1.Them mon hoc :");
            System.out.println("2.Sua mon hoc :");
            System.out.println("3.xoa mon hoc :");
            System.out.println("4.Sap xep theo ten :");
            System.out.println("0.Ban lua chon thoat !");
            System.out.println("===================================");
            System.out.println("Moi ban lua chon ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap so hop le!");
                scanner.next();
            }

            switch (choose){
                case 1:
                    themVaoDanhSach();
                   break;
                case 2:
                    suaMonHoc();
                    break;
                case 3:
                    System.out.println("Nhap ma Mon hoc can xoa :");
                    String maXoa = scanner.next();
                    xoaMonHoc("MH06");
                    hienThiMonHoc();
                    break;
                case 4:
                    sapXepTheoTenMon();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }
        }while (choose != 0);
    }




    public static void hienThiMonHoc() {
        System.out.println("Danh sach Mon Hoc:");
        System.out.println(String.format("%3s | %-10s | %-20s | %-10s |", "STT", "Ma Mon Hoc", "Ten Mon Hoc", "He So"));

        for (int i = 0; i < monHocs.length; i++) {
            System.out.println(String.format("%3d | %-10s | %-20s | %-10d |",
                    i + 1,
                    monHocs[i].getMaMonHoc(),
                    monHocs[i].getTenMonHoc(),
                    monHocs[i].getHeSoMonHoc()
            ));
        }
    }

    public static void themMonHoc(tblMonHoc monHocNew){
        if (monHocs == null){
            monHocs = new tblMonHoc[1];
            monHocs[0] = monHocNew;
        }else{
            tblMonHoc[] tmp = monHocs.clone();
            monHocs = new tblMonHoc[tmp.length +1 ];

            for (int i = 0; i < tmp.length; i++) {
                monHocs[i] = tmp[i];
            }
            monHocs[tmp.length] = monHocNew;
        }
    }

    public static void themVaoDanhSach(){
        System.out.println("Nhap thong tin Mon Hoc ");
        System.out.println("Ma Mon Hoc");
        String maMonHoc = scanner.next();
        System.out.println("ten Mh");
        String tenMonHoc = scanner.next();
        System.out.println("He SO ");
        int heSeSheSoMonHoc = scanner.nextInt();
        themMonHoc(new tblMonHoc(maMonHoc,tenMonHoc,heSeSheSoMonHoc));
        System.out.println("Them Mon hoc thanh cong");
        hienThiMonHoc();
    }
    private static void upDateMonHoc(tblMonHoc suaMon) {
        for (int i = 0; i < monHocs.length; i++) {
            if (Objects.equals(suaMon.getMaMonHoc(), monHocs[i].getMaMonHoc())) {
                monHocs[i] = suaMon;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Mon hoc can sua khong ton tai!");
    }


    public static void suaMonHoc(){
        System.out.println("Nhap thong tin Mon hoc can sua :");
        System.out.println("Ma Mon Hoc");
        String maMonHoc = scanner.next();
        System.out.println("ten Mh");
        String tenMonHoc = scanner.next();
        System.out.println("He SO ");
        int heSeSheSoMonHoc = scanner.nextInt();
        upDateMonHoc(new tblMonHoc(maMonHoc,tenMonHoc,heSeSheSoMonHoc));
        System.out.println("Sua Mon hoc thanh cong");
        hienThiMonHoc();
    }


    private static void xoaMonHoc(String maMon) {

        if (monHocs.length == 0) {
            System.out.println("Danh sach mon hoc trong!");
            return;
        }

        tblMonHoc[] ans = null;

        for (int i = 0; i < monHocs.length; i++) {
            if (!Objects.equals(maMon, monHocs[i].getMaMonHoc())) {
                if (ans == null) {
                    ans = new tblMonHoc[1];
                    ans[0] = monHocs[i];
                } else {
                    tblMonHoc[] tmp = ans.clone();
                    ans = new tblMonHoc[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = monHocs[i];
                }
            }
        }

        if (ans.length == monHocs.length) {
            System.out.println("Ma mon hoc khong ton tai!");
        } else {
            monHocs = ans.clone();
            System.out.println("Xoa mon hoc thanh cong!");
        }
    }
    public static void sapXepTheoTenMon(){
        for (int i = 0; i < monHocs.length -1; i++) {
            for (int j = i +1; j < monHocs.length; j++) {
                if (monHocs[i].getTenMonHoc().compareTo(monHocs[j].getTenMonHoc())>0){
                    tblMonHoc tmp = monHocs[i];
                    monHocs[i] = monHocs[j];
                    monHocs[j] = tmp;
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep la");
        System.out.println(String.format("%-3s | %-15s | %-20s | %-10s |", "STT", "Mã Môn Học", "Tên Môn Học", "Hệ Số Môn"));
        for (int i = 0; i < monHocs.length; i++) {
            System.out.println(String.format("%-3d | %-15s | %-20s | %-10d |",
                    i + 1,monHocs[i].getMaMonHoc(),
                    monHocs[i].getTenMonHoc(),
                    monHocs[i].getHeSoMonHoc()
            ));
        }
    }









    //========================================================Bang Diem==================================================

    public static void quanLyBangDiem(){
        int choose = -1;
        do {
            System.out.println("=================MENU=============");
            System.out.println("1.Them Diem :");
            System.out.println("2.Sua Diem :");
            System.out.println("3.xoa Diem :");
            System.out.println("0.Ban lua chon thoat !");
            System.out.println("===================================");
            System.out.println("Moi ban lua chon ");

            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    nhapBangDiem();
                    break;
                case 2:
                    suaDiem();
                    break;
                case 3:
                    System.out.println("Nhap ma Sinh vien");
                    String maXoa1 = scanner.next();
                    String maXoa2 = scanner.next();
                    xoaDiem(maXoa1,maXoa2);
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }
        }while (choose != 0);
    }


    public static void hienThiBangDiem() {
        System.out.println("Danh sach Bang Diem:");
        System.out.println(String.format("%3s | %-10s | %-20s | %-10s |", "STT", "Ma Sinh Vien", "Ma Mon Hoc", "Diem So"));

        for (int i = 0; i < diems.length; i++) {
            System.out.println(String.format("%3d | %-10s | %-20s | %-10d |",
                    i + 1,
                    diems[i].getMaSinhVien(),
                    diems[i].getMaMonHoc(),
                    diems[i].getDiemSo()
            ));
        }
    }

    private static void themBangDiem(tblDiem diemMoi) {
        if (diems == null) {
            diems = new tblDiem[1];
            diems[0] = diemMoi;
        } else {
            tblDiem[] tmp = diems.clone();
            diems = new tblDiem[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                diems[i] = tmp[i];
            }
            diems[tmp.length] = diemMoi;
        }
    }
    public static void nhapBangDiem(){
        System.out.println("Them Diem So ");
        System.out.println("Moi nhap ma Sinh Vien ");
        String maSinhVien = scanner.next();
        System.out.println("Moi ban nhap ma Mon Hoc ");
        String maMonHoc = scanner.next();
        System.out.println("Nhap Diem ");
        int diemSo = scanner.nextInt();
        themBangDiem(new tblDiem(maSinhVien ,maMonHoc,diemSo));
        hienThiBangDiem();
        System.out.println("Them thanh cong !");
    }

    private static void upDateDiem(tblDiem diemUpdate) {
        for (int i = 0; i < diems.length; i++) {
            if (Objects.equals(diemUpdate.getMaMonHoc(), diems[i].getMaMonHoc())
                    && Objects.equals(diemUpdate.getMaSinhVien(), diems[i].getMaSinhVien())
            ) {
                diems[i] = diemUpdate;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Diem can sua khong ton tai!");
    }

    public static void suaDiem(){
        System.out.println("Sua Diem So ");
        System.out.println("Moi nhap ma Sinh Vien ");
        String maSinhVien = scanner.next();
        System.out.println("Moi ban nhap ma Mon Hoc ");
        String maMonHoc = scanner.next();
        scanner.nextLine();
        System.out.println("Nhap Diem ");
        float diemSo = scanner.nextInt();
        upDateDiem(new tblDiem(maSinhVien ,maMonHoc,diemSo));
        hienThiBangDiem();
        System.out.println("Sua thanh cong !");
    }
    private static void xoaDiem(String maSV, String maMon) {

        if (diems.length == 0) {
            System.out.println("Danh sach mon hoc trong!");
            return;
        }

        tblDiem[] ans = null;

        for (int i = 0; i < diems.length; i++) {
            if (!Objects.equals(maMon, diems[i].getMaMonHoc())
                    || !Objects.equals(maSV, diems[i].getMaMonHoc())
            ) {
                if (ans == null) {
                    ans = new tblDiem[1];
                    ans[0] = diems[i];
                } else {
                    tblDiem[] tmp = ans.clone();
                    ans = new tblDiem[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = diems[i];
                }
            }
        }

        if (ans.length == diems.length) {
            System.out.println("Diem cua sinh vien khong ton tai!");
        } else {
            diems = ans.clone();
            System.out.println("Xoa diem thanh cong!");
        }
    }

    //===============================================================================================
    private static tblSinhVien getSinhVien(String maSV) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i].getMaSinhVien().equals(maSV)) {
                return sinhViens[i];
            }
        }
        return null;
    }

    private static tblMonHoc getMonHoc(String maMon) {
        for (int i = 0; i < monHocs.length; i++) {
            if (monHocs[i].getMaMonHoc().equals(maMon)) {
                return monHocs[i];
            }
        }
        return null;
    }

//=============================================HIEN THI==============================================================
private static void hienThiDanhSacMonHoc() {
    System.out.println("===================================================Hien Thi Bang Diem Mon Hoc===============================");
    System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-20s | %-10s | %-15s | %-15s |",
            "STT", "Ma Mon", "Ten Mon", "Diem TB", "Ma SV", "Ho", "Ten", "Diem"));

    for (int i = 0; i < diems.length; i++) {
        tblSinhVien sinhVien = getSinhVien(diems[i].getMaSinhVien());
        tblMonHoc monHoc = getMonHoc(diems[i].getMaMonHoc());

        double tongDiem = 0;
        int soSinhVien = 0;

        for (int j = 0; j < diems.length; j++) {
            if (diems[j].getMaMonHoc().equals(diems[i].getMaMonHoc())) {
                tongDiem += diems[j].getDiemSo();
                soSinhVien++;
            }
        }

        double diemTRungBinh = (soSinhVien > 0) ? (tongDiem / soSinhVien) : 0;

        System.out.println(String.format("%3d | %-10s | %-15s | %-10.1f | %-20s | %-10s | %-15s | %-15.1f |",
                i + 1, diems[i].getMaMonHoc(), monHoc.getTenMonHoc(), diemTRungBinh,
                diems[i].getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(), diems[i].getDiemSo()));
    }
}


    private static void hienThiDanhSachBangDiem() {
        System.out.println("======================================Hien thi bang diem sinh vien===========================");
        System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-20s | %-10s | %-15s |",
                "STT", "Ma SV", "Ho Dem", "Ten", "Ten Mon Hoc", "Diem", "Diem Tong Ket"));

        for (int i = 0; i < diems.length; i++) {
            tblMonHoc monHoc = getMonHoc(diems[i].getMaMonHoc());
            tblSinhVien sinhVien = getSinhVien(diems[i].getMaSinhVien());


            double tongDiem = 0;
            int soMonHoc = 0;

            for (int j = 0; j < diems.length; j++) {
                if (diems[j].getMaSinhVien().equals(diems[i].getMaSinhVien())) {
                    tongDiem += diems[j].getDiemSo();
                    soMonHoc++;
                }
            }

            double diemTongKet = (soMonHoc > 0) ? (tongDiem / soMonHoc) : 0;
            System.out.println(String.format("%3d | %-10s | %-15s | %-10s | %-20s | %-10.1f | %-15.1f |",
                    i + 1, diems[i].getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),
                    monHoc.getTenMonHoc(), diems[i].getDiemSo(), diemTongKet));
        }
    }

    //=================================================TIM KIEM=============================================


    public static void timKiemSinhVien() {
        System.out.println("Moi nhap sinh vien can tim ");
        String maSV = scanner.next();
        System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-20s | %-10s | %-15s |",
                "STT", "Ma SV", "Ho Dem", "Ten", "Ten Mon Hoc", "Diem", "Diem Tong Ket"));

        double tongDiem = 0;
        int soMonHoc = 0;

        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaSinhVien().equals(maSV)) {
                tblSinhVien sinhVien = getSinhVien(diems[i].getMaSinhVien());
                tblMonHoc monHoc = getMonHoc(diems[i].getMaMonHoc());

                tongDiem += diems[i].getDiemSo();
                soMonHoc++;

                double diemTongKet = tongDiem / soMonHoc;
                System.out.println(String.format("%3d | %-10s | %-15s | %-10s | %-20s | %-10.1f | %-15.2f |",
                        i + 1, diems[i].getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),
                        monHoc.getTenMonHoc(), diems[i].getDiemSo(), diemTongKet));
            }
        }

        if (soMonHoc == 0) {
            System.out.println("Khong co bang diem cho sinh vien " + maSV);
        }
    }




    public static void timKiemMonHoc() {
        System.out.println("Moi ban nhap ma mon muon tim ");
        String maMon = scanner.next();
        System.out.println(String.format("%3s | %-10s | %-15s | %-10s | %-10s | %-20s | %-10s | %-15s |",
                "STT", "Ma SV", "Ho Dem", "Ten","MMH" , "Ten Mon Hoc", "Diem", "Diem Trung Binh"));

        double tongDiem = 0;
        int soSinhVien = 0;

        for (int i = 0; i < diems.length; i++) {
            if (diems[i].getMaMonHoc().equals(maMon)) {
                tblSinhVien sinhVien = getSinhVien(diems[i].getMaSinhVien());
                tblMonHoc monHoc = getMonHoc(diems[i].getMaMonHoc());

                tongDiem += diems[i].getDiemSo();
                soSinhVien++;

                double diemTrungBinh = tongDiem / soSinhVien;
                System.out.println(String.format("%3d | %-10s | %-15s | %-10s | %-10s | %-20s | %-10.1f | %-15.2f |",
                        i + 1, diems[i].getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),monHoc.getMaMonHoc(), monHoc.getTenMonHoc(),
                        diems[i].getDiemSo(), diemTrungBinh));
            }
        }

        if (soSinhVien == 0) {
            System.out.println("Khong co sinh vien nao hoc mon hoc " + maMon);
        }
    }


}
