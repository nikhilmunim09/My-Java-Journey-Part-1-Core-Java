public class top100_24 {
    public static void main(String[] args) {
        int dec = 2545;
        String hexa = "";
        System.out.println(decToBinary(dec, hexa));
    }

    static String decToBinary(int dec, String hexa) {
        if (dec == 0) {
            return "";
        }
        hexa = decToBinary(dec / 16, hexa);
        if (dec % 16 < 10) {
            return hexa += dec % 16;
        } else {
            switch (dec % 16) {
                case 10: {
                    return hexa += "A";
                }
                case 11: {
                    return hexa += "B";
                }
                case 12: {
                    return hexa += "C";
                }
                case 13: {
                    return hexa += "D";
                }
                case 14: {
                    return hexa += "E";
                }
                case 15: {
                    return hexa += "F";
                }
            }
        }
        return "";
    }
}
