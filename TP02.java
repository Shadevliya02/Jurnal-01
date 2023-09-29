import java.util.Scanner;
import java.time.LocalDate;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Membaca nama user
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            // Membaca tahun lahir user
            System.out.print("Masukkan tahun lahir: ");
            int tahunLahir = input.nextInt();

            // Menemukan hasil tahun lahir
            int tahunSekarang = LocalDate.now().getYear();

            // Menghitung umur user
            int usia = tahunSekarang - tahunLahir;

        // Menampilkan salam perkenalan
        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu baru " + usia + " tahun ya!");

        input.close();
    }
}