import java.util.Scanner;

public class F2C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        System.out.println((int)((F - 32) * 5.0 / 9.0));
    }
}