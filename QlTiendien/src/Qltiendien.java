import java.util.Scanner;

public class Qltiendien {

    private static String[] tenCh;
    private static int[] soDien;

    public static void main(String[] args) {

        int choose;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap so luong ho gia dinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        tenCh = new String[n];
        soDien = new int[n];

        for (int i = 0; i < tenCh.length; i++) {
            System.out.println("Moi ban nhap ten chu ho thu " + (i + 1) + " " );
            tenCh[i] = scanner.nextLine();
        }

        for (int i = 0; i < tenCh.length; i++) {
            System.out.println("Moi ban nhap so kwh cua chu ho " + tenCh[i] +" ");
            soDien[i] = scanner.nextInt();
        }



        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Hiển thị danh sách tiền điện.");
            System.out.println("2. Hiển thị 3 hộ gia đình có số kwh điện tiêu thụ nhiều nhất.");
            System.out.println("3. Hiển thị các hộ gia đình có chủ hộ tên \"Truong\".");
            System.out.println("4. Sắp danh sách các hộ gia đình theo tên với thứ tự bảng chữ cái.");
            System.out.println("5. Sắp xếp danh sách các hộ gia đình theo số kwh điện tăng dần.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn: ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }

            switch (choose) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showTop3(3);
                    break;
                case 3:
                    showFillName("Truong");
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByKw();
                    break;
                case 0:
                    System.out.println("Thoát.....");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }

        } while (choose != 0);
    }

    private static void showAll() {

        System.out.println("Danh sách tiền điện của các hộ gia đình:");
        for (int i = 0; i < tenCh.length; i++) {
            int tienDien = soDien[i] * 1000;
            System.out.println("Chu ho: " + tenCh[i] + " So kWh: " + soDien[i] + " Tien dien: " + tienDien + " VND");
        }
    }

    private static void showTop3(int top) {
        String[] chuHosTmp = tenCh.clone();
        int[] soDiensTmp = soDien.clone();

        for (int i=0; i < soDiensTmp.length - 1; i++) {
            for (int j = i+1; j<soDiensTmp.length; j++) {
                if (soDiensTmp[i] < soDiensTmp[j]) {

                    int tmp = soDiensTmp[i];
                    soDiensTmp[i] = soDiensTmp[j];
                    soDiensTmp[j] = tmp;

                    String tmp2 = chuHosTmp[i];
                    chuHosTmp[i] = chuHosTmp[j];
                    chuHosTmp[j] = tmp2;
                }
            }
        }
        System.out.println("3 Chu ho co so dien cao nhat: ");
        for (int i = 0; i < top; i++) {
            System.out.println("Chủ hộ: " + chuHosTmp[i] + ", SoKw: " + soDiensTmp[i]);
        }
    }

    private static void showFillName(String name) {
        System.out.println("Cac chu ho co ten truong la: ");
        for (int i = 0; i < soDien.length ; i++) {
            if (tenCh[i].toLowerCase().contains(name.toLowerCase())) {
                int tienDien = soDien[i] * 1000;
                System.out.println("Chu ho: " + tenCh[i] + " So kWh: " + soDien[i] + " Tien dien: " + tienDien + " VND");
            }
        }
    }

    private static void sortByName() {
        System.out.println("Bang chu cai ");
        for (int i=0; i < soDien.length - 1; i++) {
            for (int j = i+1; j<soDien.length; j++) {
                if (tenCh[i].compareTo(tenCh[j]) > 0 ) {

                    int tmp = soDien[i];
                    soDien[i] = soDien[j];
                    soDien[j] = tmp;

                    String tmp2 = tenCh[i];
                    tenCh[i] = tenCh[j];
                    tenCh[j] = tmp2;
                }
            }
        }
        System.out.println("Sau khi sap xep theo bang chu cai la: ");
        for (int i = 0; i < soDien.length; i++) {
            System.out.println("Chủ hộ: " + tenCh[i] + ", SoKw: " + soDien[i]);
        }



    }

    private static void sortByKw() {
        System.out.println("Tang dan ");
        System.out.println("sortByName");
        for (int i=0; i < soDien.length - 1; i++) {
            for (int j = i+1; j<soDien.length; j++) {
                if (soDien[i] > soDien[j]) {

                    int tmp = soDien[i];
                    soDien[i] = soDien[j];
                    soDien[j] = tmp;

                    String tmp2 = tenCh[i];
                    tenCh[i] = tenCh[j];
                    tenCh[j] = tmp2;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        for (int i = 0; i < soDien.length; i++) {
            System.out.println("Chủ hộ: " + tenCh[i] + ", SoKw: " + soDien[i]);

        }
        System.out.print("\nNhấn Enter để tiếp tục...");


    }
}
