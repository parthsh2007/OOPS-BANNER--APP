public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare + initialize array in one step
        String[] banner = {
            String.join("", " ***** ", "   ", " ***** ", "   ", " ****** ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "   ", "*     *", "  ", "*     *"),
            String.join("", "*     *", "  ", "*     *", "   ", "*     *", "  ", "*      "),
            String.join("", "*     *", "  ", "*     *", "   ", "****** ", "   ", " ***** "),
            String.join("", "*     *", "  ", "*     *", "   ", "*      ", "      ", "*"),
            String.join("", "*     *", "  ", "*     *", "   ", "*      ", "   ", "*     *"),
            String.join("", " ***** ", "   ", " ***** ", "   ", "*      ", "    ", " ***** ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}