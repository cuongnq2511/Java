package Dogiadung;

public class MAYGIAT extends  ELECTRONIC{
    private int dungTich;
    private String loai;


    public MAYGIAT(int congSuat, int dienAp, int dungTich, String loai) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.loai = loai;
    }
    public void xuat(){
        System.out.println("==========Thong tin cua may giat==============");
        System.out.println("Cong suat la :" + congSuat);
        System.out.println("Dien ap la :" + dienAp);
        System.out.println("Dung tich la :" + dungTich);
        System.out.println("Loai la :" + loai);
    }
}
