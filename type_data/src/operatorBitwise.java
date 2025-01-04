public class operatorBitwise {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // Output: 1 (Binary: 0001)

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // Output: 7 (Binary: 0111) 1

        // 0 | 0 =0
        // 1 | 0 = 1
        // 0 | 1 = 1
        // 1 | 1 = 1

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // Output: 6 (Binary: 0110)
        /*
         * 0111 (7)
         * 0011 (3)
         * ---------
         * 0100 (4)
         */

        // Bitwise Complement
        System.out.println("~a: " + (~a)); // Output: -6 (Binary: ...1010, 2's complement)

        // Left Shift
        System.out.println("a << 1: " + (a << 1)); // Output: 10 (Binary: 1010)

        // Right Shift
        System.out.println("a >> 1: " + (a >> 1)); // Output: 2 (Binary: 0010)

        // Unsigned Right Shift
        System.out.println("a >>> 1: " + (a >>> 1)); // Output: 2 (Binary: 0010)

        // Demonstrating Signed and Unsigned Right Shift with Negative Numbers
        int c = -8; // Binary: ...1000 (2's complement)
        System.out.println("c >> 1: " + (c >> 1)); // Output: -4 (Binary: ...1100)
        System.out.println("c >>> 1: " + (c >>> 1)); // Output: 2147483644 (Binary: 011111...1100)
    }

}
