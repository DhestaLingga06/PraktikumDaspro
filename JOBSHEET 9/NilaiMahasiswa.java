import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, total = 0;
        double rata;
        int tertinggi, terendah;

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total = total + nilai[i];
        }

        rata = (double) total / n;
        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 0; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println();
        System.out.println("=== HASIL NILAI MAHASISWA ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Nilai rata-rata : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

    }
}