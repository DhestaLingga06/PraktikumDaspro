import java.util.Scanner;
public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int baris, kolom, pilihan;
        String nama,next;

        String[][] penonton = new String[4][2];
        boolean jalan = true;

        while (jalan) {
        System.out.println("===== MENU BIOSKOP =====");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1-3): ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                boolean tambah = true;
                while (tambah) {
                    System.out.print("\nMasukkan nama:");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Coba lagi!");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah diisi oleh " + penonton[baris - 1][kolom - 1]);
                            System.out.println("Masukkan baris dan kolom lain.");
                            continue;
                        }

                        penonton[baris-1][kolom-1] = nama; 
                        System.out.println("Data penonton berhasil disimpan!");
                        break;

                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        tambah = false;
                    }
                }
                break;

            case 2:
                System.out.println("\n==== DAFTAR PENONTON ====");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
                break;
            
            case 3: 
                System.out.println("\nProgram selesai");
                jalan = false;
                break;

            default:
                System.out.println("Pilihan tidak tersedia. Coba lagi!");
            }
        }
        sc.close();
    }
}