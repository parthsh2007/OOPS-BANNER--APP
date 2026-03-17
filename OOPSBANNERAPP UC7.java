import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Word to print
        String text = "OOPS";

        // Initialize pattern map
        Map<Character, CharacterPattern> patternMap = CharacterPatternMap.getPatterns();

        // Banner height = 7
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharacterPattern pattern = patternMap.get(ch);
                line.append(pattern.getLine(i)).append("   ");
            }

            System.out.println(line);
        }
    }
}

/**
 * Class representing pattern of a character
 */
class CharacterPattern {
    private String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return pattern[index];
    }
}

/**
 * Centralized pattern storage
 */
class CharacterPatternMap {

    public static Map<Character, CharacterPattern> getPatterns() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern(new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        }));

        map.put('P', new CharacterPattern(new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        }));

        map.put('S', new CharacterPattern(new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        }));

        return map;
    }
}