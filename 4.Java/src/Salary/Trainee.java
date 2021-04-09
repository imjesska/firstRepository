package Salary;

import java.text.NumberFormat;

public class Trainee extends Employee{

    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
        System.out.println("Trainee salary is: " +  NumberFormat.getCurrencyInstance().format(salary));
    }
        /* Since trainee transport allowance is the default there's no need for override?
        But I'll include it since the instructions mentioned having one
        and a output line specifically for trainee
         */
        @Override
        void calculateTransportAllowance(){
            double transportAllowance = 10/100.0 * basicSalary;
            System.out.println("Trainee transport allowance is: " +  NumberFormat.getCurrencyInstance().format(transportAllowance));
        }
}
