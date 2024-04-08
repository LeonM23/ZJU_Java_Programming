package Assignment.Week7;

import java.util.Scanner;

public class Perfect_num {

    public static boolean isPerfect(int num) {
        boolean is_perfect = false;

        int check = 0;
        for (int i = 0; i < num - 1; ++i){
            if (num % (i + 1) == 0){
                check += i + 1;
            }
        }
        if (check == num){
            is_perfect = true;
        }

        return is_perfect;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int cnt = 0;
        int[] p_array = new int[m-n+1];
        for (int i = 0; i < p_array.length; ++i){
            if (isPerfect(n + i)){
                p_array[cnt++] = n + i;
            }else{
                p_array[cnt] = -1;
            }
        }
        if (cnt > 0){
            for (int i = 0; i < p_array.length; ++i){
                if (p_array[i] > 0){
                    System.out.print(p_array[i]);
                    --cnt;
                    if (cnt > 0){
                        System.out.print(" ");
                    }
                }
            }
        }else{
            System.out.println();
        }
        
        in.close();
    }

}
