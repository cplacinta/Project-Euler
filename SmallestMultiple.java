package EulerProject;

import java.util.ArrayList;

public class SmallestMultiple {
    public static void main(String[] args) {
        ArrayList<Integer> aux = new ArrayList<>();

        int counter = 0;
        for (long i = 10000; i < 999999999; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    counter++;
                }

            }
            if (counter == 20) {
                System.out.println("Lowest divisible number upto 20 is " +i);
                break;
            } else counter = 0;
        }
    }
}
