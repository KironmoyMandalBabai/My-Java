public class dec_to_by_recursion {
    public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            int remainder = decimal % 2;
            int quotient = decimal / 2;
            return decimalToBinary(quotient) + String.valueOf(remainder);
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 42;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(binaryNumber); // Output: 101010
    }
}

}
