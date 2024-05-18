public class top100_23 {
    public static void main(String[] args) {
        int dec = 214;
        String octal = "";
        System.out.println(decToOctal(dec, octal));
    }

    static String decToOctal(int dec, String octal) {
        if (dec == 0) {
            return "";
        }
        octal = decToOctal(dec / 8, octal);
        return octal += dec % 8;
    }
}
