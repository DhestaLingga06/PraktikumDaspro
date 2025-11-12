import java.util.Scanner;
public class SurveyKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        System.out.println("===== Input Nilai Survei Kepuasan Pelanggan =====");
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n===== Rata-rata Setiap Responden =====");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + (total/pertanyaan));
        }

        System.out.println("\n===== Rata-rata Setiap Pertanyaan =====");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + (total/responden));
        }

        double totalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }
        double rataKeseluruhan = totalSemua / (responden*pertanyaan);
        System.out.println("\n===== Rata-rata Keseluruhan =====");
        System.out.println("Nilai rata-rata keseluruhan: " + rataKeseluruhan);
    }
}     