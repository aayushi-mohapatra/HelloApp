public class oopsuc5 {

    public static void main(String[] args) {

        // Declare and initialize String array in a single statement using array literal syntax
        String[] banner = {
            String.join("  ", "  *****  ", "  *****  ", " ******  ", "  *****  "),
            String.join("  ", " **   ** ", " **   ** ", " **   ** ", " **   ** "),
            String.join("  ", " **   ** ", " **   ** ", " **   ** ", " **      "),
            String.join("  ", " **   ** ", " **   ** ", " ******  ", "  *****  "),
            String.join("  ", " **   ** ", " **   ** ", " **      ", "      ** "),
            String.join("  ", " **   ** ", " **   ** ", " **      ", " **   ** "),
            String.join("  ", "  *****  ", "  *****  ", " **      ", "  *****  ")
        };

        // Use for-each loop to print each banner line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}