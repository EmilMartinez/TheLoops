package looppractice;

import java.sql.SQLOutput;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {    // it includes 5 because zero is a number.
            // I must state what the variable is.
            System.out.println("Hello"); // How am i going to go through my range.
        }
        int evenSum = 0;
        for (int i = 0; i <= 20; i = i + 2) { // it is incrementing by 2, so it can do the even numbers,.
            evenSum = evenSum + i;            // Essentially i is a pacemaker in this case.
        }
        System.out.println(evenSum);

        int oddSum = 0;
        for(int i =0; i<20; i=2*i+1) { //because 2*0= 0 +1 and 1 is an odd number.
            oddSum = oddSum + i; // all of the odd numbers are stored in I.

        }
        System.out.println(oddSum); // odd sum has all the sum of odd numbers.

        int y =0;
        for(int i=0; i<3; i++){
            y = y + 9;
        }
        int e =0;
        for(int w=0; w<7; w++); // i is just a pacemaker.
         e=e+6;
    }



}
