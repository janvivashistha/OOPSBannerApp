/**
 * OOPS Banner App
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Janvi Vashistha
 * @version 7.0
 */
public class OOPSBannerApp {

    // Static Inner Class to store character and pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Word to display
        String word = "OOPS";

        CharacterPatternMap[] patterns = {O, O, P, S};

        // Print banner row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap pattern : patterns) {
                line.append(pattern.getPattern()[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}
