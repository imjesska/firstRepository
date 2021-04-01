import java.lang.Math;
import java.sql.SQLOutput;

import com.sun.jdi.IntegerType;

public class OperatorsAndNumbers {
    public static void main(String[] args) {

        /* This exercise shows shifting left once will have the variable
        multiply by 2 once and changes the binary according to the new value
         */
        int x = 2;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x <<= 1; //x is now 4
        System.out.println("Left shifting by one x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 9;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x <<= 1; //x is now 18
        System.out.println("Left shifting by one x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 17;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x <<= 1; //x is now 34
        System.out.println("Left shifting by one x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 88;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x <<= 1; //x is now 176
        System.out.println("Left shifting by one x is now: " + x + " and binary is " + Integer.toBinaryString(x));

        /* This exercise shows shifting right twice would have the
        variable divisible by 2 twice and changes the binary accordingly
        to the new value
         */
        x = 150;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x >>= 2; //x is now 37
        System.out.println("Right shifting by two x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 225;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x >>= 2; //x is now 56
        System.out.println("Right shifting by two x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 1555;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x >>= 2; //x is now 388
        System.out.println("Right shifting by two x is now:: " + x + " and binary is " + Integer.toBinaryString(x));

        x = 32456;
        System.out.println("The integer " + x + " binary is: " + Integer.toBinaryString(x));
        x >>= 2; //x is now 8114
        System.out.println("Right shifting by two x is now: " + x + " and binary is " + Integer.toBinaryString(x));

        //Using bitwise & operator to see the changes of &/|, not sure why we need to assign var z
        x = 7;
        int y = 17; //shift distance
        System.out.println("This is x&y: " + (x & y)); //output is 1
        System.out.println("This is x|y: " + (x | y)); //output is 23

        String z = Integer.toBinaryString(x & y); //z can only be a string
        System.out.println(z);

        System.out.println("This is x&y: " + Integer.toBinaryString(x & y)); //output is 1
        System.out.println("This is x|y: " + Integer.toBinaryString(x | y)); //output is 10111

        //Displays num and how it will increment after changes
        int num = 5;
        System.out.println(num); //output is 5
        System.out.println(num++); //output still 5 - almost appears as if nothing happened
        System.out.println(num); //output is now 6

        //Displays what happens during the incremental process, prefix and postfix ++
         x = 5;
         y = 8;
        System.out.println(x); //x is 5
        int sum = ++x + y;
        System.out.println(sum); //sum is 14 so it incremented and added y
        System.out.println(x); //x is 6

        x = 5;
        y = 8;
        System.out.println(x); //x is 5
        sum = x++ + y;
        System.out.println(sum); //x is 13 so it did not increment and only added y
        System.out.println(x); //x is now 6, so I can assume x only increments after adding y
    }




    }
