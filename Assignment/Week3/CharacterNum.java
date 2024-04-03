import java.util.Scanner;

public class CharacterNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), mul = 1, digit = 0, count = 0, step = 0;
        
        while (num > 0){
            digit = num % 10;
            num /= 10;
            ++step;
            if (step % 2 == digit % 2){
                count += mul;
            }
            mul *= 2;
        }
        System.out.println(count);

    }
}
