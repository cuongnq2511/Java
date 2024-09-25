package QlSv;

public class tblDiem {
    private String maSinhVien;
    private String maMonHoc;
    private float diemSo;

    public tblDiem() {
    }

    public tblDiem(String maSinhVien, String maMonHoc, float diemSo) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }
}
