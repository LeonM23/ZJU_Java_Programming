import java.util.Scanner;

public class Poly_add {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int poly, num;
        int cnt_zero = 2;
        int[] poly_array = new int[101];

        do{
            poly = in.nextInt();
            num = in.nextInt();
            if (poly >= 0){
                poly_array[poly] += num;
            }
            if (poly == 0){
                --cnt_zero;
            }
        }while(cnt_zero > 0);

        int max_idx = 0;
        for (int i = poly_array.length - 1; i >= 0; --i){
            if (poly_array[i] != 0){
                max_idx = i;
                break;
            }
        }
        if (max_idx == 0){
            System.out.print(poly_array[0]);
        } else{
            for (int i = max_idx; i >= 0; --i){
                if (poly_array[i] != 0){
                    if (i == max_idx){
                        if (Math.abs(poly_array[i]) == 1){
                            if (poly_array[i] < 0){
                                System.out.print("-");
                            }
                        }
                        else{
                            System.out.print(poly_array[i]);
                        }
                    } else {
                        if (Math.abs(poly_array[i]) == 1){
                            if (poly_array[i] < 0){
                                System.out.print("-");
                            } else{
                                System.out.print("+");
                            }
                        }
                        else{
                            System.out.print((poly_array[i] > 0 ? "+" : "") + poly_array[i]);
                        }

                    }
                    switch (i) {
                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("x");
                            break;
                        default:
                            System.out.print("x" + i);
                    }
                }
            }
        }
        System.out.println();
        in.close();
    }
}