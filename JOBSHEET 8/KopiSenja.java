import java.util.Scanner;

public class KopiSenja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");
        int totalPelanggan = 0;
        int totalItem = 0;

        for(int i = 1; i <= jumlahCabang; i++) {
        System.out.print("\n---Cabang " + i + " ---");
        System.out.print("\nJumlah pelanggan: ");
        int jumlahPelanggan = sc.nextInt();

        int totalItemCabang = 0;

        for (int j = 1; j <= jumlahPelanggan; j++) {
            System.out.print(" - Pelanggan " + j + " memesan berapa item? ");
            int item = sc.nextInt();
            totalItemCabang += item;

        }

        System.out.println(" Cabang " + i + ":");
        System.out.println(" - Pelanggan: " + jumlahPelanggan + " orang");
        System.out.println(" - Item terjual: " + totalItemCabang);
        System.out.println();

        totalPelanggan += jumlahPelanggan;
        totalItem += totalItemCabang;
        }

        System.out.println("Total seluruh Cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");
    }
}