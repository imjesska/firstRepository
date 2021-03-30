import java.io.PrintStream;
import java.util.Scanner;

public class InClassNotes {
    public static void main(String[] args) {

         /* What we went over in Week 3 in class introducing Java,
         variables, formatting, user inputs, ternary operator (simpler if-else), boolean (true/false)
         some calculation exercises: time, monthly payment, fahrenheit to celsius
          */

        //add an L so it's understood as a long type instead of double/int
        long x = 987654321L;

        /* String is an object, not primitive,
        so they can have access to all the methods defined by the String class
         */
        String username = "pop".concat("corn");
        System.out.println(username);

        /* Escape sequences \r is carriage return, moving the cursor to beginning of line
        \n is new line, which moves cursor to the next line
         */
        System.out.println("This will print on\r\ntwo lines.");
        System.out.println("She said \"Hello\" to me!");
        System.out.println("This will print two back-slashes: \\\\");

        //variable: container for information, declare data type
        double radius = 20;
        double area;

        //computing area using Math.
        area = Math.pow(radius, 2) * Math.PI;

        /* Display the results of area,
        printf("%2f", _) formats the decimal
        %n goes to next line so it's not on the same line
         */
        System.out.printf("This area for the circle of radius " + radius + " is " + "%.2f\n", area);


        //Library class, new object
        Scanner input = new Scanner(System.in); //import java.util.Scanner;

        //input.nextInt takes the next integer value that's entered
        System.out.print("Please type your age: ");
        int userAge = input.nextInt();
        System.out.println("User Age: " + userAge);

        // input.nextDouble takes the next double value that's entered
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("Your salary is: " + salary);

        /* input.next takes just one line (example: Only taking first name)
        whereas input.nextLine can read the entire line (example: takes the full name)
         */
        input.nextLine(); // Needed to add this part to allow me to enter name
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);


        /* Be careful with incremental logical errors, before/after
        int i = 3;
        int a = i++; //increment has not happened yet so still 3, then increment by one a = 3, i = 4
        int b = ++a; //increment happens first b = 4, a = 4
        */

        /* Ternary operator, shorthand if-else statement,
        condition ? exprTrue : eprFalse
         */
        int age = 18;
        String result = age < 100 ? "Less than 100" : "Greater than 100";
        System.out.println(result);

        /* True or False,
        true/even if remainder is 0,
        false/odd if there is a remainder since it's not divisible by 2
         */
        double myValue = 6;
        boolean isEven = (myValue % 2) == 0;

        //Calculate tax
        final double TAX = 0.08875;
        double inputTax = 100;
        double resultTax = inputTax * TAX;
        System.out.printf("output: %.2f %n", resultTax, TAX);

        //Binary conversions, integer to binary and vice versa
        // to binary notation
        System.out.println(Integer.toBinaryString(78));
        // to binary notation
        System.out.println(Integer.toString(11,2));
        // to decimal notation
        System.out.println(Integer.parseUnsignedInt("1011",2));

        //Calculate minutes and remaining seconds from total seconds
        int seconds = 130;
        int minutes = seconds / 60;
        int remainSec = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainSec + " seconds");

        /* Computing Loan Payments,
        calculating the monthly interest rate is important to get results
         */
        System.out.print("Enter the interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        double monthlyInterestRate = interestRate / (100*12);

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1+(monthlyInterestRate)),((years)*12)
        )) );
        System.out.printf("Monthly payment will be: " + "%.2f\n",monthlyPayment);

/*      //Making Fahrenheit into celsius, having formatting issue though..
        double fahrenheit = 105;
        double celsius = (5/9.0) * (fahrenheit - 32);
        System.out.printf(fahrenheit + " degrees fahrenheit is " + "%.2f\n", celsius + "degrees celsius.");

      Steve's solution, calling it from the class/method
        double degreesF = 92;
        System.out.printf("%.2f\n",fahrenheitToCelsius);

        private static double fahrenheitToCelsius(double degreesF)
        {
           return (5/9.0) * (degreesF - 32); //9.0 forces a decimal output
        }

 */
    }

}