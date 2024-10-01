package NhanSu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static CanBo[] canBos = new CanBo[10];
    public static CongNhan[] congNhans = new CongNhan[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        canBos[0] = new CanBo(1, "Nguyen", "Cuong", 2003, "Nam",
                new Phong("a", "Nam"), "Chu tich", 2, "A", 200000);
        canBos[1] = new CanBo(2, "Nguyen", "Cuc", 2003, "Nu",
                new Phong("b", "Nam"), "Thu ki", 2, "B", 400000);
        canBos[2] = new CanBo(3, "Pham", "Tuan", 2003, "Nam",
                new Phong("c", "Nam"), "Giam Doc", 2, "C", 100000);
        canBos[3] = new CanBo(4, "Nguyen", "Linh", 2003, "Nu",
                new Phong("d", "Nam"), "Tro Ly", 2, "A", 300000);
        canBos[4] = new CanBo(5, "Nguyen", "Huy", 2003, "Nam",
                new Phong("a", "Nam"), "Chu tich", 2, "A", 400000);

        //==================================================================================================================

        congNhans[0] = new CongNhan(01, "Nguyen", "Hai", 2003, "Nam",
                new XuongSX("00", "Truong", 20), "Cong Nhan", 30, 200000);
        congNhans[1] = new CongNhan(02, "Nguyen", "Cuong", 2003, "Nam",
                new XuongSX("00", "Truong", 20), "Cong Nhan", 30, 500000);
        congNhans[2] = new CongNhan(03, "Nguyen", "Hoang", 2003, "Nam",
                new XuongSX("00", "Truong", 20), "Cong Nhan", 30, 100000);
        congNhans[3] = new CongNhan(04, "Nguyen", "Diep", 2003, "Nam",
                new XuongSX("00", "Truong", 20), "Cong Nhan", 30, 100000);
        congNhans[4] = new CongNhan(05, "Nguyen", "Long", 2003, "Nam",
                new XuongSX("00", "Truong", 20), "Cong Nhan", 30, 110000);


        int choose = 0;
        do {
            System.out.println("==============MENU============");
            System.out.println("1 .Hien thi danh sach nhan su :");
            System.out.println("2. Hien thi danh sach cong nhan nam :");
            System.out.println("3. Hien thi danh sach can bo nu :");
            System.out.println("4. Hien thi danh sach can bo co luong cao nhat :");
            System.out.println("5. Hien thi danh sach cong nhan co luong thap nhat :");
            System.out.println("6. Tinh tong salary cua tat ca can bo va hien thi :");
            System.out.println("7. Tinh tong luong cua tat ca cong nhan, hien thi ket qua :");
            System.out.println("8. Chuyen cac cong nhan xuong cuoi danh sach, hien thi danh sach");
            System.out.println("9. Sap xep danh sach nhan su theo chieu tang dan cua ten,Hien thi :");
            System.out.println("0. Ban chon thoat !");
            System.out.println("Moi ban lua chon !");
            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap so hop le !");
                scanner.next();
            }

            switch (choose) {
                case 1:
                    System.out.println("=================Danh Sach Nhan Su la================");
                    System.out.println("======================================================");
                    hienThiDanhSachCanBo();
                    hienThiDanhSachCongNhan();
                    break;
                case 2:
                    hienThiCongNhanNam();
                    break;
                case 3:
                    hienThiCanBoNu();
                    break;
                case 4:
                    canBoLuongMax();
                    break;
                case 5:
                    congNhanLuongMin();
                    break;
                case 6:
                    tongLuongCanBo();
                    break;
                case 7:
                    tongLuongCongNhan();
                    break;
                case 8:
                    break;
                case 9:
                    xapXepTenTangDanCanBo();
                    xapXepTenTangDanCongNhan();
                    break;
                case 0:
                    System.out.println("Ban chon thoat! ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le !");
            }

        } while (choose != 0);
    }

    public static void hienThiDanhSachCanBo() {
        System.out.println("=================Danh Sach Can Bo================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-10s | %-12s | %-9s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Phong", "Truong Phong", "Chuc Vu", "He So Luong", "Xep Loai", "Luong"));
        for (int i = 0; i < canBos.length; i++) {
            if (canBos[i] != null) {
                Phong phong = canBos[i].getPhong();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-10s | %-12.2f | %-9s | %-12.2f |",
                        i + 1, canBos[i].getMaNs(), canBos[i].getHoDem(), canBos[i].getTen(), canBos[i].getNamSinh(), canBos[i].getGioiTinh(),
                        phong.getTenPhong(), phong.getTruongPhong(), canBos[i].getChucVu(), canBos[i].getHeSoLuong(), canBos[i].getXepLoai(), canBos[i].getLuong()));
            }
        }
    }

    public static void hienThiDanhSachCongNhan(){
        System.out.println("=================Danh Sach Cong Nhan================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-13s | %-12s | %-12s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Xuong", "Quan doc", "So Cong Nhan", "Cong Viec", "So Ngay Cong", "Luong"));

        for (int i = 0; i < congNhans.length; i++) {
            if (congNhans[i] != null) {
                XuongSX xuongSX = congNhans[i].getXuongSX();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-13d | %-12s | %-12d | %-12.2f |",
                        i + 1, congNhans[i].getMaNs(), congNhans[i].getHoDem(), congNhans[i].getTen(), congNhans[i].getNamSinh(), congNhans[i].getGioiTinh(),
                        xuongSX.getTenXuong(), xuongSX.getQuanDoc(), xuongSX.getSoCongNhan(), congNhans[i].getCongViec(), congNhans[i].getSoNgayCong(), congNhans[i].getLuong()));
            }
        }
    }

    public static void hienThiCongNhanNam(){
        System.out.println("=================Danh Sach Cong Nhan Nam================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-13s | %-12s | %-12s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Xuong", "Quan doc", "So Cong Nhan", "Cong Viec", "So Ngay Cong", "Luong"));
        int stt = 1;
        for (int i = 0; i < congNhans.length; i++) {
            if (congNhans[i] != null && "Nam".equalsIgnoreCase(congNhans[i].getGioiTinh())){
                XuongSX xuongSX = congNhans[i].getXuongSX();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-13d | %-12s | %-12d | %-12.2f |",
                        i + 1, congNhans[i].getMaNs(), congNhans[i].getHoDem(), congNhans[i].getTen(), congNhans[i].getNamSinh(), congNhans[i].getGioiTinh(),
                        xuongSX.getTenXuong(), xuongSX.getQuanDoc(), xuongSX.getSoCongNhan(), congNhans[i].getCongViec(), congNhans[i].getSoNgayCong(), congNhans[i].getLuong()));
                stt++;
            }
        }
    }

    public static void hienThiCanBoNu(){
        System.out.println("=================Danh Sach Can Bo Nu================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-10s | %-12s | %-9s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Phong", "Truong Phong", "Chuc Vu", "He So Luong", "Xep Loai", "Luong"));
        int stt=1;
        for (int i = 0; i < canBos.length ; i++) {
            if (canBos[i] != null && "Nu".equalsIgnoreCase(canBos[i].getGioiTinh())){
                Phong phong = canBos[i].getPhong();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-10s | %-12.2f | %-9s | %-12.2f |",
                        i + 1, canBos[i].getMaNs(), canBos[i].getHoDem(), canBos[i].getTen(), canBos[i].getNamSinh(), canBos[i].getGioiTinh(),
                        phong.getTenPhong(), phong.getTruongPhong(), canBos[i].getChucVu(), canBos[i].getHeSoLuong(), canBos[i].getXepLoai(), canBos[i].getLuong()));
                stt++;
            }
        }
    }

    public static void canBoLuongMax(){
        double maxLuong = 0;
        for (int i = 0; i < canBos.length; i++) {
            if (canBos[i] != null && canBos[i].getLuong() > maxLuong){
                maxLuong = canBos[i].getLuong();
            }
        }
        System.out.println("=================Danh Sach Can Bo Co Luong Cao Nhat================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-10s | %-12s | %-9s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Phong", "Truong Phong", "Chuc Vu", "He So Luong", "Xep Loai", "Luong"));
        int stt=1;
        for (int i = 0; i < canBos.length ; i++) {
            if (canBos[i] != null && canBos[i].getLuong() == maxLuong) {
                Phong phong = canBos[i].getPhong();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-10s | %-12.2f | %-9s | %-12.2f |",
                        i + 1, canBos[i].getMaNs(), canBos[i].getHoDem(), canBos[i].getTen(), canBos[i].getNamSinh(), canBos[i].getGioiTinh(),
                        phong.getTenPhong(), phong.getTruongPhong(), canBos[i].getChucVu(), canBos[i].getHeSoLuong(), canBos[i].getXepLoai(), canBos[i].getLuong()));
                stt++;
            }
        }
    }
    public static void congNhanLuongMin(){
        double minLuong = Double.MAX_VALUE;
        for (int i = 0; i < congNhans.length; i++) {
            if (congNhans[i] != null && congNhans[i].getLuong() < minLuong){
                minLuong = congNhans[i].getLuong();
            }
        }
        System.out.println("=================Danh Sach Cong Nhan Co Luong Thap Nhat================");
        System.out.println(String.format("| %-3s | %-7s | %-17s | %-12s | %-10s | %-10s | %-12s | %-12s | %-13s | %-12s | %-12s | %-12s |",
                "STT", "Ma NS", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh", "Ten Xuong", "Quan doc", "So Cong Nhan", "Cong Viec", "So Ngay Cong", "Luong"));
        int stt = 1;
        for (int i = 0; i < congNhans.length; i++) {
            if (congNhans[i] != null && congNhans[i].getLuong() == minLuong) {
                XuongSX xuongSX = congNhans[i].getXuongSX();
                System.out.println(String.format("| %-3d | %-7s | %-17s | %-12s | %-10d | %-10s | %-12s | %-12s | %-13d | %-12s | %-12d | %-12.2f |",
                        i + 1, congNhans[i].getMaNs(), congNhans[i].getHoDem(), congNhans[i].getTen(), congNhans[i].getNamSinh(), congNhans[i].getGioiTinh(),
                        xuongSX.getTenXuong(), xuongSX.getQuanDoc(), xuongSX.getSoCongNhan(), congNhans[i].getCongViec(), congNhans[i].getSoNgayCong(), congNhans[i].getLuong()));
                stt++;
            }
        }
    }

    public static void tongLuongCanBo(){
        double tongLuong = 0;
        for (int i = 0; i < canBos.length; i++) {
            if (canBos[i] != null){
                tongLuong += canBos[i].getLuong();
            }
        }
        System.out.println("Tong luong cua tat ca can bo la :" + tongLuong);
    }

    public static void tongLuongCongNhan(){
        double tongLuong = 0;
        for (int i = 0; i < congNhans.length; i++) {
            if (congNhans[i] != null){
                tongLuong += congNhans[i].getLuong();
            }
        }
        System.out.println("Tong luong cua tat ca cong nhan la :" + tongLuong);
    }

    public static void xapXepTenTangDanCanBo() {
        if (canBos == null || canBos.length == 0) {
            System.out.println("Danh sách cán bộ trống.");
            return;
        }

        for (int i = 0; i < canBos.length - 1; i++) {
            for (int j = i + 1; j < canBos.length; j++) {
                if (canBos[i] != null && canBos[j] != null && canBos[i].getTen().compareTo(canBos[j].getTen()) > 0) {

                    CanBo temp = canBos[i];
                    canBos[i] = canBos[j];
                    canBos[j] = temp;
                }
            }
        }
        System.out.println("=================Danh Sach Can Bo Sau Khi Sap Xep================");
        hienThiDanhSachCanBo();
    }


    public static void xapXepTenTangDanCongNhan() {
    }
}
