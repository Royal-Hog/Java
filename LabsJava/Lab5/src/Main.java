
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There are no arguments.");
        } else {
            System.out.println("arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}