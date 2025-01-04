import java.util.Scanner;

public class pengkondisian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel nilai untuk menyimpan input
        int nilai;

        // Meminta input nilai dari pengguna
        System.out.print("Masukkan nilai Anda: ");
        nilai = scanner.nextInt();

        // Struktur pengkondisian if-else
        if (nilai == 100) {
            System.out.println("Nilai Anda A+");
        } else if (nilai > 80) {
            System.out.println("Nilai Anda B");
        } else {
            System.out.println("Nilai Anda C");
        }

        // Meminta input angka untuk switch-case
        System.out.print("Masukkan angka (5, 10, 12, atau 7): ");
        int huruf = scanner.nextInt();

        // Struktur switch-case
        switch (huruf) {
            case 10:
                System.out.println("Luar biasa!");
                break;
            case 12:
                System.out.println("Bagus!");
                break;
            case 7:
                System.out.println("Cukup!");
                break;
            default:
                System.out.println("Perlu usaha lebih!");
        }

        // Menutup scanner
        scanner.close();
    }
}
