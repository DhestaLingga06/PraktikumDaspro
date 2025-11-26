import java.util.Scanner;
public class Kubus06 {

    static void hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus = " + volume);
    }

    static void hitungLuasPermukaan(int sisi) {
        int luas = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus = " + luas);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisiKubus = input.nextInt();

        hitungVolume(sisiKubus);
        hitungLuasPermukaan(sisiKubus);
    }
}