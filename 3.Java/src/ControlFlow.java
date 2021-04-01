import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        //Displays if number is more than 20, less than 10, or between 10-20
        int x = 5;
        if (x >= 20)
            System.out.println("greater than or equal to 20");
        else if ((10 < x) && (x < 20))
            System.out.println("between 10 and 20");
        else if (x < 10)
            System.out.println("less than 10");  //when x is 10 it'll give error because its between values, need an <=
        else
            System.out.println("error");

        //Displays if  number is in range between 10-20
        if ((x >= 10) && (x <= 20)) {           //when using >= and <= it includes 10 and 20 as values within range
            System.out.println("In range");
        } else if ((x > 20) || (x < 10))
            System.out.println("Out of range");

        //Displays the letter grade depending on the score that is entered
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score here: ");

        score = input.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Score is out of range.");
        } else if (score >= 90)
            System.out.println("You have an A");
        else if (score >= 80)
            System.out.println("You have an B");
        else if (score >= 70)
            System.out.println("You have an C");
        else if (score >= 60)
            System.out.println("You have an D");
        else if (score <= 0)
            System.out.println("You have an F");
        else
            System.out.println("Error");

        /* Display a weekday with the number being entered,
        assuming people consider Sunday as first day of the week,
        some people consider Monday as the first day,
        but going by a calendar, I'll use Sunday as the beginning of the week.
         */
        int caseNum = 0;
        Scanner caseInput = new Scanner(System.in);
        System.out.println("Enter a number between 1-7: ");
        caseNum = caseInput.nextInt();

        if((caseNum > 0) && (caseNum <= 7)) {

            switch (caseNum) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        }else if((caseNum > 7) || (caseNum <= 0)){
            System.out.println("Out of range");
        }else
            System.out.println("error");

    }
}