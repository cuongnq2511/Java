import java.util.Scanner;

public class Dscuta {


    private static String[] nameVDV;
    private static int[] ketqua1;
    private static int[] ketqua2;
    private static int[] ketqua3;
    private static int[] sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap so luong VDV: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        nameVDV = new String[n];
        ketqua1 = new int[n];
        ketqua2 = new int[n];
        ketqua3 = new int[n];
        sum = new int[n];

        for (int i = 0; i < nameVDV.length; i++) {
            System.out.println("Moi ban nhap ten VDV thu " + (i + 1) + " " );
            nameVDV[i] = scanner.nextLine();
        }

        for (int i = 0; i < nameVDV.length ; i++) {
            System.out.println("Moi ban nhap thanh tich lan thu 1 cua VDV " + nameVDV [i]);
            ketqua1[i] = scanner.nextInt();
            System.out.println("Moi ban nhap thanh tich lan thu 2 cua VDV " + nameVDV [i]);
            ketqua2[i] = scanner.nextInt();
            System.out.println("Moi ban nhap thanh tich lan thu 3 cua VDV " + nameVDV [i]);
            ketqua3[i] = scanner.nextInt();

            sum[i] = ketqua1[i] + ketqua2[i] + ketqua3[i];

        }


        int menu;
        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Hiển thị danh sách VDV cùng thanh tích trong 3 lân cử tạ : ");
            System.out.println("2. Hiển thị thông tin VDV có tổng thành tích cao nhất: ");
            System.out.println("3. Hiển thị 3 VDV có tổng thành tích cao nhất: ");
            System.out.println("4. Sắp xếp danh sách VDV theo tên và thành tích: ");
            System.out.println("5. Hiển thị danh sách các VDV có tên bắt ầu bằng chữ T: ");
            System.out.println("6. Hiển thị danh sách các VDV tên có vần an: ");
            System.out.println("7. Sắp xếp các VDV theo chiều dài của tên tăng dần: ");
            System.out.println("8. Hiển thị các VDV có cùng tổng thành tích: ");
            System.out.println("9. Hiển thị các VDV có lần thứ 3 thấp nhất: ");
            System.out.println("10. Hiển thị các VDV có lần thứ nhất cao nhất: ");
            System.out.println("0. Thoát.");
            System.out.print("Chọn: ");
            try {
                menu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập Khong phải số: ");
                return;
            }
            switch (menu) {
                case 1:
                    dsVDV();
                    break;
                case 2:
                    vdvTongThanhTichMax();
                    break;
                case 3:
                    baThanhTichMax(3);
                    break;
                case 4:
                    sxTheoTen();
                    break;
                case 5:
                    tenT();
                    break;
                case 6:
                    tenVanan("an");
                    break;
                case 7:
                    chieuDaitenTangdan();
                    break;
                case 8:
                    cungtongtt();
                    break;
                case 9:
                    th3min(2);
                    break;
                case 10:
                    th1max(2);
                    break;
                case 0:
                    System.out.println("Ban chon thoat... ");
                    return;
                default:
                    System.out.println("Lua chon khong hop le: ");
                    break;

            }

        } while (menu != 0);

    }

    private static void dsVDV() {
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < nameVDV.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i+1 ,nameVDV[i] ,ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
        }

    }


    private static void vdvTongThanhTichMax(){
        int max =  0;
        for (int i = max+1; i < sum.length; i++) {
            if (sum[i] > sum[max]){
                max = i;
            }
        }
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("VDV có thành tích cao nhất là VDV: " + nameVDV[max]);
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", max+1 ,nameVDV[max] ,ketqua1[max], ketqua2[max], ketqua3[max], sum[max]));
    }


    private static void baThanhTichMax(int top) {
        String [] namevdvTmp = nameVDV.clone();
        int [] sumTmp = sum.clone();

        for (int i = 0; i <sumTmp.length - 1 ; i++) {
            for (int j = i+1; j <sumTmp.length ; j++) {

                if (sumTmp[i] < sumTmp[j]){

                    int Tmp = sumTmp[i];
                    sumTmp[i] = sumTmp[j];
                    sumTmp[j] = Tmp;

                    String Tmp2 = namevdvTmp[i];
                    namevdvTmp[i] = namevdvTmp[j];
                    namevdvTmp[j] = Tmp2;
                }
            }
        }

        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("3 VDV có tổng thành tích cao nhất là: ");
        System.out.println(String.format("%-5s  | %15s | %15s |", "STT", "Name", "Tổng Thành Tích"));
        for (int i = 0; i < top; i++) {
            System.out.println(String.format("%-5s  | %15s | %15s |", i+1 ,namevdvTmp[i], sumTmp[i]));
        }
    }



    private static void sxTheoTen() {

        for (int i=0; i < sum.length - 1; i++) {
            for (int j = i+1; j<sum.length; j++) {
                if (nameVDV[i].compareTo(nameVDV[j]) > 0 ) {

                    int tmp = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp;

                    tmp = ketqua1[i];
                    ketqua1[i] = ketqua1[j];
                    ketqua1[j] = tmp;

                    tmp = ketqua2[i];
                    ketqua2[i] = ketqua2[j];
                    ketqua2[j] = tmp;

                    tmp = ketqua3[i];
                    ketqua3[i] = ketqua3[j];
                    ketqua3[j] = tmp;

                    String tmp2 = nameVDV[i];
                    nameVDV[i] = nameVDV[j];
                    nameVDV[j] = tmp2;
                }
            }
        }
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("Danh sách sau khi sắp xếp la: ");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < sum.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i+1 ,nameVDV[i] ,ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
        }
    }



    private static void tenT(){
        System.out.println("Cac' VDV tên bắt đầu bằng chữ T là: ");
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < sum.length; i++) {
            if (nameVDV[i].toLowerCase().startsWith("t")) {
                System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i+1 ,nameVDV[i] ,ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
            }
        }
    }



    private static void tenVanan(String name){
        System.out.println("Các VDV tên có van an là: ");
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < sum.length; i++) {
            if (nameVDV[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i+1 ,nameVDV[i] ,ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
            }
        }
    }



    private static void chieuDaitenTangdan(){
        for (int i = 0; i < nameVDV.length - 1; i++) {
            for (int j = i + 1; j < nameVDV.length; j++) {
                if (nameVDV[i].length() > nameVDV[j].length()) {

                    String tmp = nameVDV[i];
                    nameVDV[i] = nameVDV[j];
                    nameVDV[j] = tmp;

                    int tmp2 = ketqua1[i];
                    ketqua1[i] = ketqua1[j];
                    ketqua1[j] = tmp2;

                    tmp2 = ketqua2[i];
                    ketqua2[i] = ketqua2[j];
                    ketqua2[j] = tmp2;

                    tmp2 = ketqua3[i];
                    ketqua3[i] = ketqua3[j];
                    ketqua3[j] = tmp2;

                    tmp2 = sum[i];
                    sum[i] = sum[j];
                    sum[j] = tmp2;
                }
            }
        }
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("Danh sách sau khi sắp xếp theo chiều dài tên tăng dần là: ");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < sum.length; i++) {
            System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i+1 ,nameVDV[i] ,ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
        }
    }




    private static void cungtongtt() {
        int sumtt = sum[0];
        System.out.println("Các VDV tên có tổng thành tích bằng nhau là: ");
        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", "STT", "Name", "Kq1", "Kq2", "Kq3", "Tổng Thành Tích"));
        for (int i = 0; i < nameVDV.length; i++) {
            if (sum[i] == sumtt) {
                System.out.println(String.format("%-5s | %-30s | %10s | %15s | %15s | %15s |", i + 1, nameVDV[i], ketqua1[i], ketqua2[i], ketqua3[i], sum[i]));
            }
        }
    }



    private static void th3min(int min3){
        String [] namevdvTmp = nameVDV.clone();
        int [] minTmp = ketqua3.clone();

        for (int i = 0; i <ketqua3.length - 1 ; i++) {
            for (int j = i+1; j <ketqua3.length ; j++) {

                if (minTmp[i] > minTmp[j]){

                    int tmp = minTmp[i];
                    minTmp[i] = minTmp[j];
                    minTmp[j] = tmp;

                    String tmp2 = namevdvTmp[i];
                    namevdvTmp[i] = namevdvTmp[j];
                    namevdvTmp[j] = tmp2;
                }
            }
        }



        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("Các VDV có lần thứ 3 thấp nhất: ");
        System.out.println(String.format("%-5s  | %15s | %15s |", "STT", "Name", "Thành tích lần3"));
        for (int i = 0; i < min3; i++) {
            System.out.println(String.format("%-5s  | %15s | %15s |", i+1 ,namevdvTmp[i], minTmp[i]));
        }

    }



    private static void th1max(int max1){
        String [] namevdvTmp = nameVDV.clone();
        int [] maxTmp = ketqua1.clone();

        for (int i = 0; i <ketqua1.length - 1 ; i++) {
            for (int j = i+1; j <ketqua1.length ; j++) {

                if (maxTmp[i] < maxTmp[j]){

                    int tmp = maxTmp[i];
                    maxTmp[i] = maxTmp[j];
                    maxTmp[j] = tmp;

                    String tmp2 = namevdvTmp[i];
                    namevdvTmp[i] = namevdvTmp[j];
                    namevdvTmp[j] = tmp2;
                }
            }
        }

        System.out.println("----------------------------------------------------Danh sách-------------------------------------------------");
        System.out.println("Các VDV có lần thứ nhất cao nhất: ");
        System.out.println(String.format("%-5s  | %15s | %15s |", "STT", "Name", "Thannh tích lần1"));
        for (int i = 0; i < max1; i++) {
            System.out.println(String.format("%-5s  | %15s | %15s |", i+1 ,namevdvTmp[i], maxTmp[i]));
        }
    }


}