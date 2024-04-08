package Assignment.Week6;

import java.util.Scanner;

public class Words_length {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        while (!(s = in.next()).endsWith(".")){
            System.out.print(s.length() + " ");
        }
        if (s.length() > 1){
            System.out.print(s.length()-1);
        }

        in.close();
    }

}