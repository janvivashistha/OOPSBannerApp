import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Janvi Vashistha
 * @version 8.0
 */
public class OOPSBannerApp {

    // Method to initialize character pattern map
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Method to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}
