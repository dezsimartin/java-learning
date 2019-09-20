package hu.flowacademy.employee;


import java.util.ArrayList;
import java.util.List;

public class Employer {
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
