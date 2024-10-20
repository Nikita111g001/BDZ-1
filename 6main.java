import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z;
        while (y != 0) {
            z = (x & y) << 1;
            x = x ^ y;
            y = z;
        }
        System.out.print(x);
    }
}
