var d = new Date();
console.log(d);  //default date is displayed year-month-day-hour-min-sec-milliseconds

let first = new Date('January 1, 2019 04:30:00')
let second = new Date('2019-01-01T04:30:00')
console.log(first)
console.log(first.getTime()===second.getTime())
console.log(second.getHours())


var input = prompt('Enter a range (number number):');   //first and last number need a space in between
var range = input.split(" ");   //separates the two elements in array
var guess = (Math.floor(Math.random() * (Number(range[1]) - Number(range[0]))  + Number(range[0]) ))
var stopper = 0;
var userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}` );  //need to use backwards tick (tilda on keyboard)
while(stopper <= 5){
    stopper++;
    if(guess == userGuess){
    alert("You got it: " + userGuess);
    break;
}
userGuess = prompt(`Keep guessing a number between ${range[0]} and ${range[1]}`)
}
if(guess != userGuess){
    alert("Sorry, the answer was " + guess);
}


