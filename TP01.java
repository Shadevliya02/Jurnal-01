import java.util.Scanner;

public class TP01{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Masukkan 2 Suhu Celcius: ");
        int suhuX = input.nextInt();
        int suhuY = input.nextInt();

            // suhu ke Fahrenheit
            double f1 = 1.8 * suhuX + 32;
            double f2 = 1.8 * suhuY + 32;

            // suhu ke Kelvin
            double k1 = suhuX + 273.15;
            double k2 = suhuY + 273.15;

        // hasil konversi
        System.out.printf("%.1f F, %.1f F\n", f1, f2);
        System.out.printf("%.2f K, %.2f K", k1, k2);

        input.close();
    }

}