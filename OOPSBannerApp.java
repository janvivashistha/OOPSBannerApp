/**
 * OOPS Banner App
 *
 * UC4: Print OOPS Banner using Array and Loop
 *
 * @author Janvi Vashistha
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {
                " *****   *****   *****   ***** ",
                "*     * *     * *     * *     *",
                "*     * *     * *     * *     *",
                "*     * *     * *     * *     *",
                "*     * *     * *     * *     *",
                "*     * *     * *     * *     *",
                " *****   *****   *****   ***** "
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
