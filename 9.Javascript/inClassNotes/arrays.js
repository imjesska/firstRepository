/*
var array1=[];
console.log(array1);

var array2 = [1,2,3,4,5];
console.log(array2);    //displays (5) and elements in the array

var array3 = [1, 1.1, "string", false];
console.log(array3);    //displays (4) and elements in the array regardless of type

var base = 2;
var array4 = [base, base*2, base%2];
console.log(array4);    //displays (3) and the computed answers 2, 4, 0

var array5=[{firstName: "Stephen", lastName: "Palko", age: 16},{ }];
console.log(array5);    //displays (2) properties of first[0] array  and second [1] empty array

var array6=[1,,3];
console.log(array6);    //displays (3) [1, empty, 3]

var arrtest=[55,66,77,88,99];
arrtest.unshift(1,2);  //unshift method adds to front, total of 7
console.log(arrtest);
console.log(arrtest.pop());    //takes the last one from array
console.log(arrtest.length);   //now is total of 6 in array

var arr=[55,66,77,88,99];
*/

let array = [12,2,100, 4,5,6,88];
console.log(array[1]); //displays 2


array.push("Leah"); //adds Leah's name to end 
console.log(array);

let removeditem=array.pop();  //removes last element of array
console.log(array);     //displays the array with changes
console.log(removeditem);   //displays the last element that was being removed

array.unshift("Kedar"); //adds element to beginning of array
console.log(array);

array.shift();      //takes out first element of array
console.log(array);

array.splice(3,0,20);   //goes to index 3, removes 0 elements, and inserts 20
console.log(array);

array.splice(4,1);      //goes to index of 4 and removes 1 element
console.log(array);

console.log("-----")

console.log(array.slice(0,2));  //takes (start element - end element), doesn't modify original array

//display every element of  the array
for(i = 0; i<array.length; i++){
console.log(array[i]);
}
console.log("----")
//square each element of the array
for(i = 0; i<array.length; i++){
    
    console.log(array[i]*array[i]);
    }

let sortedArray = array.sort((a,b)=> a-b); //goes through every element of array subtracting one from another until it's from least to greatest
console.log(sortedArray);

let stringArray = "I love programming, when it works";
let sa = stringArray.split(", ");   //finds where separator is, stores 2  elements in array
console.log(sa);

let string = [1,2,3];
let reverseString = string.reverse().join();   //reverses the order of elements and makes it a string
console.log(reverseString);  


let alpha =["banana","cherry", "apple", "snow"];
alpha.sort();                       
console.log(alpha);                 //sorts alphabetically
var s = alpha.join(" is good, ");   //joining makes it a string 
console.log(s);                     // every , is a separator that gets replaced with 'is good,'

