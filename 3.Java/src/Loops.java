

public class Loops {
    public static void main(String[] args) {



        //using a for loop to  print out numbers 1-10
        for (int a = 1; a < 11; a++) {
            System.out.println(a);
        }

        //using a while loop to print out numbers 1-10
        int b = 1;
        while (b <= 10) {
            System.out.println(b);
            b++;
        }

        //using a do-while loop to print out numbers 1-10
        int c = 1;
        do {
            System.out.println(c);
            c++;
        }
        while (c <= 10);

        /* using for loop from numbers 1-100, printing multiples of 5,
        but not any numbers between 25-75 using CONTINUE
         */
        for (int d = 1; d < 101; d++) {         //counts up to 100
            if (d % 5 == 0) {                   //if d is multiple of 5
                if ((d >= 25) && (d <= 75)) {   //if d is between 25-75 it will continue loop back up
                    continue;
                }
                System.out.println(d); //will complete the print if it isn't redirected by continue
            }
        }
        /* using for loop from numbers 1-100, printing multiples of 5,
        but not any numbers greater than 50 using BREAK
         */

        for (int e = 1; e < 101; e++) { //counts up to 100
            if (e % 5 == 0)             //if e is multiple of 5 it will print
                System.out.println(e);
            if (e >= 50)
                break;                  //if e is over 50 it breaks the loop
        }

        // nested for loop that brings the week and amount of days
        int weeks = 2;
        int days = 5;

        // outer loop prints weeks
        for (int f = 1; f <= weeks; ++f) {
            System.out.println("Week: " + f);

            // inner loop prints days
            for (int g = 1; g <= days; ++g) {
                System.out.println("  Day: " + g);
            }
        }


            //Palindrome forwards and backwards are same, within 10 and 200
        int min = 10;
        int max = 200;
        for (int h = min; h <= max; h++) { //number range within 10-200

            int reverse = 0;
            int i = h;
            //had to look up how to calculate for palindrome
            for (int num = i; i > 0; i /= 10) {
                reverse = reverse * 10 + i % 10;

                if (num == reverse)
                    System.out.println(num);
            }
        }

        /* Fibonacci Sequence, the first two values are added and each succeeding term
         is the sum of the two immediately preceding,  range from 0 to 50
        */
        int j = 0;
        int k = 1;
        int outcome = 0;

            do{
                System.out.println(outcome);
                j = k;
                k = outcome;
                outcome = j + k;

            }while(outcome < 50);


        /* nest a for loop, print out the inner and outer variable, in the inner loop
        once the loop starts the inside loops 5 times, then outer loops a second time while inside loops 5 times,
        etc. until the outer loops a fifth and final time
         */

        for(int l = 1; l <=5; l++){
            for(int m = 1; m <=5;m++){
                System.out.println("Inner loop: l: " + l + ", m: " + m);
            }
            System.out.println();
        }







        }

    }

