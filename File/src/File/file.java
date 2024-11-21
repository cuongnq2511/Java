package File;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("input.txt");
            Scanner scanner = new Scanner(fileInputStream);
            int n = scanner.nextInt();
            double [] arr = new double[n];


            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }


            fileInputStream.close();
            Arrays.sort(arr);


        try (PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt"))){
            writer.println(n);
            for (double num : arr){
                writer.println(num);
            }
        }catch (FileNotFoundException e){
            System.out.println("Khong the ghi vao output.txt");
        }



        try (Scanner outputScanner = new Scanner(new FileInputStream("output.txt"))) {
                while (outputScanner.hasNext()) {
                    System.out.println(outputScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Không thể đọc file output.txt");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file input.txt");
        } catch (IOException e) {
            System.out.println("Đọc file gặp lỗi!");
        }
    }
}
