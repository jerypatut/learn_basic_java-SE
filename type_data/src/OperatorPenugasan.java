public class OperatorPenugasan {
    public static void main(String[] args) {
        int x = 5;

        // Penugasan biasa
        x = 10; // x sekarang menjadi 10
        System.out.println("x = " + x); // 10

        // Penugasan dengan operator penugasan
        x += 5; // x = x + 5, sekarang x menjadi 15
        System.out.println("x += 5: " + x); // 15

        x -= 3; // x = x - 3, sekarang x menjadi 12
        System.out.println("x -= 3: " + x); // 12

        x *= 2; // x = x * 2, sekarang x menjadi 24
        System.out.println("x *= 2: " + x); // 24

        x /= 4; // x = x / 4, sekarang x menjadi 6
        System.out.println("x /= 4: " + x); // 6

        x %= 3; // x = x % 3, sekarang x menjadi 0 (sisa dari 6 dibagi 3)
        System.out.println("x %= 3: " + x); // 0
    }
}
