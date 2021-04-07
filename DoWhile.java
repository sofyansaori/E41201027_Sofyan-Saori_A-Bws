package nilaikelipatan;

public class DoWhile{
    public static void main(String[] args) {
        int i = 0;
        String jd = "                                                             Do_While                                                      ";
        String kt = "                                                   Bilangan Kelipatan 2 (0-100)                                            ";
        String j  = "================================================================================================================================================================================";

        System.out.println("" +jd);
        System.out.println("" +kt);
        System.out.println("" +j);

        do{
            System.out.print(" " + i);
            i++;
        }   while(i <= 100);
    }
}

