import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class studiKasus3 {
    // Menghitung Bonus 
    public static int hitungBonus(double kinerja, double lama, double gaji, String sertifikasi) {
        if (kinerja < 70) { // Mengecek syarat pertama untuk mendapatkan bonus
            return 0; // Tidak dapat bonus
        }

        double p; // Persentase bonus

        // Persentase berdasarkan kinerja dan lama kerja
        if (kinerja >= 90) {
            if (lama < 2) p = 0.02;
            else if (lama < 5) p = 0.04;
            else p = 0.07;
        } else {
            if (lama < 2) p = 0.01;
            else if (lama < 5) p = 0.03;
            else p = 0.05;
        }

        // Hitung bonus berdasarkan gaji pokok
        double bonus = p * gaji;

        // Tambahan bonus jika memiliki sertifikasi
        if ("ya".equalsIgnoreCase(sertifikasi.trim())) {
            bonus += 500000;
        }

        // Mengembalikan nilai bonus yang dibulatkan ke int
        return (int) Math.round(bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Menghitung Bonus Karyawan ===");

        System.out.print("Nilai Kinerja (1-100): ");
        double kinerja = sc.nextDouble();

        System.out.print("Lama Bekerja (tahun): ");
        double lama = sc.nextDouble();

        System.out.print("Gaji Pokok (Rp): ");
        double gaji = sc.nextDouble();

        sc.nextLine();
        System.out.print("Memiliki Sertifikasi (ya/tidak): ");
        String sertifikasi = sc.nextLine();

        // Hitung bonus berdasarkan input
        int total = hitungBonus(kinerja, lama, gaji, sertifikasi);

        // Output agar menampilkan angka ribuan
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("Total Bonus: Rp " + nf.format(total));

        sc.close();
    }
}