public class CommandLine{
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: Please provide one argument!");
            return;
        }

        System.out.println("You entered: " + args[0]);
    }
}
