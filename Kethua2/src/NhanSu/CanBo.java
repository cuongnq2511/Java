package NhanSu;

public class CanBo extends NhanSu{
    private Phong phong;
    private String chucVu;
    private double heSoLuong;
    private String xepLoai;
    private double luong;

    public CanBo() {
    }

    public CanBo(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, Phong phong, String chucVu, double heSoLuong, String xepLoai, double luong) {
        super(maNs, hoDem, ten, namSinh, gioiTinh);
        this.phong = phong;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.xepLoai = xepLoai;
        this.luong = luong;
    }

    public void input(){

    }

    public void output(){
        System.out.println("===========Thong Tin Can Bo===========");
        super.output();
        System.out.println("Ten Phong" + phong.getTenPhong());
        System.out.println("Truong phong" +phong.getTruongPhong());
        System.out.println("Chuc vu "+ chucVu);
        System.out.println("He so luong "+heSoLuong);
        System.out.println("Xep loai " +xepLoai);
        System.out.println("Luong" +luong);
    }
    public double tinhLuong(){
        if (xepLoai.equals("A")) {
            this.luong = heSoLuong * 1150000 + 1000000;
        } else if (xepLoai.equals("B")) {
            this.luong = heSoLuong * 1150000;
        } else if (xepLoai.equals("C")) {
            this.luong = heSoLuong * 1150000 - 400000;
        } else {
            this.luong = heSoLuong * 1150000 - 1000000;
        }
        return 0;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
