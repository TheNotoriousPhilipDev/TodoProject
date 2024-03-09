package project.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAOImpl implements EmployeeDAO {
    private Map<String, Employee> employees;

    public EmployeeDAOImpl() {
        employees = new HashMap<>();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employees.remove(id);
    }
}
