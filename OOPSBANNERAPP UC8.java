import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String text = "OOPS";

        // HashMap for storing patterns
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patterns.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        patterns.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        // Loop through rows
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (char ch : text.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}