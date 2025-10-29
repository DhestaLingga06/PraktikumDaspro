import java.util.Scanner;

public class NilaiKelompok06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, totalNilai, kelompokTertinggi = 0;
        double rataNilai, rataTertinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);            
    
            totalNilai = 0;
            for(int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = (double) totalNilai / 5;

            System.out.println("Kelompok " + i + ": " + " nilai rata rata = " + rataNilai);
            
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
            
        }
        System.out.println("Kelompok dengan rata-rata tertinggi: ");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan nilai rata-rata = " + rataTertinggi);

        sc.close();
    }
}