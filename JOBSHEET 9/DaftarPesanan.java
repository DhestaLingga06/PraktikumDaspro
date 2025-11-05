import java.util.Scanner;

public class DaftarPesanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya = totalBiaya + hargaPesanan[i];
        }

        System.out.println();
        System.out.println("=== DAFTAR PESANAN ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\n------------------");
        System.out.println("Total biaya: Rp " + totalBiaya);
        System.out.println("==================");
    }
}