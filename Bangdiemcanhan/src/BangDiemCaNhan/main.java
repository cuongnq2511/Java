package BangDiemCaNhan;

public class main {

    public static void main(String[] args) {
        BangDiem bangDiem = new BangDiem();
        bangDiem.nhap();
        bangDiem.show();

        bangDiem.showDiemDuoi(5);
        bangDiem.edit();
        bangDiem.suaHocPhan();

    }
}