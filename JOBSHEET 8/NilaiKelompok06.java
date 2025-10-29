import java.util.Scanner;

public class NilaiKelompok06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, totalNilai;
        double rataNilai;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);            
    
            totalNilai = 0;
            for(int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            System.out.println("Kelompok " + i + ": " + " nilai rata rata = " + rataNilai);
            i++;
            
        }
    }
}