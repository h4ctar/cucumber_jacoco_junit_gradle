package ben;

/**
 * Main.
 */
public class Main {

    private final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        new Main().run(args);
    }

    public void run(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int product = calculator.multiply(a, b);
        System.out.println(product);
    }
}
