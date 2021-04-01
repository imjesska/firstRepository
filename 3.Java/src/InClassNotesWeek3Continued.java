import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Integer.parseInt;
import static java.lang.Math.acos;

public class InClassNotesWeek3Continued {
    public static void main(String[] args) {
        /* What we went over in Week 3 in class introducing Java,
         String methods, random numbers and math functions, &||, if-else statements
         some calculation exercises: leap year, char validation,
         finding angles of a triangle with just coordinates, lottery generator
          */

        /* Strings are a class and reference type, and are immutable (cannot be modified)
        reference types need to be instantiated with 'new' operator
        String message = new String("Hello World");
        but this isn't necessary, shorthand works more efficiently
         */
        String message = "Hello World";
        //output false since there's no "!!"
        System.out.println(message.endsWith("!!"));
        //output will be 13
        System.out.println(message.length());
        //will return 1 for e, 4 for o, and -1 for anything not in the string
        System.out.println(message.indexOf("o"));
        //.replace(target, replacement) so hello will now be hi
        //method doesn't modify, it just returns new string, original string is unchanged
        System.out.println(message.replace("Hello","Hi"));
        //trims out the unnecessary extra spaces if "   Hello   World" was put in
        System.out.println(message.trim());

        // similar to above .replace, just returns new string, it does not modify,
        String s1 = "welcome2";
        System.out.println("s1: " + s1);
        String s2 = s1;
        System.out.println("s2: " + s2);

        s1 = "hello";
        System.out.println("s1 changed: " + s1);
        System.out.println("s2: " + s2);

        //Several ways a random number generator can be implemented
        //method 1 print a random number 0 to less than 1
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10));

        //method 2 create an instance of the class Random
        Random rand = new Random();
        System.out.println(rand.nextInt(25)); //between 0-24
        System.out.println((int)(rand.nextDouble()*10)); //same as above Math.random

        //method 3 isolate to current thread to reduce load on machine
        int int_random = ThreadLocalRandom.current().nextInt();
        double double_random = ThreadLocalRandom.current().nextDouble();
        System.out.println("Random Integer:" + int_random);
        System.out.println("Random Double:" + double_random);


       /* A leap year is exactly divisible by 4,
         except for century years (years ending with 00).
         The century year is a leap year only if it is perfectly divisible by 400.

        this will determine if the year entered is a leap year using if-else and/or
        */
        int year;
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)) {
            System.out.println("Specified year is a leap year");
        }
            else {
            System.out.println("Specified year is not a leap year");
        }

        /*  if 'ch' is between A to Z or a to z
         Character.isLetter(); is a method for this,
         create a boolean variable with this to get true/false,
         below is the manual way
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character (A-Z, a-z): ");

        if(input.hasNext()){
            //save the first char into 'ch'
            char ch = input.next().charAt(0);

          if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
        //prints letter
             System.out.println("Letter is valid: " + ch);
         }
         else {
               System.out.println("Not a letter");
            }
         }


        /* Prompts the user to enter 3 (x,y) coordinates of a triangle,
        display each of the triangle's angles.

        To test to make sure this works I used this website:
        https://www.triangle-calculator.com/?what=vc&a=10&a1=15&3dd=3D&a2=&b=30&b1=40&b2=&c=70&c1=30&c2=&submit=Solve&3d=0
        The results should match the output, I formatted by 2 decimal points
       input:       10,15   30,40   70,30
       results:     37.304   114.624  28.072
         */
        input = new Scanner(System.in);
        System.out.print("Enter first x,y coordinates: ");
        String aCords= input.nextLine();

        System.out.print("Enter second x,y coordinates: ");
        String bCords= input.nextLine();

        System.out.print("Enter third x,y coordinates: ");
        String cCords= input.nextLine();

        //to go to the values of (x,y) used comma as the reference point
        var aComma = aCords.indexOf(',');
        var bComma = bCords.indexOf(',');
        var cComma = cCords.indexOf(',');

        //point A coordinates
        String stringX1 = aCords.substring(0, aComma);
        String stringY1 = aCords.substring(aComma + 1);
        //point B coordinates
        String stringX2 = bCords.substring(0, bComma);
        String stringY2 = bCords.substring(bComma + 1);
        //point C coordinates
        String stringX3 = cCords.substring(0,cComma);
        String stringY3 = cCords.substring(cComma + 1);

        //Conversion from string to integer
        int x1 = Integer.parseInt(stringX1);
        int y1 = Integer.parseInt(stringY1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);
        int x3 = Integer.parseInt(stringX3);
        int y3 = Integer.parseInt(stringY3);

        //Calculating the length of sides from the triangle
        double sideA = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double sideB = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 -y1, 2));
        double sideC = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //Calculating the angles BUT end result is in radians not degrees
        double angleA = Math.acos((sideA * sideA - sideB * sideB - sideC * sideC) / (-2 * sideB * sideC));
        double angleB = Math.acos((sideB * sideB - sideA * sideA - sideC *sideC) / (-2 * sideA * sideC));
        double angleC = Math.acos((sideC * sideC - sideB * sideB - sideA * sideA) / (-2 * sideA * sideB));

        //Need the Math.toDegrees to convert it from radians
        System.out.printf("The angle of A is: " + "%.2f\n",Math.toDegrees(angleA));
        System.out.printf("The angle of B is: " + "%.2f\n",Math.toDegrees(angleB));
        System.out.printf("The angle of C is: " + "%.2f\n",Math.toDegrees(angleC));


        /*Lottery that takes randomly generated number from
        10-99 to match with number entered,
        if-statement will display if there were any matches and
        what 'prize' is given.
         */
        int min = 10;
        int max = 99;
        //Random rand = new Random();

        //in order to get numbers from 10-99 needed to 99-10+1 then +10 to shift
        int winningNum = rand.nextInt(max-min+1)+10;

        System.out.println(winningNum); //displays the winning number to test

        //random gen is type int but needs to be string to get indexOf
        String stringWinningNum = Integer.toString(winningNum);

        //goes to the winning numbers using charAt then converts String to Int
        //Note: needed to use char and charAt instead of indexOf
        char stringWinDigit1 = stringWinningNum.charAt(0);
        int winDigit1 = Integer.parseInt(String.valueOf(stringWinDigit1));
        char stringWinDigit2 = stringWinningNum.charAt(1);
        int winDigit2 = Integer.parseInt(String.valueOf(stringWinDigit2));

        //input a number from 10-99
        input = new Scanner(System.in);
        System.out.print("Enter a number from 10-99 : ");
        String StringLottoGuess = input.next();

        //goes to the guessed numbers by charAt(similar to indexOf)
        //string needs to be converted to integer to get the value
        char stringGuessDigit1 = StringLottoGuess.charAt(0);
        int guessDigit1 = Integer.parseInt(String.valueOf(stringGuessDigit1));
        char stringGuessDigit2 = StringLottoGuess.charAt(1);
        int guessDigit2 = Integer.parseInt(String.valueOf(stringGuessDigit2));
        int lottoGuess = Integer.parseInt(StringLottoGuess);

        //else if statement for exact numbers, exact digits, one digit, and no matches
        if (lottoGuess == winningNum) {
            System.out.println("Exact numbers, you win $5,000!");
        } else if(guessDigit2 == winDigit1 && guessDigit1 == winDigit2) {
            System.out.println("Matching digits, you win $1,000");
        } else if((guessDigit1 == winDigit1)
                || (guessDigit1 == winDigit2)
                || (guessDigit2 == winDigit1)
                || (guessDigit2 == winDigit2)) {
            System.out.println("You got one digit, you win $50");
        } else {
            System.out.println("Try again next time, $0");
        }
    }
}
