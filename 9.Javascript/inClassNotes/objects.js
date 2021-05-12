
var person ="ABC";
console.log(typeof person);     //String

var person={};
console.log(typeof person);     //Object

var person = {firstName:"Louisa", lastName:"Molin", age:"16"};
console.log(typeof person);     //Object Literal
console.log(person);            //it will print out exactly but alphabetically, age, firstName, lastName

var person={firstName:"Louisa",
            lastName:"Molin",
            age:"16",
            fullName:function(){
                        return this.firstName+ " " +this.lastName;
                 }
             };

             //still the same object
            var newPerson = person;
            console.log(newPerson.firstName);   //Louisa
            newPerson.firstName="Vicki"
            console.log(newPerson.firstName);   //Vicki


var obj = new Object();
obj.firstName = "David";    //adding property to object
obj.state = "Pitts";
//delete object1.firstName;     
console.log(obj);            

var object2 = {firstName:"David"};
console.log(object2);

//Object.values() to convert JS objects to arrays
var arr=Object.values(obj);
console.log(arr);

//Print using for loop
var o1="";
for(i in obj){
    o1 += " ";
    o1 += obj[i];
    console.log(o1);
}

//constructor function
function Car(model, make, color, year){
    this.model = model;
    this.make = make;
    this.color = color;
    this.year = year;
}
  
var car1 = new Car("BMW","M3","gold",2006);
var car2 = new Car("Audi","Q3","gray",2021);
console.log(car1);
console.log(car2);

//add property
car1.bodyStyle = "coupe";
console.log(car1);      //bodyStyle coupe is only applied to car 1
console.log(car2);


