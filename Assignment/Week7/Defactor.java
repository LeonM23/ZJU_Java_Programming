package Assignment.Week7;

import java.util.Scanner;

public class Defactor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int num = in.nextInt();

        boolean[] prime_array = new boolean[num+1];
        for (int i = 0; i < prime_array.length; ++i){
            prime_array[i] = true;
        }

        // build prime array
        for (int i = 2; i <= num; ++i){
            if (!prime_array[i]){
                continue;
            }
            int idx = i * 2;
            while (idx <= num){
                prime_array[idx] = false;
                idx += i;
            }
        }

        // print
        System.out.print(num + "=");
        int tmp = num;
        while (!prime_array[tmp]){
            for (int i = 2; i < tmp; ++i){
                if (prime_array[i] && tmp % i == 0){
                    System.out.print(i + "x");
                    tmp /= i;
                    break;
                }
            }
        }
        System.out.print(tmp);
        
        in.close();
    }
}
