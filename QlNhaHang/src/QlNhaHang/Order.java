package QlNhaHang;

import java.util.ArrayList;

public class Order {
    private String maOrder;
    private KhachHang khachHang;
    private ArrayList<ThucDon> danhSachMon;
    private String maBan;

    public Order(String maOrder, KhachHang khachHang) {
        this.maOrder = maOrder;
        this.khachHang = khachHang;
        this.danhSachMon = new ArrayList<>();
    }
    public void themMon(ThucDon thucDon){
        danhSachMon.add(thucDon);
    }

    public String getMaOrder() {
        return maOrder;
    }

    public void setMaOrder(String maOrder) {
        this.maOrder = maOrder;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<ThucDon> getDanhSachMon() {
        return danhSachMon;
    }

    public void setDanhSachMon(ArrayList<ThucDon> danhSachMon) {
        this.danhSachMon = danhSachMon;
    }
}
