import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();

        height = (int) (height * 12 / 30.48);
        System.out.println(height / 12 + " " + height % 12);
        in.close();
    }

}