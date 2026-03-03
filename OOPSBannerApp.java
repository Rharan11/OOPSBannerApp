public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = generateO();
        String[] p = generateP();
        String[] s = generateS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("    ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for O
    public static String[] generateO() {
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

    // Helper method for P
    public static String[] generateP() {
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

    // Helper method for S
    public static String[] generateS() {
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
}