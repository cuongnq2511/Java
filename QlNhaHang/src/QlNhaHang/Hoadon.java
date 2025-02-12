package QlNhaHang;

public class Hoadon {
    private String maHoaDon;
    private KhachHang khachHang;
    private Order order;
    private double tongTien;

    public Hoadon(String maHoaDon, KhachHang khachHang, Order order) {
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.order = order;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getTongTien() {
        double tongTien = 0;
        for (ThucDon thucDon : order.getDanhSachMon()) {
            tongTien += thucDon.getGia();  // Cộng dồn giá các món trong đơn
        }
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
