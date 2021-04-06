import java.util.Arrays;

public class InClassNotesWeek4 {
    public static void main(String[] args) {

        //finds the length of "Hello World"
        String x = "Hello World";
        for(int i = 0; i<x.length(); i++){ //finds the length of "Hello World", 11,  increments by 1
            System.out.println("index is: " + i + " " + x.toUpperCase().charAt(i)); //capitalizes and prints letter by letter
        }

        int sum = 0;
        int number = 0;

        while (number < 20){
            number++;
            if (number == 10 || number == 11) //when number is 10 or 11 it loops back up to while
                continue;                     //so 10 and 11 get skipped while the sum+= implements for other numbers
            sum += number;
        }

        System.out.println("The sum is " + sum);


        //multiplication table
        for(int i=0; i <= 10; i++){ //runs 10 times
            for(int j=0;j<=10;j++){
                System.out.printf("%d x %d = %d ", i, j, (i*j));
            }
            System.out.println(); //every new line is the end of the outer loop
        }

        /*
        Arrays are reference types,
        array size is fixed, cannot be changed
         */

        String[]example = {"a", "b", "c"}; //initializing values
        String[]exampleTwo = new String[3]; //initializing length of array but no values
        System.out.println(Arrays.toString(exampleTwo)); //will display null

        /*
        BIG-O Notation
        O(1) means in constant time,execute in same time regardless of items
        O(N) means in proportion to the number of items
        O(N squared) is nested for loop
        O(log N)

        Binary Search Performance
        needs to be sorted array
         */

        double[] myList = new double[5];
        for(int i = 0; i<myList.length; i++){
            System.out.printf("%.2f",myList[i]);
            if (i == myList.length-1){  //references the last element in array if last index is unknown
                System.out.println();
            }
        }

        int[]nArray = {4, 12, 15, 34};
        int[]nPArray = nArray.clone();
        Arrays.sort(nPArray);
        System.out.println(nPArray[0]); //min
        System.out.println(nPArray[nPArray.length - 1]); //max
        }

                int[][] matrix2d = {
                        {1,2}, //outer index 0
                        {3,4}, //outer index 1
                        {5,6}, //outer index 2
                        {7,8}, //outer index 3
                };
        //outer loop 0 to 3 row
        for(int i = 0; i < matrix2d.length; i++){
            //inner loop starting at index 0, increment to next number till end
            for(int j = 0; j < matrix2d[i].length; j++){
                System.out.printf("%d ", matrix2d[i][j]);
            }
        }
        System.out.println();

        int[][][] matrix3d = {
                {{1,2,3} , {4,5,6}}, //outer index: 0, inner index: 0, 1, inner-inner: 0, 1, 2
                {{7,8,9} , {10,11,12}}, //outer index: 1, inner index: 0, 1, inner-inner: 0, 1, 2
                {{13,14,15} , {16,17,18}}, //outer index: 2, inner index: 0, 1, inner-inner: 0, 1, 2
                {{19,20,21} , {22,23,24}, {25,26,27}}, //outer index: 3, inner index: 0, 1, 2, inner-inner: 0, 1, 2
        };

        int[] aList = {1,2,3,4,5};
        //copies an array - actual copy
        int[] bList = aList.clone();
        //copies the size of aList
        int[] cList = new int[aList.length];
        //copies an array - reference copy
        int[] dList = aList;
        System.arraycopy(aList,0,dList,0,5); //source, destination, length
        //copies an array -actual copy
        int[] eList = Arrays.copyOf(aList, 10); //copy aList and makes 10 new empty spaces
    }

}