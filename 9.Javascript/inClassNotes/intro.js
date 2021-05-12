

var balance = 10000;
var year = 0;
const INTEREST_RATE = 0.05;

while(balance<20000){
year++;
let interest = balance*INTEREST_RATE;
balance += interest;
}console.log(year);

console.log("Even");        //prints out all even numbers up to 100
for(var j = 0; j<=100; j++){

    if( j%2== 0){
    console.log(j);

    }
}
console.log("Odd");         //prints out all odd numbers up to 100
for(var j = 0; j<=100; j++){

    if( j%2!= 0){
    console.log(j);

    }
}

var j = 1;
do{
    let value = j*2;
    j++;
    console.log(value);
}while(j<=5);

var scope = "global";       //all script and functions can be accessed
                
function checkscope(){
    var scope = "local";    //code here can use checkscope
    return scope;
}                           //code here can NOT use checkscope
