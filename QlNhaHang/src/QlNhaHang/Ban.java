package QlNhaHang;

public class Ban {
    private String maBan;
    private int soLuongGhe;
    private String trangThai;


    public Ban(String maBan, int soLuongGhe, String trangThai) {
        this.maBan = maBan;
        this.soLuongGhe = soLuongGhe;
        this.trangThai = trangThai;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
