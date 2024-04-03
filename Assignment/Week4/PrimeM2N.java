import java.util.Scanner;   

public class PrimeM2N {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();

        int count = 0, sum = 0;
        for (int i = 2; count < m; ++i){
            boolean isPrime = true;
            for (int j = 2; j * j <= i; ++j){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                ++count;
                if (count >= n){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}