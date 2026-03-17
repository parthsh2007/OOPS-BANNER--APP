public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all lines in array
        String[] banner = {

            String.join("", " ***** ", "   ", " ***** ", "   ", " ****** ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "   ", "*     *", "  ", "*     *"),
            String.join("", "*     *", "  ", "*     *", "   ", "*     *", "  ", "*      "),
            String.join("", "*     *", "  ", "*     *", "   ", "****** ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "   ", "*      ", "      ", "*"),
            String.join("", "*     *", "  ", "*     *", "   ", "*      ", "   ", "*     *"),
            String.join("", " ***** ", "   ", " ***** ", "   ", "*      ", "    ", " ***** ")
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}