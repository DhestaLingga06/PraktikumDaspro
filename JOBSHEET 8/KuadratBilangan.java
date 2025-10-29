import java.util.Scanner;

public class KuadratBilangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int jumlah = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for ( int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;

                if (j == i) {
                    System.out.print(kuadrat);
                } else {
                    System.out.print(kuadrat + " + ");
                }
            }

            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}