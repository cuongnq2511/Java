package Dogiadung;

public class main {
    public static void main(String[] args) {
        MAYGIAT maygiat = new MAYGIAT(20 , 20 ,20 , "Dung");
        TULANH tulanh = new TULANH(30 , 30 , 30 , 4);

        System.out.println("=============Thong tin vua nhap===============");
        maygiat.xuat();
        tulanh.xuat();
    }
}
