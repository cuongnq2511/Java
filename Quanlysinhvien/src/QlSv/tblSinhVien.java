package QlSv;

public class tblSinhVien {
    private String maSinhVien;
    private String hoDem;
    private String ten;
    private int namSinh;
    private boolean gioiTinh;

    public tblSinhVien() {
    }

    public tblSinhVien(String maSinhVien, String hoDem, String ten, int namSinh, boolean gioiTinh) {
        this.maSinhVien = maSinhVien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
