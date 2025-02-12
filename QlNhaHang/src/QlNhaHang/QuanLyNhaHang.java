package QlNhaHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhaHang {
    public static ArrayList<KhachHang> khachHangs = new ArrayList<>();
    public static ArrayList<Ban> bans = new ArrayList<>();
    public static ArrayList<ThucDon> thucDons = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    public static ArrayList<Hoadon> hoadons = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    static {

//          ===================KHACH HANG=====================
        khachHangs.add(new KhachHang("Kh1", "Cuong", 21, "Nam", "0123456789"));
        khachHangs.add(new KhachHang("Kh2", "Cuc", 21, "Nu", "0111111111"));
        khachHangs.add(new KhachHang("Kh3", "Truong", 21, "Nam", "0222222222"));
        khachHangs.add(new KhachHang("Kh4", "Chi", 21, "Nu", "0333333333"));

//          ===================BAN=====================
        bans.add(new Ban("B1", 4, "Con trong"));
        bans.add(new Ban("B2", 5, "Con trong"));
        bans.add(new Ban("B3", 4, "Con trong"));
        bans.add(new Ban("B4", 6, "Con trong"));
        bans.add(new Ban("B5", 8, "Con trong"));

//        ===================MON AN=====================
        thucDons.add(new ThucDon("M1","Pho Bo","An",30000));
        thucDons.add(new ThucDon("M2","Com Rang","An",30000));
        thucDons.add(new ThucDon("M3","Banh mi","An",20000));
        thucDons.add(new ThucDon("M4","Pho ga","An",30000));
        thucDons.add(new ThucDon("M5","Com tam","An",30000));

//        ===================NUOC UONG=====================
        thucDons.add(new ThucDon("N1","Co ca","Uong",15000));
        thucDons.add(new ThucDon("N2","Tra dao","Uong",20000));
        thucDons.add(new ThucDon("N3","Bia","Uong",15000));
        thucDons.add(new ThucDon("N4","Sua","Uong",10000));


    }


    public static void themKhachHang() {
        hienThiKhachHang();
        System.out.println("Moi ban nhap thong tin khach hang muon them: ");

        System.out.println("Moi ban nhap ma khach hang: ");
        String maKhachHang = scanner.next();

        System.out.println("Moi ban nhap ten khach hang: ");
        String tenKhachHang = scanner.next();

        System.out.println("Moi ban nhap tuoi khach hang: ");
        int tuoiKhachHang = scanner.nextInt();

        System.out.println("Moi ban nhap gioi tinh: ");
        String gioiTinh = scanner.next();

        System.out.println("Moi ban nhap so dien thoai: ");
        String soDienThoai = scanner.next();

        KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, tuoiKhachHang, gioiTinh, soDienThoai);
        khachHangs.add(khachHang);
        System.out.println("Ban da them khach hang thanh cong !");
        hienThiKhachHang();
    }


    public static void suaKhachHang() {
        hienThiKhachHang();
        System.out.println("Moi ban nhap ma khach hang muon sua: ");
        String maKhachHang = scanner.next();

        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getMaKhachHang().equals(maKhachHang)) {
                System.out.println("Moi ban nhap thong tin moi cho khach hang: ");
                scanner.nextLine();

                System.out.println("Moi ban nhap ten moi cho khach hang: ");
                String tenMoi = scanner.nextLine();

                System.out.println("Moi ban nhap tuoi moi cho khach hang: ");
                int tuoiMoi = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Moi ban nhap gioi tinh moi cho khach hang: ");
                String gioiTinhMoi = scanner.nextLine();

                System.out.println("Moi ban nhap so dien thoai moi cho khach hang: ");
                String soDtMoi = scanner.nextLine();

                khachHang.setTenKhachHang(tenMoi);
                khachHang.setTuoiKhachHang(tuoiMoi);
                khachHang.setGioiTinh(gioiTinhMoi);
                khachHang.setSoDienThoai(soDtMoi);
                System.out.println("Da sua thanh cong !");
                hienThiKhachHang();
                return;
            }
        }
        System.out.println("Khong tim thay ma Khach hang " + maKhachHang);
    }


    public static void xoaKhachHang() {
        hienThiKhachHang();
        System.out.println("Nhap ma khach hang muon xoa: ");
        String maKhachHang = scanner.next();

        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getMaKhachHang().equals(maKhachHang)) {
                khachHangs.remove(khachHang);
                System.out.println("Da xoa thanh cong! ");
                hienThiKhachHang();
                return;
            }
        }
        System.out.println("Khong tim thay ma khach hang " + maKhachHang);
    }


    public static void hienThiKhachHang() {
        System.out.println("============DANH SACH KHACH HANG===========");
        System.out.println(String.format("| %-5s | %-8s | %-5s | %-8s | %-13s |", "MKH", "Ten", "Tuoi", "Gioi Tinh", "SDT"));
        for (KhachHang khachHang : khachHangs) {
            System.out.println(String.format("| %-5s | %-8s | %-5s | %-9s | %-13s |",
                    khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getTuoiKhachHang(),
                    khachHang.getGioiTinh(), khachHang.getSoDienThoai()));
        }
    }

//    ===============================================================================================================
//    ===============================================================================================================




    public static void themBan() {
        hienThiDanhSachBan();
        System.out.println("Moi ban nhap ma ban muon them : ");
        String maBan = scanner.next();

        System.out.println("Moi ban nhap so luong ghe ngoi: ");
        int soLuongGhe = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Moi ban nhap trang thai ban (Da dat/Con trong): ");
        String trangThai = scanner.nextLine();

        Ban ban = new Ban(maBan, soLuongGhe, trangThai);
        bans.add(ban);
        System.out.println("Da them thanh cong !");
        hienThiDanhSachBan();
    }

    public static void suaBan(){
        hienThiDanhSachBan();
        System.out.println("Moi ban nhap ma ban muon sua: ");
        String maBan = scanner.next();

        for (Ban ban : bans){
            if (ban.getMaBan().equals(maBan)){
                System.out.println("Moi ban nhap thong tin moi: ");
                scanner.nextLine();

                System.out.println("Moi ban nhap so luong ghe: ");
                int soLuongMoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Moi ban nhap trang thai: ");
                String trangThaiM = scanner.nextLine();
                ban.setSoLuongGhe(soLuongMoi);
                ban.setTrangThai(trangThaiM);
                System.out.println("Da sua thanh cong: ");
                hienThiDanhSachBan();
            }
        }
        System.out.println("Khong co ma ban " + maBan);
    }

    public static void xoaBan(){
        hienThiDanhSachBan();
        System.out.println("Moi ban nhap ma ban muon xoa :");
        String maBan = scanner.next();

        for (Ban ban : bans){
            if (ban.getMaBan().equals(maBan)){
                bans.remove(ban);
                    System.out.println("Da xoa thanh cong: ");
                    hienThiDanhSachBan();
                return;
            }
        }
        System.out.println("Khong tim thay ma ban " + maBan);
    }


    public static void hienThiDanhSachBan() {
        System.out.println("==========DANH SACH BAN==========");
        System.out.println(String.format("| %-5s | %-5s | %-8s |", "Ma ban", "So Luong ghe ", "Trang thai"));
        for (Ban ban : bans) {
            System.out.println(String.format("| %-6s | %-13s | %-10s |", ban.getMaBan(), ban.getSoLuongGhe(), ban.getTrangThai()));
        }
    }

    public static void datBan(){
        System.out.println("Danh sach ban con trong la :");
        boolean kiemTra = false;

        System.out.println(String.format("| %-5s | %-5s | %-8s |", "Ma ban", "So Luong ghe ", "Trang thai"));
        for (Ban ban: bans){
            if (ban.getTrangThai().equals("Con trong")){
                kiemTra = true;
                System.out.println(String.format("| %-6s | %-13s | %-10s |", ban.getMaBan(), ban.getSoLuongGhe(), ban.getTrangThai()));
            }
        }
        if (! kiemTra){
            System.out.println("Hien tai khong con ban trong !");
            return;
        }



        System.out.println("Moi ban nhap ma Khach hang muon dat ban: ");
        String maKhachHang = scanner.next();
        KhachHang khachDatBan = null;
        for (KhachHang khachHang : khachHangs){
            if (khachHang.getMaKhachHang().equals(maKhachHang)){
                khachDatBan = khachHang;
                break;
            }
        }
        if (khachDatBan == null){
            System.out.println("Khong tim thay khach hang nay! ");
            return;
        }

        System.out.println("Moi ban nhap Ma ban muon dat :");
        String maBan = scanner.next();
        Ban checkk = null;
        for (Ban ban : bans){
            if (ban.getMaBan().equals(maBan) && ban.getTrangThai().equals("Con trong")){
                checkk = ban;
                break;
            }
        }
        if (checkk == null){
            System.out.println("Ma ban khong hop le hoac ban da duoc dat! ");
            return;
        }

        checkk.setTrangThai("Da dat");
        System.out.println("Ban da duoc dat cho khach hang " + khachDatBan.getTenKhachHang() + "!");
        hienThiDanhSachBan();

    }


    public static void themThucDon(){
        hienThiThucDon();

        System.out.println("Moi ban nhap ma Mon muon them: ");
        String maMon = scanner.nextLine();

        System.out.println("Moi ban nhap ten mon: ");
        String tenMon = scanner.nextLine();

        System.out.println("Moi ban nhap loai mon An/Uong: ");
        String loaiMon = scanner.nextLine();

        System.out.println("Moi ban nhap gia tien: ");
        double giaMon = scanner.nextDouble();
        scanner.nextLine();

        ThucDon thucDon = new ThucDon(maMon,tenMon,loaiMon,giaMon);
        thucDons.add(thucDon);
        System.out.println("Them mon thanh cong! ");
        hienThiThucDon();
    }

    public static void hienThiThucDon(){
        System.out.println("=========THUC DON CUA QUAN=========");

        System.out.println("============Mon an:============");
        System.out.println(String.format("| %-5s | %-8s | %-8s |","MM","Ten mon","Gia(VND)"));
        for (ThucDon thucDon: thucDons){
            if (thucDon.getLoaiMon().equals("An")){
                System.out.println(String.format("| %-5s | %-8s | %-8s |",thucDon.getMaMon(),thucDon.getTenMon(),thucDon.getGia()));
            }
        }


        System.out.println(" ");
        System.out.println("============Nuoc Uong:============");
        System.out.println(String.format("| %-5s | %-8s | %-8s |","MM","Ten mon","Gia(VND)"));
        for (ThucDon thucDon: thucDons){
            if (thucDon.getLoaiMon().equals("Uong")){
                System.out.println(String.format("| %-5s | %-8s | %-8s |",thucDon.getMaMon(),thucDon.getTenMon(),thucDon.getGia()));
            }
        }

    }

    public static void timKiemThucDon(){
        hienThiThucDon();
        System.out.println("Nhap ten mon an hoac nuoc uong ban muon tim: ");
        String tenMon = scanner.nextLine().toLowerCase();

        boolean check = false;

        System.out.println("========Mon ban can tim la: =======");

        System.out.println(String.format("| %-5s | %-8s | %-8s |","MM","Ten mon","Gia(VND)"));
        for (ThucDon thucDon : thucDons){
            if (thucDon.getTenMon().toLowerCase().contains(tenMon)){
                System.out.println(String.format("| %-5s | %-8s | %-8s |",thucDon.getMaMon(),thucDon.getTenMon(),thucDon.getGia()));
                check = true;
            }
        }

        if (! check){
            System.out.println("Khong tim thay mon an hoac nuoc uong voi ten " + tenMon);
        }
    }


    public static void datMon() {
        hienThiKhachHang();
        System.out.println("Nhập mã khách hàng muốn đặt món: ");
        String maKhachHang = scanner.next();
        KhachHang khachHang = null;

        for (KhachHang kh : khachHangs) {
            if (kh.getMaKhachHang().equals(maKhachHang)) {
                khachHang = kh;
                break;
            }
        }
        if (khachHang == null) {
            System.out.println("Không tìm thấy khách hàng với mã " + maKhachHang);
            return;
        }

        System.out.println("Nhap ma don hang: ");
        String maDon = scanner.next();
        Order order = new Order(maDon,khachHang);

        hienThiThucDon();
        while (true) {
            System.out.println("Nhập mã món muốn thêm vào đơn hàng: ");
            String maMon = scanner.next();
            ThucDon monChon = null;

            for (ThucDon thucDon : thucDons) {
                if (thucDon.getMaMon().equals(maMon)) {
                    monChon = thucDon;
                    break;
                }
            }

            if (monChon == null) {
                System.out.println("Ma mon khong ton tai : ");
            } else {
                order.themMon(monChon);
                System.out.println("Mon " + monChon.getTenMon() + " da them !");
            }
            System.out.println("Ban co muon dat them mon (Co/Khong): ");
            String chon = scanner.next();
            if(chon.equalsIgnoreCase("Khong")){
                break;
            }

        }

        orders.add(order);
        System.out.println("Da dat mon thanh cong: ");
        hienThiThongTinDonHang(order);
        System.out.println("Hoan tat! ");
    }

    public static void hienThiThongTinDonHang(Order order) {
        System.out.println("=========THONG TIN DON HANG=========");
        System.out.println(String.format("| %-8s | %-8s | %-10s |","Ma Order","Ten Khach","Ten Mon"));
        for (ThucDon mon : order.getDanhSachMon()) {
            System.out.println(String.format("| %-8s | %-9s | %-10s |", order.getMaOrder(), order.getKhachHang().getTenKhachHang(), mon.getTenMon()));
        }
    }

    public static void hoaDon() {
        System.out.println("Nhap ma Don Hang de thanh toan: ");
        String maHoaDon = scanner.next();
        Order order = null;

        for (Order order1 : orders) {
            if (order1.getMaOrder().equals(maHoaDon)) {
                order = order1;
                break;
            }
        }

        if (order != null) {
            Hoadon hoadon = new Hoadon("HD" + maHoaDon, order.getKhachHang(), order);
            System.out.println("==========Hóa Đơn Của Khách Hàng===========");
            System.out.println("Mã Hóa Đơn: " + hoadon.getMaHoaDon());
            System.out.println("Tên Khách Hàng: " + hoadon.getKhachHang().getTenKhachHang());
            System.out.println("Các Món Đã Gọi:");
            System.out.println(String.format("| %-8s | %-10s | %-10s |", "Mã Món", "Tên Món", "Giá(VND)"));

            for (ThucDon thucDon : order.getDanhSachMon()) {
                System.out.println(String.format("| %-8s | %-10s | %-10s |",
                        thucDon.getMaMon(), thucDon.getTenMon(), thucDon.getGia()));
            }
            System.out.println("=========================================");
            System.out.println("Tổng Tiền: " + hoadon.getTongTien());
        } else {
            System.out.println("Không tìm thấy Hoa don nao với mã " + maHoaDon);
        }
    }

    public static void hienThiTatCaHoaDon() {


        System.out.println("========== DANH SÁCH TẤT CẢ HÓA ĐƠN ==========");
        for (Order order : orders) {
            Hoadon hoadon = new Hoadon("HD" + order.getMaOrder(), order.getKhachHang(), order);
            System.out.println("Mã Hóa Đơn: " + hoadon.getMaHoaDon());
            System.out.println("Tên Khách Hàng: " + hoadon.getKhachHang().getTenKhachHang());
            System.out.println("Các Món Đã Gọi:");
            System.out.println(String.format("| %-8s | %-10s | %-10s |", "Mã Món", "Tên Món", "Giá (VND)"));

            for (ThucDon thucDon : order.getDanhSachMon()) {
                System.out.println(String.format("| %-8s | %-10s | %-10s |",
                        thucDon.getMaMon(), thucDon.getTenMon(), thucDon.getGia()));
            }

            System.out.println("=================================");
            System.out.println("Tổng Tiền: " + hoadon.getTongTien() + " VND");
            System.out.println("=================================");
        }
    }


    public static void thanhToan(){
        System.out.println("Moi ban nhap ma khach hang can thanh toan: ");
        String maKhachHang = scanner.next();
        KhachHang khachDatBan = null;
        for (KhachHang khachHang : khachHangs){
            if (khachHang.getMaKhachHang().equals(maKhachHang)){
                khachDatBan = khachHang;
                break;
            }
        }
        if (khachDatBan == null){
            System.out.println("Khong tim thay khach hang nay! ");
            return;
        }

        System.out.println("Moi ban nhap ma ban can thanh toan: ");
        String maBan = scanner.next();
        Ban checkk = null;
        for (Ban ban : bans) {
            if (ban.getMaBan().equals(maBan) && ban.getTrangThai().equals("Da dat")) {
                checkk = ban;
                break;
            }
        }

        if (checkk == null) {
            System.out.println("Ma ban khong hop le !");
            return;
        }

        Order order = null;
        for (Order ord : orders) {
            if (ord.getKhachHang().getMaKhachHang().equals(maKhachHang)) {
                order = ord;
                break;
            }
        }

        if (order != null) {
            Hoadon hoadon = new Hoadon("HD" + order.getMaOrder(), order.getKhachHang(), order);
            double tongTien = hoadon.getTongTien(); // Tổng tiền từ hóa đơn

            System.out.println("Moi ban nhap so tien can thanh toan: ");
            double soTien = scanner.nextDouble();

            if (soTien == tongTien) {
                System.out.println("Thanh toan thanh cong!");
                checkk.setTrangThai("Con trong");
                hienThiDanhSachBan();
            } else {
                System.out.println("So tien nhap khong dung!");
            }
        } else {
            System.out.println("Khong tim thay hoa don cua khach hang!");
        }

    }





}

