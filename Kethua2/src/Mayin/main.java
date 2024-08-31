package Mayin;

public class main {
    public static void main(String[] args) {

        DOTPRINTER dotPrinter = new DOTPRINTER();
        LASERPRINTER laserPrinter = new LASERPRINTER();

        System.out.println("Nhap thong tin may in kim :");
        dotPrinter.nhap();
        System.out.println("Nhap thong tin may in laser");
        laserPrinter.nhap();

        System.out.println("=============Xuat thong tin===============");
        dotPrinter.xuat();
        laserPrinter.xuat();
    }
}
