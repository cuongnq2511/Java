package NhanSu;

public class Phong {
    private String tenPhong;
    private String truongPhong;

    public Phong() {
    }

    public Phong(String tenPhong, String truongPhong) {
        this.tenPhong = tenPhong;
        this.truongPhong = truongPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
    }
}
