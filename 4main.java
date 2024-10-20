import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().replaceAll("[\\s]", "").toLowerCase();
        String b = sc.nextLine().replaceAll("[\\s]", "").toLowerCase();
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        if (Arrays.equals(arrA, arrB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
