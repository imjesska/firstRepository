package main.src.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class Employee {

    //fields
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int eId;
    String eName;
    double eSalary;
    String eDegree;


    public Employee(String eName, double eSalary, String eDegree) {
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDegree = eDegree;
    }

    public int getEId() {
        return eId;
    }

    public String getEName() {
        return eName;
    }

    public double getESalary() {
        return eSalary;
    }

    public String getEDegree() {
        return eDegree;
    }

    public void setEId(int eId) {
        this.eId = eId;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public void setESalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public void setEDegree(String eDegree) {
        this.eDegree = eDegree;
    }
}
