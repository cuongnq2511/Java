package QlNhaHang;

public class ThucDon {
    private String maMon;
    private String  tenMon;
    private String loaiMon;
    private double gia;

    public ThucDon(String maMon, String tenMon, String loaiMon, double gia) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.loaiMon = loaiMon;
        this.gia = gia;
    }



    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
