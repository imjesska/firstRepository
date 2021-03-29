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
        double breakfast = eggs/bacon;
        System.out.println("The output of this division problem is: " + breakfast);

        /* Declaring and dividing double type variables,
        result type needs to be double in order to be valid
         */
        double ice = 3.2;
        double fire = 7.9;
        double melt = fire/ice;
        System.out.println("The out of this division problem is: " + melt);

        /* Declaring and dividing two integer type variables results as 1.0,
        declaring y as type double results in 1.2
         */
        int x = 5;
        double y = 6;
        double q = y/x;
        System.out.println(q);




    }
}
