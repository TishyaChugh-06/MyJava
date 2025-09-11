public class SumNumbers {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide 3 numbers as arguments.");
            return;
        }
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);

        int sum = a + b + c;

        System.out.println("The sum is: " + sum);
    }
}

