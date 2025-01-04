public class variabelpengkondisian {
    public static void main(String[] args) {
        int[] angka = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == 40) {
                System.out.println(angka[i] + " ini adalah bilangan 40");
            } else if (angka[i] == 30) {
                System.out.println(angka[i] + " ini adalah bilangan 30");
            } else if (angka[i] == 20 || angka[i] == 10) {
                System.out.println(angka[i] + " ini adalah bilangan 20 dan 10");
            } else {
                System.out.println(angka[i] + " ini adalah bilangan lebih besar dari 40");
            }

        }
    }
}
