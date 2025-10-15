import java.util.Scanner;
public class studiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Kalkulator BMI (Body Mass Index) ===");

        // Input berat badan dan tinggi badan 
        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggi = sc.nextDouble();

        // Hitung BMI 
        double bmi = berat / (tinggi * tinggi);

        // Informasi tentang kategori dan risiko kesehatan 
        String kategori;
        String risiko;

        if (bmi < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Risiko kesehatan relatif rendah.";
        } else if (bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko diabetes, tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan kanker.";
        }

        // Output yang ditampilkan
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);
        System.out.println("Kategori BMI: " + kategori);
        System.out.println("Risiko Kesehatan: " + risiko);

        sc.close();
    }
}