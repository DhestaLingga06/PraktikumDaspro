import java.util.Scanner;
public class RekapPenjualanCafe06 {

    static Scanner input = new Scanner(System.in);

    static String[] menu;
    static int[][] penjualan;
    static int jumlahMenu, jumlahHari;

    static void inputJumlah() {
        System.out.print("Masukkan jumlah menu : ");
        jumlahMenu = input.nextInt();

        System.out.print("Masukkan jumlah hari : ");
        jumlahHari = input.nextInt();
        input.nextLine(); 
    }

    static void inputData() {
        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i+1) + " : ");
            menu[i] = input.nextLine();
        }

        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu : " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanTabel() {
        System.out.println("\n=== Tabel Rekap Penjualan ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i]);

            if (menu[i].length() < 8) {
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void tampilkanMenuTertinggi() {
        int maxTotal = 0;
        String menuTertinggi = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\n=== Menu Dengan Penjualan Tertinggi ===");
        System.out.println("Menu : " + menuTertinggi);
        System.out.println("Total Penjualan : " + maxTotal);
    }

    static void tampilkanRataRata() {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }

            double rata = total * 1.0 / jumlahHari;
            System.out.println(menu[i] + " : " + rata);
        }
    }
    public static void main(String[] args) {

        inputJumlah();        
        inputData();          
        tampilkanTabel();     
        tampilkanMenuTertinggi(); 
        tampilkanRataRata();  
    }
}