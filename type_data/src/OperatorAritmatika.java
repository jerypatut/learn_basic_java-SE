
import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {

        int angka1;
        int angka2;
        int hasil;

        // membuat objek scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // membuat input angka 1
        System.out.print("\nMasukkan angka 1: ");
        angka1 = scanner.nextInt();

        // input angka kedua
        System.out.print("Masukkan angka 2: ");
        angka2 = scanner.nextInt();

        // disini adalah operasi aritmatika
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasil);

        // membuat input angka 1
        System.out.print("\nMasukkan angka 1: ");
        angka1 = scanner.nextInt();

        // input angka kedua
        System.out.print("Masukkan angka 2: ");
        angka2 = scanner.nextInt();

        // disini adalah operasi aritmatika
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasil);

        System.out.print("\nMasukkan angka 1: ");
        angka1 = scanner.nextInt();

        // input angka kedua
        System.out.print("Masukkan angka 2: ");
        angka2 = scanner.nextInt();

        // disini adalah operasi aritmatika
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasil);

        System.out.print("\nMasukkan angka 1: ");
        angka1 = scanner.nextInt();

        // input angka kedua
        System.out.print("Masukkan angka 2: ");
        angka2 = scanner.nextInt();

        // disini adalah operasi aritmatika
        hasil = angka1 / angka2;
        System.out.println("\nHasil pembagian: " + hasil);

        System.out.print("\nMasukkan angka 1: ");
        angka1 = scanner.nextInt();

        // input angka kedua
        System.out.print("Masukkan angka 2: ");
        angka2 = scanner.nextInt();

        // disini adalah operasi aritmatika
        hasil = angka1 % angka2;
        System.out.println("\nHasil modulus: " + hasil);

        scanner.close();
    }

}
