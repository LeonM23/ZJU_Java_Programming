import java.util.Scanner;

public class Time_Convert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int hour = time / 100 - 8, min = time % 100;
        if (hour < 0){
            hour += 24;
        }
        System.out.println(hour * 100 + min);
    }
}