package Salary;

import java.text.NumberFormat;

public class Manager extends Employee{

    public Manager(long id, String name, String address, long phone, double salary){
        super(id,name,address,phone);
        this.basicSalary = salary;
        System.out.println("Manager salary is: " + NumberFormat.getCurrencyInstance().format(salary));
    }

    @Override  //Managers have a 15% allowance of the basic salary
    void calculateTransportAllowance(){
        double transportAllowance = 15/100.0 * basicSalary;
        System.out.println("Manager transport allowance is: " +  NumberFormat.getCurrencyInstance().format(transportAllowance));
    }

}
