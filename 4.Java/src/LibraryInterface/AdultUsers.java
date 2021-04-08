package LibraryInterface;

//interfaces implements whereas extends are with classes
public class AdultUsers implements LibraryUser{

    //added 'Class' to instance variable name so I can see visually how constructor parameters are being used
    int ageClass;
    String bookTypeClass;

    //constructors are special methods used to initialize objects
    public AdultUsers(int age, String bookType){
        ageClass = age;
        bookTypeClass = bookType;
    }

    //output for adult user when age is over/under 12
    public void registerAccount() {
        if(ageClass > 12)
            System.out.println("You have successfully registered under an adult account");
        else
            System.out.println("Sorry, age must be greater than 12 to register as a adult");
    }

    //output for adult user when book type is/isn't fiction
    public void requestBook() {
        if(bookTypeClass == "Fiction")
            System.out.println("Book issued successfully, please return book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");

    }
}


