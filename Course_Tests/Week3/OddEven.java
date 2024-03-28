import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int odd = 0, even = 0, num = 0;

        while ((num = in.nextInt()) != -1){
            if (num % 2 == 1){
                ++odd;
            } else {
                ++even;
            }            
        }
        System.out.println(odd + " " + even);
    }
}