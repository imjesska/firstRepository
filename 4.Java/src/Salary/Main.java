package Salary;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        Trainee trainee1 = new Trainee(239846, "Jack", "Mumbia India", 442085, 45000);

        manager1.calculateSalary();
        manager1.calculateTransportAllowance();

        trainee1.calculateSalary();
        trainee1.calculateTransportAllowance();
    }
}
