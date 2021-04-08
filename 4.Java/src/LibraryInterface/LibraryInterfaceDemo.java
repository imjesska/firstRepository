package LibraryInterface;

class LibraryInterfaceDemo{

//test cases to perform the functions
    public static void main(String[] args) {


        KidUsers kid1 = new KidUsers(10, "Kids");
        KidUsers kid2 = new KidUsers(18, "Fiction");
        AdultUsers adult1 = new AdultUsers(5, "Kids");
        AdultUsers adult2 = new AdultUsers(23,"Fiction");

        kid1.registerAccount(); //kid1 is of age, success on registering as kid user
        kid1.requestBook();     //kid1 is able to check out kids book

        kid2.registerAccount(); //kid2 is too old to register as kid user

        /* kid2 is not allowed to take out fiction book even though they're old enough,
         they tried to register as a kid so output only relates to kid users,
         NOTE: I would like to revisit this so:
         kid2 shouldn't be able to request book without registering correctly first
         */
        kid2.requestBook();

        adult1.registerAccount(); //adult1 is too young to register as adult user
        adult1.requestBook();     //adult1 cannot request a kids book

        adult2.registerAccount();   //adult2 is of age, success on registering as adult user
        adult2.requestBook();       //adult2 is able to check out fiction book
    }
}
