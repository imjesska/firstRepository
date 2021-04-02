public class Loops {
    public static void main(String[] args) {

        // **UNFINISHED** have to run to work :(

        //using a for loop to  print out numbers 1-10
        for (int a = 1; a < 11; a++) {
            System.out.println(a);
        }

        //using a while loop to print out numbers 1-10
        int b = 1;
        while (b <= 10){
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
        but not any numbers between 25-75.

        NOTE: Use the 'continue' statement, not done yet.
         */
        for (int d = 1; d < 101; d++) {
        if ((d % 5 == 0) && (d < 25) || (d % 5 == 0) && (d > 75)) {
            System.out.println(d);
            }
        }

        /* using for loop from numbers 1-100, printing multiples of 5,
        but not any numbers greater than 50.

        NOTE: Use the 'break' keyword, not done yet
         */
        for (int e = 1; e < 101; e++) {
            if ((e % 5 == 0) && (e < 50)) {
                System.out.println(e);
            }
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




       //Fibonacci Sequence from 0 to 50



        /* nest a for loop
         print out the inner and outer variable, in the inner loop
         */
    }

    }

}

