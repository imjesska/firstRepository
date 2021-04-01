import java.awt.*;
import java.util.Scanner;

public class CoreJavaBasics {
    public static void main(String[] args) {

        //Declaring and adding integer type variables
        int apple = 5;
        int banana = 2;
        int smoothie = apple + banana;
        System.out.println("This would give you: " + smoothie);

        //Declaring and adding double type variables
        double sky = 3;
        double rain = 50.3;
        double storm = sky + rain;
        System.out.println("This would give you this result: " + rain);

        /* Declaring and adding a double type with a integer type variable,
        the result must be double type to be valid, cannot be integer type
         */
        int cat = 1;
        double dog = 9.5;
        double animal = cat + dog;
        System.out.println("The output of this one is: " + animal);

        /* Declaring and dividing integer type variables,
        integer type cannot have decimals, variable and
        result type need to be changed to double in order to be valid
         */
        double eggs = 33.3;
        int bacon = 7;
        double breakfast = eggs / bacon;
        System.out.println("The output of this division problem is: " + breakfast);

        /* Declaring and dividing double type variables,
        result type needs to be double in order to be valid
         */
        double ice = 3.2;
        double fire = 7.9;
        double melt = fire / ice;
        System.out.println("The out of this division problem is: " + melt);

        /* Declaring and dividing two integer type variables results as 1.0,
        declaring y as type double results in 1.2
         */
        int x = 5;
        double y = 6;
        double q = y / x;
        System.out.println(q);

        //Declaring a constant and using it in a calculation
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours did you work?: ");

        double hours = input.nextDouble();
        final double MIN_WAGE = 7.25;
        double wages = MIN_WAGE * hours;

        System.out.println("You have worked " + hours + "hours. Your pay will be: $" + wages);

        //Gives the total sale of 3 coffees, 4 cappuccinos, and 2 green teas
            double coffee = 4.50;
            double cappuccino = 3.00;
            double greentea = 3.50;

            final double SALES_TAX = .07;
            double subTotal = (3 * coffee) + (4 * cappuccino) + (2 * greentea);
            double totalSale = subTotal + (subTotal*SALES_TAX);

        System.out.printf("The total with tax is: $%.2f",totalSale);

        }
    }
