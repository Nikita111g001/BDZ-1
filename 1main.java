import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        boolean fl = true;
        while (a > 0) {
            long b = a % 10;
            if (b == 0 && fl) {
                a /= 10;
                continue;
            }
            if (fl) {
                fl = false;
                System.out.print(b);
            } else {
                System.out.print(b);
            }
            a /= 10;
        }
    }
}
