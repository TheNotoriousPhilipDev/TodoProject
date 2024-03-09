package project.Model;

public class Employee {
    private String employeeName;
    private String employeeId;
    private String employeeDepartment;

    // Constructor
    public Employee(String name, String id, String department) {
        this.employeeName = name;
        this.employeeId = id;
        this.employeeDepartment = department;
    }

    // Getters y Setters
    public String getId() {
        return employeeId;
    }

    public void setId(String id) {
        this.employeeId = id;
    }

    public String getName() {
        return employeeName;
    }

    public void setName(String name) {
        this.employeeName = name;
    }

    public String getDepartment() {
        return employeeDepartment;
    }

    public void setDepartment(String department) {
        this.employeeDepartment = department;
    }
}
