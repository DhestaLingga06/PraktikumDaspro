import java.util.Scanner;

public class Tugas {
    static int jumlahRekursif(int[] data, int n ) {
        if (n == 0) {
            return 0;
        } else {
            return data[n - 1] + jumlahRekursif(data, n - 1);
        }
    }

    static int jumlahIteratif(int[] data, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke -" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int total = jumlahRekursif(angka, n);

        System.out.println("Total dari " + n + "angka yang dimasukkan adalah: " + total);
    }
}