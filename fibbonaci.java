package EulerProject;

import java.sql.SQLOutput;
import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {

        long fibbonaci1 = 2;
        long fibbonaci = 1;
        long sum = fibbonaci1;
        long sumEven=0;

        for (int i=3; i< 33; i++){

            sum = fibbonaci1 + fibbonaci;
            fibbonaci = fibbonaci1;
            fibbonaci1 = sum;
            System.out.println(sum);
            if (sum %2 ==0) {
                sumEven+=sum;
            }



        }
        System.out.println("------------------------------");
        System.out.println(sumEven);
    }
}
