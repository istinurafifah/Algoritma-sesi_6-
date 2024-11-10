package Algoritma;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji,Lembur;
        System.out.println();
        System.out.println("PERHITUNGAN GAJI JIKA LEMBUR");
        
        System.out.println();
        System.out.println("=".repeat(20));
        System.out.print("Gaji: ");
        gaji = input.nextInt();
        System.out.print("Jam Lembur: ");
        Lembur = input.nextInt();
        System.out.println("=".repeat(20));
        System.out.println();

        if (Lembur > 4) {
            int upahPerJam = (int) Math.ceil(gaji/173);
            int extra = Lembur-4;
            int upah = ((4*upahPerJam)+(extra*2*upahPerJam));
            int upahAkhir = gaji + upah;

            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
            String totalGaji = numberFormat.format(upahAkhir);

            System.out.println("+".repeat(30));
            System.out.println();
            System.out.println("Gaji yang diterima: "+totalGaji);
            System.out.println();
            System.out.println("+".repeat(30));

            

        }else{

            int upahPerJam = gaji/173;
            int upah = Lembur * upahPerJam;
            int upahAkhir = gaji + upah;

            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
            String totalGaji = numberFormat.format(upahAkhir);

            System.out.println("+".repeat(20));
            System.out.println("Gaji yang diterima: "+totalGaji);
            System.out.println("+".repeat(20));
        }
        input.close();

    }
}