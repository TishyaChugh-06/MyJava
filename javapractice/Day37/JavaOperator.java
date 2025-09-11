public class JavaOperator {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        a += 2;
        System.out.println("a: " + a);
        a -= 4;
        System.out.println("a: " + a);
        a *= 6;
        System.out.println("a: " + a);
        a /= 5;
        System.out.println("a : " + a);

        a %= 5;
        System.out.println("a: " + a);
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        int max_num = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max_num);
    }
}
