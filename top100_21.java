public class top100_21 {
    static final int A = 10;
    static final int B = 11;
    static final int C = 12;
    static final int D = 13;
    static final int F = 15;
    static final int E = 14;

    public static void main(String[] args) {
        String hexa = "CA";
        System.out.println(hexaToDecimal(hexa, 0, hexa.substring(0, 1)));
    }

    static int hexaToDecimal(String hexa, int power, String stop) {
        if (hexa.equals(stop)) {
            if (Character.isAlphabetic(hexa.charAt(hexa.length() - 1))) {
                switch (hexa.charAt(hexa.length() - 1)) {
                    case 'A': {
                        return (int) (A * Math.pow(16, power));
                    }
                    case 'B': {
                        return (int) (B * Math.pow(16, power));
                    }
                    case 'C': {
                        return (int) (C * Math.pow(16, power));
                    }
                    case 'D': {
                        return (int) (D * Math.pow(16, power));
                    }
                    case 'E': {
                        return (int) (E * Math.pow(16, power));
                    }
                    case 'F': {
                        return (int) (F * Math.pow(16, power));
                    }
                }
            } else {
                return (int) (Integer.parseInt(hexa.substring(hexa.length() - 1, hexa.length()))
                        * Math.pow(16, power));
            }
        }
        if (Character.isAlphabetic(hexa.charAt(hexa.length() - 1))) {
            switch (hexa.charAt(hexa.length() - 1)) {
                case 'A': {
                    return (int) (A * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
                case 'B': {
                    return (int) (B * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
                case 'C': {
                    return (int) (C * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
                case 'D': {
                    return (int) (D * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
                case 'E': {
                    return (int) (E * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
                case 'F': {
                    return (int) (F * Math.pow(16, power))
                            + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
                }
            }
        } else {
            return (int) (Integer.parseInt(hexa.substring(hexa.length() - 1, hexa.length())) * Math.pow(16, power))
                    + hexaToDecimal(hexa.substring(0, hexa.length() - 1), ++power, stop);
        }
        return 0;
    }
}
