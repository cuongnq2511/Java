package Dogiadung;

public class TULANH extends ELECTRONIC{
    private int dungTich;
    private int soNgan;

    public TULANH(int congSuat, int dienAp, int dungTich, int soNgan) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.soNgan = soNgan;
    }
    public void xuat(){
        System.out.println("==========Thong tin cua tu lanh==============");
        System.out.println("Cong suat la :" + congSuat);
        System.out.println("Dien ap la :" + dienAp);
        System.out.println("Dung tich la :" + dungTich);
        System.out.println("So ngan la :" + soNgan);
    }
}
