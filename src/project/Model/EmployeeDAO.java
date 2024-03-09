package project.Model;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employex);
    void deleteEmployee(String id);
}
