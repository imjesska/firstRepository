package main.src.dao;

import main.src.models.Employee;

import java.util.List;

public interface IEmployee {

    //c create
    void createEmp(Employee e);

    //r read
    List<Employee> readEmp();
    java.util.List getResultList();

    //u update
    void updateEmployee(Employee e);

    //d delete
    void deleteEmp(Employee e);

    //custom
    Employee findById(int id);
}
