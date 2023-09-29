import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Membaca jumlah permen dan teman user
            int N = input.nextInt();
            int T = input.nextInt();

            // Menghitung jatah permen perorang
            int hasilPembagian = N / (T + 1);

            // Menghitung sisa permen
            int sisaPermen = (N % T + 1);

        // Menampilkan hasil pembagian dan sisa permen
        System.out.println(hasilPembagian);
        System.out.println(N-(hasilPembagian*(T +1));

        input.close();
    }
}