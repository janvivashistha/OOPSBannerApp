/**
 * OOPS Banner App
 *
 * UC6: Using Static Helper Methods
 *
 * @author Janvi Vashistha
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to create letter O
    public static String[] createO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to create letter P
    public static String[] createP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method to create letter S
    public static String[] createS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = createO();
        String[] P = createP();
        String[] S = createS();

        // Combine and print row by row
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}
