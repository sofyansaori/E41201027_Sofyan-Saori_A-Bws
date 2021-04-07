package RataRata;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Mencari Rata - Rata");
        System.out.println();

        Scanner in = new Scanner(System.in);
        int i = 1;
        int nilai;
        double jumlah = 0;
        double rata = 0;
        int min = 1000;
        int max = 0;

        System.out.print("Masukkan banyaknya data nilai :");
        nilai = in.nextInt();

        while (i <= nilai) {
            int jml = i + 1;
            int[] tampung = new int[jml];

            System.out.print("Masukkan data nilai ke-" + i + " : ");
            tampung[i] = in.nextInt();
            jumlah = tampung[i] + jumlah;
            if ((tampung[i] <min) && (tampung[i] >= i )){
                min = tampung[i];
            }
            if (tampung[i] > max){
                max = tampung[i];
            }
            i++;
        }
        rata = jumlah / (i - 1);
        System.out.println("Nilai minimum :" + min);
        System.out.println("Nilai maximum :" + max);
        System.out.println("Rata - Rata : " + rata);
    }
    
}
