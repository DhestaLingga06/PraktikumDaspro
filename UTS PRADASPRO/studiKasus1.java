import java.util.Scanner;
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a, b, c;
    
        System.out.println("=== Menentukan Bilangan Terbesar dari tiga angka === ");

        System.out.println("Masukkan angka pertama: ");
        a = sc.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        b = sc.nextDouble();
        System.out.println("Masukkan angka ketiga: ");
        c = sc.nextDouble();

        //Menentukan angka terbesar
        double terbesar = a;

        if (b > terbesar) {
            terbesar = b;
        }
        if (c > terbesar) {
            terbesar = c;
        }

        //Mengecek apakah ada angka yang sama besar
        if (a == b && b == c) {
            System.out.println("\nKetiga angka sama besar yaitu " + terbesar);
        } else if ((a == terbesar && b == terbesar) ||
                    (a == terbesar && c == terbesar) ||
                    (b == terbesar && c == terbesar)) {
                System.out.println("\nAda dua angka terbesar dengan nilai yang sama yaitu " + terbesar);

        } else {
            System.out.println("\nAngka terbesar adalah " + terbesar);
        }
        sc.close();
    }
}