package bilangangenap;

import java.util.Scanner;

public class For{

    public static void main(String[] args) {
        System.out.println("Perulangan For");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int nilai_awal,nilai_akhir;

            System.out.println("Nilai Awal :");
            nilai_awal = sc.nextInt();

            System.out.println("Nilai Akhir :");
            nilai_akhir = sc.nextInt();

            for (int a = nilai_awal; a <= nilai_akhir; a++){
                System.out.println(a + "");
            }
      }
}