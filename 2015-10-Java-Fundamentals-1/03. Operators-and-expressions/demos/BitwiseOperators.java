import java.text.MessageFormat;

public class BitwiseOperators {
    public static void main(String[] args) {
        short a = 3;                  // 00000000 00000011 = 3
        short b = 5;                  // 00000000 00000101 = 5

        writeLine(a | b);     // 00000000 00000111 = 7
        writeLine(a & b);     // 00000000 00000001 = 1
        writeLine(a ^ b);     // 00000000 00000110 = 6
        writeLine(~a & b);     // 00000000 00000100 = 4
        writeLine(a << 1);   // 00000000 00000110 = 6
        writeLine(a >> 1);   // 00000000 00000001 = 1
        writeLine(a >> 2);   // 00000000 00000000 = 0
        writeLine(a << 2);   // 00000000 00001100 = 12
        writeLine(~a);         // 11111111 11111100 = -4 = 65532
        writeLine((short) ~a); // 11111111 11111100 = -4 = 65532

        // Find the bit at position p in n
        int p = 5;
        int n = 35;               // 00000000 00100011
        int mask = 1 << p;        // 00000000 00100000
        int nAndMask = n & mask;  // 00000000 00100000
        int bit = nAndMask >> p;  // 00000000 00000001
        writeLine(bit);   // 1
        writeLine(PadLeft(Integer.toBinaryString(bit), 32, '0'));

        // Set the bit at position p to 0 in a number n
        p = 5;
        n = 35;                     // 00000000 00100011
        mask = ~(1 << p);           // 11111111 11011111
        int result = n & mask;      // 00000000 00000011
        writeLine(result);  // 3
        writeLine(PadLeft(Integer.toBinaryString(result), 32, '0'));

        p = 4;
        n = 35;                     // 00000000 00100011
        mask = 1 << p;              // 00000000 00010000
        result = n | mask;          // 00000000 00110011
        writeLine(result);  // 51
        writeLine(PadLeft(Integer.toBinaryString(result), 32, '0'));
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static String PadLeft(String str, int len, char ch) {
        return String.format("%32s", str).replace(' ', '0');
    }
}