package QlSv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<tblSinhVien> sinhViens = new ArrayList<>();
    public static ArrayList<tblMonHoc> monHocs = new ArrayList<>();
    public static ArrayList<tblDiem> diems = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sinhViens.add(new tblSinhVien("sv1", "Nguyen", "Cuong", 2003, "nam"));
        sinhViens.add(new tblSinhVien("sv2", "Nguyen", "Tuan", 2003, "nam"));
        sinhViens.add(new tblSinhVien("sv3", "Nguyen", "Truong", 2003, "nam"));
        sinhViens.add(new tblSinhVien("sv4", "Nguyen", "Cuc", 2003, "nu"));

        monHocs.add(new tblMonHoc("mh1", "C++", 4));
        monHocs.add(new tblMonHoc("mh2", "PowerPoint", 2));
        monHocs.add(new tblMonHoc("mh3", "Python", 4));
        monHocs.add(new tblMonHoc("mh4", "Java", 2));
        monHocs.add(new tblMonHoc("mh5", "Pascan", 2));

        diems.add(new tblDiem("sv1","mh1",9));
        diems.add(new tblDiem("sv1","mh2",9));
        diems.add(new tblDiem("sv2","mh3",9));
        diems.add(new tblDiem("sv2","mh4",9));
        diems.add(new tblDiem("sv3","mh4",8));
        diems.add(new tblDiem("sv3","mh5",7));
        diems.add(new tblDiem("sv4","mh1",9));
        diems.add(new tblDiem("sv4","mh5",9));
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

            switch (choose) {
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
                    hienThiBangDiemCuaTatCaSinhVien();
                    hienThiBangDiemCuaTatCaMonHoc();
                    break;
                case 5:
                    timKiemDSSinhVien();
                    break;
                case 6:
                    timKiemDSmonHoc();
                    break;
                case 0:
                    System.out.println("Thoat truong trinh !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le moi chon lai ! ");
            }
        } while (choose != 0);
    }



//========================================================SINH VIEN==================================================


    public static void quanLySinhVien() {


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

            switch (choose) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
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
        } while (choose != 0);
    }


    public static void themSinhVien() {
        System.out.println("Nhap thong tin sinh vien moi: ");
        System.out.println("Moi ban nhap MSV: ");
        String maSinhVien = scanner.next();
        System.out.println("Moi ban nhap ho dem: ");
        String hoDem = scanner.next();
        System.out.println("Moi ban nhap ten sinh vien: ");
        String ten = scanner.next();
        System.out.println("Moi ban nhap nam sinh: ");
        int namSinh = scanner.nextInt();
        System.out.println("Moi ban nhap gioi tinh: ");
        String gioiTinh = scanner.next();
        tblSinhVien sinhVien = new tblSinhVien(maSinhVien, hoDem, ten, namSinh, gioiTinh);
        sinhViens.add(sinhVien);
        System.out.println("Ban da them thanh cong !");
        hienThiSinhVien();
    }

    public static void hienThiSinhVien() {
        System.out.println("=========Danh sach sinh vien:==========");
        System.out.println(String.format("| %-5s | %-8s | %-8s | %-8s | %-8s |", "MSV", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh"));
        for (tblSinhVien sinhVien : sinhViens) {
            System.out.println(String.format("| %-5s | %-8s | %-8s | %-8d | %-9s |",
                    sinhVien.getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),
                    sinhVien.getNamSinh(), sinhVien.getGioiTinh()));
        }
    }

    public static tblSinhVien timKiemSv(String maSV) {
        for (tblSinhVien timMasv : sinhViens) {
            if (timMasv.getMaSinhVien().equals(maSV)) {
                return timMasv;
            }
        }
        return null;
    }

    public static void suaSinhVien() {
        System.out.println("Nhap ma sinh vien muon sua: ");
        String maSv = scanner.next();
        tblSinhVien suaSinhVien = timKiemSv(maSv);

        if (suaSinhVien != null) {
            System.out.println("Nhap Ho Dem moi: ");
            String hoDem = scanner.next();
            System.out.println("Nhap ten moi: ");
            String ten = scanner.next();
            System.out.println("Nhap nam sinh moi: ");
            int namSinh = scanner.nextInt();
            System.out.println("Nhap gioi tinh moi: ");
            String gioiTinh = scanner.next();
            suaSinhVien.setHoDem(hoDem);
            suaSinhVien.setTen(ten);
            suaSinhVien.setNamSinh(namSinh);
            suaSinhVien.setGioiTinh(gioiTinh);
            System.out.println("Sua thanh cong !");
            hienThiSinhVien();
        } else {
            System.out.println("Khong tim thay ma sinh vien: " + maSv + "Nay ");
        }
    }

    public static void xoaSinhVien() {
        System.out.println("Nhap ma sinh vien muon xoa: ");
        String maSv = scanner.next();
        tblSinhVien xoaSinhVien = timKiemSv(maSv);
        if (xoaSinhVien != null) {
            sinhViens.remove(xoaSinhVien);
            System.out.println("Da xoa thanh cong! ");
            hienThiSinhVien();
        } else {
            System.out.println("Khong tim thay ma sinh vien: " + maSv + "Nay ");
        }
    }


    public static void sapXepTheoTenSinhVien() {
        Collections.sort(sinhViens, new Comparator<tblSinhVien>() {
            @Override
            public int compare(tblSinhVien sv1, tblSinhVien sv2) {
                return sv1.getTen().compareTo(sv2.getTen());
            }
        });
        hienThiSinhVien();

    }


    //=====================================================MON HOC====================================================
    public static void quanLyMonHoc() {

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

            switch (choose) {
                case 1:
                    themMonHoc();
                    break;
                case 2:
                    suaMonHoc();
                    break;
                case 3:
                    xoaMonHoc();
                    break;
                case 4:
                    sapXepThepTenMon();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }
        } while (choose != 0);
    }


    public static void hienThiMonHoc() {
        System.out.println("=======Danh sach mon hoc=======");
        System.out.println(String.format("| %-5s | %-10s | %-7s |", "Ma MH", "Ten MH", "He So"));
        for (tblMonHoc monHoc : monHocs) {
            System.out.println(String.format("| %-5s | %-10s | %-7s |", monHoc.getMaMonHoc(), monHoc.getTenMonHoc(),
                    monHoc.getHeSoMonHoc()));
        }
    }

    public static void themMonHoc() {
        System.out.println("Moi ban nhap thong tin mon hoc moi: ");
        System.out.println("Moi ban nhap ma mon hoc moi: ");
        String maMH = scanner.next();
        System.out.println("Moi ban nhap ten mon hoc moi: ");
        String tenMH = scanner.next();
        System.out.println("Moi ban nhap he so mon hoc moi: ");
        int heSoMH = scanner.nextInt();
        tblMonHoc monHoc = new tblMonHoc(maMH, tenMH, heSoMH);
        monHocs.add(monHoc);
        System.out.println("Them mon hoc thanh cong !");
        hienThiMonHoc();
    }

    public static tblMonHoc timKiemMH(String maMH) {
        for (tblMonHoc timMH : monHocs) {
            if (timMH.getMaMonHoc().equals(maMH)) {
            return timMH;
        }
    }
        return null;
}

    public static void suaMonHoc(){
        System.out.println("Moi ban nhap ma mon hoc muon sua: ");
        String maMH = scanner.next();
        tblMonHoc suaMon = timKiemMH(maMH);
        if (suaMon !=null){
            System.out.println("Moi ban nhap ten mon hoc moi: ");
            String tenMH = scanner.next();
            System.out.println("Moi ban nhap he so mon hoc moi: ");
            int heSo = scanner.nextInt();
            suaMon.setTenMonHoc(tenMH);
            suaMon.setHeSoMonHoc(heSo);
            System.out.println("Da sua thanh cong! ");
            hienThiMonHoc();
        }else {
            System.out.println("Khong tim thay ma mon hoc" + maMH + "nay: ");
        }
    }

    public static void xoaMonHoc(){
        System.out.println("Nhap ma mon hoc muon xoa: ");
        String maMH = scanner.next();
        tblMonHoc xoaMH = timKiemMH(maMH);
        if (xoaMH != null){
            monHocs.remove(xoaMH);
            System.out.println("Da xoa thanh cong");
            hienThiMonHoc();
        }else {
            System.out.println("khong tim thay ma mon hoc " + maMH + "nay: ");
        }
    }

    public static void sapXepThepTenMon(){
        Collections.sort(monHocs, new Comparator<tblMonHoc>() {
            @Override
            public int compare(tblMonHoc mh1, tblMonHoc mh2) {
                return mh1.getTenMonHoc().compareTo(mh2.getTenMonHoc());
            }
        });
        hienThiMonHoc();
    }
//    //========================================================Bang Diem==================================================

    public static void quanLyBangDiem() {

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

            switch (choose) {
                case 1:
                    themDiemSo();
                    break;
                case 2:
                    suaDiem();
                    break;
                case 3:
                    xoaDiem();
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }
        } while (choose != 0);
    }


    public static void hienThiBangDiem(){
        System.out.println("=========Danh sach banh diem ==========");
        System.out.println(String.format("| %-5s | %-5s | %-5s |","MSV","MMH","Diem"));
        for (tblDiem diem : diems){
            System.out.println(String.format("| %-5s | %-5s | %-5s |",diem.getMaSinhVien(),diem.getMaMonHoc(),diem.getDiemSo()));
        }
    }

    public static void themDiemSo(){
        System.out.println("Moi ban nhap ma sinh vien: ");
        String maSV = scanner.next();
        System.out.println("Moi ban nhap ma mon: ");
        String maMon = scanner.next();
        System.out.println("Moi ban nhap diem" );
        Float diem = scanner.nextFloat();

        for (tblDiem tblDiem : diems){
            if (tblDiem.getMaSinhVien().equals(maSV) && tblDiem.getMaMonHoc().equals(maMon)){
                System.out.println("Diem cho sinh vien nay va mon hoc nay da ton tai: ");
                return;
            }
        }

        tblDiem themDiem = new tblDiem(maSV,maMon,diem);
        diems.add(themDiem);
        System.out.println("them diem thanh cong: ");
        hienThiBangDiem();
    }



    public static tblDiem timThongTin(String maSinhVien, String maMonHoc){
        for (tblDiem timThongTin : diems){
            if (timThongTin.getMaSinhVien().equals(maSinhVien) && timThongTin.getMaMonHoc().equals(maMonHoc)){
                return timThongTin;
            }
        }
        return null;
    }
    public static void suaDiem(){
        System.out.println("Nhap ma sinh vien va ma mon hoc can xoa: ");
        System.out.println("Moi ban nhap ma sinh vien: ");
        String maSV = scanner.next();
        System.out.println("Moi ban nhap ma mon hoc: ");
        String maMH = scanner.next();

        tblDiem suaDiem = timThongTin(maSV,maMH);
        if (suaDiem !=null){
            System.out.println("Moi ban nhap diem moi");
            float diemMoi = scanner.nextFloat();
            suaDiem.setDiemSo(diemMoi);
            System.out.println("Da sua diem thanh cong: ");
            hienThiBangDiem();
        }else {
            System.out.println("Khong tim thay diem ");
        }

    }

    public static void xoaDiem(){
        System.out.println("Nhap ma sinh vien va ma mon hoc can xoa: ");
        System.out.println("Moi ban nhap ma sinh vien: ");
        String maSV = scanner.next();
        System.out.println("Moi ban nhap ma mon hoc: ");
        String maMH = scanner.next();
        tblDiem xoaDiem = timThongTin(maSV,maMH);
        if (xoaDiem != null){
            diems.remove(xoaDiem);
            System.out.println("Da xoa thanh cong: ");
            hienThiBangDiem();
        }else {
            System.out.println("Khong tim thay diem ");
        }
    }

//    =================================================HienThi=========================================

    public static void hienThiBangDiemCuaTatCaSinhVien() {
        System.out.println("==========Danh sach Bang Diem:==========");
        System.out.println(String.format("| %-5s | %-8S | %-8S | %-10S | %-5S |", "Msv" , "Ho dem","Ten","Mon Hoc","Diem"));
        for (tblSinhVien sinhVien : sinhViens) {
            for (tblMonHoc monHoc : monHocs) {
                for (tblDiem diem : diems) {
                    if (diem.getMaSinhVien().equals(sinhVien.getMaSinhVien()) && diem.getMaMonHoc().equals(monHoc.getMaMonHoc())) {
                        System.out.printf("| %-5s | %-8S | %-8S | %-10S | %-5S |\n",
                                sinhVien.getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),monHoc.getTenMonHoc() ,diem.getDiemSo());
                    }
                }
            }
        }
    }
    public static void hienThiBangDiemCuaTatCaMonHoc() {
        System.out.println("==========Danh sach Mon Hoc:==========");
        System.out.println(String.format("| %-5s | %-10S | %-5S | %-10S | %-10S | %-5S |", "MMH" , "TenMH","MSV","HO Dem","Ten","Diem"));
        for (tblMonHoc monHoc : monHocs) {
            for (tblDiem diem : diems) {
                for (tblSinhVien sinhVien : sinhViens) {
                    if (diem.getMaMonHoc().equals(monHoc.getMaMonHoc()) && diem.getMaSinhVien().equals(sinhVien.getMaSinhVien())) {
                        System.out.printf("| %-5s | %-10S | %-5S | %-10S | %-10S | %-5S |\n",
                              monHoc.getMaMonHoc(),monHoc.getTenMonHoc(),sinhVien.getMaSinhVien(),sinhVien.getHoDem(),sinhVien.getTen(),
                                diem.getDiemSo());
                    }
                }
            }
        }
    }

    public static void timKiemDSSinhVien() {
        System.out.print("Moi ban nhap ma sinh vien muon tim: ");
        String maSV = scanner.next();
        System.out.println("==========Danh sach Bang Diem:==========");
        System.out.println(String.format("| %-5s | %-8s | %-8s | %-10s | %-5s |", "Msv", "Ho dem", "Ten", "Mon Hoc", "Diem"));

        boolean kiemTra = false;
        for (tblSinhVien sinhVien : sinhViens) {
            if (sinhVien.getMaSinhVien().equals(maSV)) {
                for (tblDiem diem : diems) {
                    if (diem.getMaSinhVien().equals(sinhVien.getMaSinhVien())) {
                        for (tblMonHoc monHoc : monHocs) {
                            if (diem.getMaMonHoc().equals(monHoc.getMaMonHoc())) {
                                System.out.printf("| %-5s | %-8s | %-8s | %-10s | %-5s |\n",
                                        sinhVien.getMaSinhVien(), sinhVien.getHoDem(), sinhVien.getTen(),
                                        monHoc.getTenMonHoc(), diem.getDiemSo());
                                kiemTra = true;
                            }
                        }
                    }
                }
            }
        }
        if (!kiemTra) {
            System.out.println("Khong tim thay ma sinh vien nay !");
        }
    }

    public static void timKiemDSmonHoc() {
        System.out.println("Moi ban nhap ma mon hoc Muon tim: ");
        String maMH = scanner.next();
        System.out.println("==========Danh sach Mon Hoc:==========");
        System.out.println(String.format("| %-5s | %-10S | %-5S | %-10S | %-10S | %-5S |", "MMH", "TenMH", "MSV", "HO Dem", "Ten", "Diem"));

        boolean kieTra = false;
        for (tblMonHoc monHoc : monHocs) {
            if (monHoc.getMaMonHoc().equals(maMH)) {
                for (tblDiem diem : diems) {
                    if (diem.getMaMonHoc().equals(monHoc.getMaMonHoc())) {
                        for (tblSinhVien sinhVien : sinhViens) {
                            if (diem.getMaSinhVien().equals(sinhVien.getMaSinhVien())) {
                                System.out.printf("| %-5s | %-10S | %-5S | %-10S | %-10S | %-5S |\n",
                                        monHoc.getMaMonHoc(), monHoc.getTenMonHoc(), sinhVien.getMaSinhVien(),
                                        sinhVien.getHoDem(), sinhVien.getTen(), diem.getDiemSo());
                                kieTra = true;
                            }
                        }
                    }
                }
            }
        }

        if (!kieTra) {
            System.out.println("Khong tim thay mon hoc nay.");
        }
    }

}