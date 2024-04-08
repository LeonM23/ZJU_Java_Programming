package Assignment.Week6;

import java.util.Scanner;

public class GPS_info {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s, time = "";
        int dollor_idx, aster_idx, first_comma_idx;
        char c;
        while (!(s = in.nextLine()).equals("END")){
            dollor_idx = s.indexOf("$");
            aster_idx = s.indexOf("*", s.lastIndexOf(",")+1);
            
            c = s.charAt(dollor_idx+1);
            for (int i = dollor_idx+2; i < aster_idx; ++i){
                c ^= s.charAt(i);
            }
            first_comma_idx = s.indexOf(",");
            if (Integer.parseInt(s.substring(aster_idx+1, aster_idx+3), 16) == c && s.charAt(s.indexOf(",", first_comma_idx+1)+1) == 'A'){
                time = s.substring(first_comma_idx+1, first_comma_idx+7);
            }
        }
        if (time.length() == 6){
            int dt = Integer.parseInt(time) + 80000;
            dt = dt % 240000 + 1000000;
            String dt_s = dt + "";
            System.out.print(dt_s.substring(1, 3) + ":" + dt_s.substring(3, 5)+":"+dt_s.substring(5,7));
        }
        //$GPRMC,174813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*54

        in.close();
    }

}