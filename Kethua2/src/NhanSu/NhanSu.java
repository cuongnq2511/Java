package NhanSu;

public class NhanSu {
    protected int maNs;
    protected String hoDem;
    protected String ten;
    protected int namSinh;
    protected String gioiTinh;

    public NhanSu() {
    }

    public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
        this.maNs = maNs;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }
    public void input(){

    }

    public void output(){
        System.out.println("Ma NS: " + maNs);
        System.out.println("Ho Dem:" + hoDem);
        System.out.println("Ten: " + ten);
        System.out.println("Nam Sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
    }

    public int getMaNs() {
        return maNs;
    }

    public void setMaNs(int maNs) {
        this.maNs = maNs;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
