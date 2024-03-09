package project.Controller;

import project.Model.Employee;
import project.Model.EmployeeDAO;
import project.View.EmployeeView;

import java.util.List;

public class EmployeeController {
    private EmployeeDAO dao;
    private EmployeeView view;

    public EmployeeController(EmployeeDAO dao, EmployeeView view) {
        this.dao = dao;
        this.view = view;
    }

    public void createEmployee(String name, String id, String department) {
        Employee employee = new Employee(name, id, department);
        dao.addEmployee(employee);
    }

    public Employee getEmployeeById(String id) {
        return dao.getEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        dao.updateEmployee(employee);
    }

    public void deleteEmployee(String id) {
        dao.deleteEmployee(id);
    }
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }


    public void displayEmployeeDetails(Employee employee) {
        view.printEmployeeDetails(employee.getName(), employee.getId(), employee.getDepartment());
    }
}
