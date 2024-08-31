package Kethua;


public class SanPham {

    protected String maSp;
    protected String tenSp;
    protected String ngaSX;
    protected float trongLuong;
    protected String mauSac;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String ngaSX, float trongLuong, String mauSac) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.ngaSX = ngaSX;
        this.trongLuong = trongLuong;
        this.mauSac = mauSac;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getNgaSX() {
        return ngaSX;
    }

    public void setNgaSX(String ngaSX) {
        this.ngaSX = ngaSX;
    }

    public float getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}
