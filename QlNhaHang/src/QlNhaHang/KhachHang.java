package QlNhaHang;

public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private int tuoiKhachHang;
    private String gioiTinh;
    private String soDienThoai;


    public KhachHang(String maKhachHang, String tenKhachHang, int tuoiKhachHang, String gioiTinh, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.tuoiKhachHang = tuoiKhachHang;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getTuoiKhachHang() {
        return tuoiKhachHang;
    }

    public void setTuoiKhachHang(int tuoiKhachHang) {
        this.tuoiKhachHang = tuoiKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
