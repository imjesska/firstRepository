package Salary;

import java.text.NumberFormat;

//base class with instance variables
public class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    //overloaded constructor with instance variables
         public Employee(long id, String name, String address, long phone){
            employeeId = id;
            employeeName = name;
            employeeAddress = address;
            employeePhone = phone;
         }

    //method to calculate the salary
        void calculateSalary(){
        double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
         }

    //method to calculate 10% of the salary as transport allowance
        void calculateTransportAllowance(){
        double transportAllowance = 10/100.0 * basicSalary;
            System.out.println("Transport allowance is: " +  NumberFormat.getCurrencyInstance().format(transportAllowance));
        }
}
