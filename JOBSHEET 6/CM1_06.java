import java.util.Scanner;

public class CM1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Input Data Mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();

        // Input nilai Mata Kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        double utsAlgoritma = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uasAlgoritma = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugasAlgoritma = sc.nextDouble();

        // Input nilai Mata Kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double utsStruktur = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uasStruktur = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugasStruktur = sc.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhirAlgoritma = (utsAlgoritma * 0.30) + (uasAlgoritma * 0.40) + (tugasAlgoritma * 0.30);
        double nilaiAkhirStruktur = (utsStruktur * 0.30) + (uasStruktur * 0.40) + (tugasStruktur * 0.30);

        // Nilai huruf
        String hurufAlgoritma = konversiHuruf(nilaiAkhirAlgoritma);
        String hurufStruktur = konversiHuruf(nilaiAkhirStruktur);

        // Cek status kelulusan
        String statusAlgoritma = (nilaiAkhirAlgoritma >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusStruktur = (nilaiAkhirStruktur >= 60) ? "LULUS" : "TIDAK LULUS";

        // Rata-rata dan status semester
        double rataRata = (nilaiAkhirAlgoritma + nilaiAkhirStruktur) / 2;
        String statusSemester;
        if (statusAlgoritma.equals("LULUS") && statusStruktur.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu mata kuliah tidak lulus)";
        }

        // Output
        System.out.println("\n=== HASIL PENILAIAN AKADEMIK ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);

        System.out.println("\nAlgoritma dan Pemrograman:");
        System.out.println("Nilai Akhir: " + nilaiAkhirAlgoritma);
        System.out.println("Nilai Huruf: " + hurufAlgoritma);
        System.out.println("Status     : " + statusAlgoritma);

        System.out.println("\nStruktur Data:");
        System.out.println("Nilai Akhir: " + nilaiAkhirStruktur);
        System.out.println("Nilai Huruf: " + hurufStruktur);
        System.out.println("Status     : " + statusStruktur);

        System.out.println("\nRata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester      : " + statusSemester);

        sc.close(); // tutup scanner di akhir main
    } // <- pastikan main ditutup di sini

    // Metode konversi nilai angka ke huruf (dideklarasikan di luar main)
    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }
} 