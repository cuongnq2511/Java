package NhanSu;

public class CongNhan extends NhanSu{
    private XuongSX xuongSX;
    private String congViec;
    private int soNgayCong;
    private double luong;

    public CongNhan() {
    }

    public CongNhan(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, XuongSX xuongSX, String congViec, int soNgayCong, double luong) {
        super(maNs, hoDem, ten, namSinh, gioiTinh);
        this.xuongSX = xuongSX;
        this.congViec = congViec;
        this.soNgayCong = soNgayCong;
        this.luong = luong;
    }

    public void output(){
        System.out.println("=========Thong Tin Cong Nhan==========");
        super.output();
        System.out.println("Ten xuong" + xuongSX.getTenXuong());
        System.out.println("Quan Doc" + xuongSX.getQuanDoc());
        System.out.println("So cong nhan" + xuongSX.getSoCongNhan());
        System.out.println("Cong viec" + congViec);
        System.out.println("So ngay cong " +soNgayCong);
        System.out.println("Luong" + luong);
    }

    public void tinhLuong(){
        if (soNgayCong >= 23) {
            this.luong = soNgayCong * 250000 + 500000;
        } else if (soNgayCong >= 20) {
            this.luong = soNgayCong * 250000 + 300000;
        } else if (soNgayCong >= 18) {
            this.luong = soNgayCong * 250000;
        } else {
            this.luong = soNgayCong * 250000 - 200000;
        }
    }

    public XuongSX getXuongSX() {
        return xuongSX;
    }

    public void setXuongSX(XuongSX xuongSX) {
        this.xuongSX = xuongSX;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
