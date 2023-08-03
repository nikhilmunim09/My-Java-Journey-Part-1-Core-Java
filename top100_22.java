public class top100_22 {
    public static void main(String[] args) {
        int dec = 5;
        String binary = "";
        System.out.println(decToBinary(dec, binary));
    }

    static String decToBinary(int dec, String binary) {
        if (dec == 0) {
            return "";
        }
        binary = decToBinary(dec / 2, binary);
        return binary += dec % 2;
    }
}
