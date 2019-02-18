package EulerProject;

import java.util.Scanner;

public class MultiplyOf3And5 {
    public static void main(String[] args) {

    long sum = 1;

    for (int i=0; i< 1000; i++){
        if (i%2==0 || i%5==0){
            sum+=i;
        }
    }
    System.out.println(sum);

    }
}