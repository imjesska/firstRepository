package LibraryInterface;

public class KidUsers implements LibraryUser{

    //added 'Class' to instance variable name so I can see visually how constructor parameters are being used
     int ageClass;
     String bookTypeClass;

     //constructors are special methods used to initialize objects
    public KidUsers(int age, String bookType){
           ageClass = age;
           bookTypeClass = bookType;
    }

    /* public is a keyword declaring access to all other classes,
    other classes can modify public fields unless field is declared final
     */

    //output for kid user when age is over/under 12
    public void registerAccount() {
        if(ageClass < 12)
            System.out.println("You have successfully registered under a kids account");
        else
            System.out.println("Sorry, age must be less than 12 to register as a kid");
    }

    //output for kid user when book type is/isn't kids
    public void requestBook() {
        if(bookTypeClass == "Kids")
            System.out.println("Book issued successfully, please return book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");

    }
}
