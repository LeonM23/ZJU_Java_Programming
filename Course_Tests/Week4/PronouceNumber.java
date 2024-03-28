import java.util.Scanner; 

public class PronouceNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), div = 100000;  
        
        if (n < 0){
            System.out.print("fu ");
            n = -n;
        }
        if (n == 0){
            System.out.print("ling");
        } else {
            while (n / div == 0){
                div /= 10;
            }
            for (int i = div; i > 0; i /= 10){
                int digit = n / i;
                n %= i;
                switch (digit){
                    case 0:
                        System.out.print("ling");
                        break;
                    case 1:
                        System.out.print("yi");
                        break;
                    case 2:
                        System.out.print("er");
                        break;
                    case 3:
                        System.out.print("san");
                        break;
                    case 4:
                        System.out.print("si");
                        break;
                    case 5:
                        System.out.print("wu");
                        break;
                    case 6:
                        System.out.print("liu");
                        break;
                    case 7:
                        System.out.print("qi");
                        break;
                    case 8:
                        System.out.print("ba");
                        break;
                    case 9:
                        System.out.print("jiu");
                        break;
                }
                if (i > 1){
                    System.out.print(" ");
                }
            }
        }

    }
}
