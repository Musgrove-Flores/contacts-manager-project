import java.lang.reflect.AnnotatedTypeVariable;

public class ColouredSystemOutPrintln {

    // This is where I found it:  https://dev.to/awwsmm/coloured-terminal-output-with-java-57l3

    public static final String ANSI_RESET  = "\u001B[0m";

    public static final String ANSI_BLACK  = "\u001B[30m";
    public static final String ANSI_RED    = "\u001B[31m";
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN   = "\u001B[36m";
    public static final String ANSI_WHITE  = "\u001B[37m";

    public static final String ANSI_BRIGHT_BLACK  = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED    = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN  = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
    public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN   = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE  = "\u001B[97m";

    public static final String[] FOREGROUNDS = {
            ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW,
            ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE,
            ANSI_BRIGHT_BLACK, ANSI_BRIGHT_RED, ANSI_BRIGHT_GREEN, ANSI_BRIGHT_YELLOW,
            ANSI_BRIGHT_BLUE, ANSI_BRIGHT_PURPLE, ANSI_BRIGHT_CYAN, ANSI_BRIGHT_WHITE
    };

    public static final String ANSI_BG_BLACK  = "\u001B[40m";
    public static final String ANSI_BG_RED    = "\u001B[41m";
    public static final String ANSI_BG_GREEN  = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE   = "\u001B[44m";
    public static final String ANSI_BG_PURPLE = "\u001B[45m";
    public static final String ANSI_BG_CYAN   = "\u001B[46m";
    public static final String ANSI_BG_WHITE  = "\u001B[47m";

    public static final String ANSI_BRIGHT_BG_BLACK  = "\u001B[100m";
    public static final String ANSI_BRIGHT_BG_RED    = "\u001B[101m";
    public static final String ANSI_BRIGHT_BG_GREEN  = "\u001B[102m";
    public static final String ANSI_BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String ANSI_BRIGHT_BG_BLUE   = "\u001B[104m";
    public static final String ANSI_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String ANSI_BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String ANSI_BRIGHT_BG_WHITE  = "\u001B[107m";

    public static final String[] BACKGROUNDS = {
            ANSI_BG_BLACK, ANSI_BG_RED, ANSI_BG_GREEN, ANSI_BG_YELLOW,
            ANSI_BG_BLUE, ANSI_BG_PURPLE, ANSI_BG_CYAN, ANSI_BG_WHITE,
            ANSI_BRIGHT_BG_BLACK, ANSI_BRIGHT_BG_RED, ANSI_BRIGHT_BG_GREEN, ANSI_BRIGHT_BG_YELLOW,
            ANSI_BRIGHT_BG_BLUE, ANSI_BRIGHT_BG_PURPLE, ANSI_BRIGHT_BG_CYAN, ANSI_BRIGHT_BG_WHITE };

    public static void main(String[] args) {

//        System.out.println("\n  Default text\n");
//
//        for (String fg : FOREGROUNDS) {
//            for (String bg : BACKGROUNDS)
//                System.out.print(fg + bg + "  TEST  ");
//            System.out.println(ANSI_RESET);
//        }
//
//        System.out.println(ANSI_RESET + "\n  Back to default.\n");

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("\n  Default text\n");
        // This is a test
        System.out.println("1\n");
        System.out.println(ANSI_BG_CYAN + "\nCyan Background\n");
        System.out.println("hello there good ma'am");

        System.out.println(ANSI_RESET);
        System.out.println("2\n");
        System.out.println(ANSI_BRIGHT_CYAN + "\nCyan Text\n");
        System.out.println("This text is gonna be Cyan as well.");
        System.out.println(ANSI_RESET);

        System.out.println("3\n");
        System.out.println(ANSI_BG_GREEN + ANSI_RED + "\nGreen Background and Red text\n");
        System.out.println(ANSI_RESET);
        System.out.println(ANSI_BG_GREEN + ANSI_BRIGHT_RED + "\nGreen Background and Bright Red text");
        System.out.println(ANSI_RESET);

        System.out.println("4\n");
        System.out.println("No Background " + ANSI_RESET + ANSI_YELLOW+ " and Red text\n");
        System.out.println(ANSI_RESET);
        System.out.println("No Background " + ANSI_RESET + ANSI_BRIGHT_YELLOW+ "and Bright Red text\n");
        System.out.println(ANSI_RESET);

        System.out.println("5\n");
        System.out.println(ANSI_BRIGHT_BG_GREEN + "Green Background " + ANSI_RESET + ANSI_PURPLE + " and Red text\n");
        System.out.println(ANSI_RESET);
        System.out.println(ANSI_BRIGHT_BG_BLUE + "Green Background " + ANSI_RESET + ANSI_BRIGHT_PURPLE + "and Bright Red text\n");
        System.out.println(ANSI_RESET);

        System.out.println("6\n");
        System.out.println(ANSI_BG_YELLOW);
        System.out.println("I can say whatever");
        System.out.println("I can still say whatever");
        System.out.println(ANSI_RESET);
        System.out.println("Things should be default.");
        System.out.println(ANSI_RESET);
        System.out.println(ANSI_BRIGHT_YELLOW + "And we switchin' up on 'em");
        System.out.println("Still at 'em");

        // Test concluded
        System.out.println(ANSI_RESET + "\n  Back to default.\n");

    }

}
