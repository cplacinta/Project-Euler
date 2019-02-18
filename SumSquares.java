package EulerProject;

import java.util.ArrayList;

public class SumSquares {
    public static void main(String[] args) {
        ArrayList<Integer> aux = new ArrayList<>();

        int sumSquare = 0;
        long squareOfSum = 0;
        for (long i = 1; i <= 100; i++) {
            sumSquare +=Math.pow(i, 2);
            squareOfSum+=i;
        }
        System.out.println(sumSquare);
        System.out.println(Math.pow(squareOfSum,2) - sumSquare);
    }
}
