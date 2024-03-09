package project;

import project.Controller.EmployeeController;
import project.Model.Employee;
import project.Model.EmployeeDAO;
import project.Model.EmployeeDAOImpl;
import project.View.EmployeeView;

public class EntryPoint {
    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAOImpl();
        EmployeeController controller = new EmployeeController(dao, new EmployeeView());

        // Crear algunos empleados y agregarlos a la base de datos
        controller.createEmployee("John Doe", "E1001", "IT");
        controller.createEmployee("Jane Smith", "E1002", "HR");

        // Mostrar los detalles de todos los empleados
        System.out.println("Detalles de todos los empleados:");
        for (Employee employee : controller.getAllEmployees()) {
            controller.displayEmployeeDetails(employee);
        }

        // Obtener un empleado por ID y mostrar sus detalles
        Employee employeeToUpdate = controller.getEmployeeById("E1001");
        if (employeeToUpdate != null) {
            System.out.println("\nDetalles del empleado con ID E1001 antes de la actualización:");
            controller.displayEmployeeDetails(employeeToUpdate);

            // Actualizar el empleado
            employeeToUpdate.setName("John Doe (Updated)");
            employeeToUpdate.setDepartment("Finance");
            controller.updateEmployee(employeeToUpdate);

            System.out.println("\nDetalles del empleado con ID E1001 después de la actualización:");
            controller.displayEmployeeDetails(controller.getEmployeeById("E1001"));
        }

        // Eliminar un empleado y mostrar los detalles actualizados
        controller.deleteEmployee("E1002");
        System.out.println("\nDetalles de todos los empleados después de eliminar el empleado con ID E1002:");
        for (Employee employee : controller.getAllEmployees()) {
            controller.displayEmployeeDetails(employee);
        }
    }
}

