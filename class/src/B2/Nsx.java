package B2;

import java.util.Scanner;

public class Nsx {
    private String maNsx;
    private String tenNsx;
    private String diChiNsx;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ma NSX: ");
        maNsx = scanner.nextLine();
        System.out.println("Moi ban nhap ten NSX:");
        tenNsx = scanner.nextLine();
        System.out.println("Moi ban nhap dia chi NSX: ");
        diChiNsx = scanner.nextLine();

    }

    public void xuat(){
        System.out.println("Msx la: " + maNsx);
        System.out.println("Ten NSX la: " + tenNsx);
        System.out.println("Dia chi : " + diChiNsx);
    }
}
