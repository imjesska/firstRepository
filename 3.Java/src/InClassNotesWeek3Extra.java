import java.util.Scanner;

public class InClassNotesWeek3Extra {
    public static void main(String[] args) {

        /* What we went over in Week 3 in class introducing Java,
         Strings, while loops and conditions, if-else,
        boolean, edge cases (adding more to it and test
        errors that may occur)

        I revised my lottery code from my InClassNotesWeek3Continued
        since we did not go over loops at the time of writing it.

        And instructor Jafer provided code that summarizes everything
        taught in week 3 of introduction to Java.
         */


        /* As a class we peer programmed together,
        a user must enter their full name where it will display
        last name then first name (excluding middle name/initials),
        it will keep running until the user types exit.
         */
        boolean repeat = true;
        String fullName = " ";

        while (repeat) {
            Scanner input = new Scanner(System.in);
            System.out.print("Write your full name: ");

            fullName = input.nextLine();
            fullName = fullName.trim();
            int space = fullName.indexOf(' ');

            if (fullName.equalsIgnoreCase("exit")) { //changed it from equals so its not case sensitive
                repeat = false;
                System.out.println("Exiting now.");
            } else if (space == -1) {
                System.out.println("Please enter full name or exit.");
            } else if (fullName.length() != 0) {
                String firstName = fullName.substring(0, space);
                String lastName = fullName.substring(space + 1);
                System.out.println(lastName + " " + firstName);
            } else {
                System.out.println("error");
            }
        }


        /*Lottery that takes randomly generated number from
        10-99 to match with number entered,
        if-statement will display if there were any matches and
        what 'prize' is given.
         */

        int winningNum = 0;

        //in order to get numbers from 10-99
        while (winningNum < 10) {
            winningNum = (int) (Math.random() * 100);
        }
        //random gen is type int need to use valueOf to retrieve number inside string
        String random = String.valueOf(winningNum);
        System.out.println(winningNum);     //displays the winning number to test
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 10-99 : ");
        String lottoInput = input.nextLine();

        //else if statement for exact numbers, exact digits, one digit, and no matches
        if (lottoInput.equals(random)) {
            System.out.println("Exact numbers, you win $5,000!");
        } else if (lottoInput.charAt(0) == random.charAt(1) && lottoInput.charAt(1) == random.charAt(0)) {
            System.out.println("Matching digits, you win $1,000");
        } else if (lottoInput.charAt(0) == random.charAt(0) || lottoInput.charAt(1) == random.charAt(1)
                || lottoInput.charAt(0) == random.charAt(1) || lottoInput.charAt(1) == random.charAt(0)) {
            System.out.println("You got one digit, you win $50");
        } else {
            System.out.println("Try again next time, $0");


            /* This code that covers what we covered so far this week in Java.
            At first I thought there were errors since there's lowercase's
            and flipping around of last/first name, but after
            going through the commenting, it appears to be intentional.

            It's complex in it's own way because it uses decimal notation
            of the grade and it incorporates the if-else statement with a
            switch statement rather than using it separately on its own.

            It's also interesting how split() is used instead of retrieving
            with indexOf and charAt. Using String[], split(), and %s to
            separate the name and reference that way. (Line 64 - 68)
            */
            // Already instantiate a scanner above (want to keep notes together) therefore 'Scanner' not in front
            input = new Scanner(System.in);
            // init grade
            String grade;
            // print message
            System.out.println("Insert student full name");
            // check if next line is a string
            if (input.hasNextLine()) {
                // split name by spaces "split()" delete whitespace "trim()" convert all letters to lowercase
                // save first name in String array index 0 and last name in index 1
                String[] name = input.nextLine().toLowerCase().trim().split(" ");
                // print message of hello student first name
                System.out.printf("Hello %s%n", name[0]);
                // print message with student lastname
                System.out.printf("Enter %s score: %n", name[1]);
                //check if number is double
                if (input.hasNextDouble()) {
                    // get absolute value of number and ceiling the number
                    double score = Math.ceil(Math.abs(input.nextDouble()));
                    // if score is 100 set grade
                    if (score == 100) grade = "A+";
                        // if score is 99.99 to 90 set grade
                    else if (score < 100 && score >= 90) grade = "A";
                        // if score is 89.99 to 80 set grade
                    else if (score < 90 && score >= 80) grade = "B";
                        // if score is 79.99 to 70 set grade
                    else if (score < 80 && score >= 70) grade = "C";
                        // if score is 69.99 to 60 set grade
                    else if (score < 70 && score >= 60) grade = "D";
                        // if score is 59.99 or below
                    else grade = "F";
                    // ternary operator
                    grade += score > 100 ? " - Can't get more than a 100" : "";
                    switch (grade) {
                        // grade = grade + "String literal"
                        case "A+":
                            grade += " Excellent";
                            break;
                        case "A":
                            grade += " Very good";
                            break;
                        case "B":
                            grade += " Good";
                            break;
                        case "C":
                            grade += " Not bad";
                            break;
                        case "D":
                            grade += " Bad";
                            break;
                        case "F":
                            grade += " Try again";
                            break;
                        //default : grade = "Something happened!";
                    }
                    // print message lastname and grade
                    System.out.printf("%n%s grade is: %s%n", name[1], grade);
                } else {
                    System.out.println("Not a valid number!");
                }
            } else {
                System.out.println("Not a valid Name!");
            }


        }
    }
}
