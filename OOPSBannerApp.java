/**
 * OOPS Banner App
 *
 * UC5: Array Initialization using String.join()
 *
 * @author Janvi Vashistha
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in single statement using String.join()
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
