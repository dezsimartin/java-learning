package hu.flowacademy.employee;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Employer implements Serializable {
    private List<Employee> employeeList;

    public Employer() {
        this.employeeList = new ArrayList<Employee>();
    }

    public Employer(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "employeeList=" + employeeList +
                '}';
    }
}
