public class bin {
    public static void main(String[] args) {
        System.out.println(binToInt("1111111111111111111111111111111"));
        System.out.println(binToInt("10000000000000000000000000000000")); // overflow
    }
    public static int binToInt (String bin) {
        int deci = 0;
        for (int i = 0; i < bin.length(); i++) {
            deci <<= 1; // moves all bits over left (doubling)
            if (bin.charAt(i) == '1') {
                deci |= 1; // bit wise OR
            }
        } // found on StackOverflow
        return deci;
    }
}