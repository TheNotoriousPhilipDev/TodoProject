El proyecto consistió en la creación de un sistema de gestión de empleados en Java, utilizando el patrón de diseño Modelo-Vista-Controlador (MVC) y el patrón de diseño Data Access Object (DAO).

    Patrón Modelo-Vista-Controlador (MVC):
        El patrón MVC se utilizó para separar claramente la lógica de negocio (modelo), la presentación de datos (vista) y la lógica de control (controlador).
        En este proyecto, la clase Employee representa el modelo, que contiene los datos de un empleado y sus operaciones básicas.
        La clase EmployeeView representa la vista, que se encarga de mostrar los detalles de un empleado en la consola.
        La clase EmployeeController actúa como el controlador, que sirve como intermediario entre el modelo Employee y la vista EmployeeView, gestionando las interacciones y actualizaciones entre ellos.

    Patrón Data Access Object (DAO):
        El patrón DAO se utilizó para abstraer la lógica de acceso a los datos y proporcionar una interfaz uniforme para interactuar con el almacenamiento de datos.
        Se creó la interfaz EmployeeDAO que define métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los objetos Employee.
        La clase EmployeeDAOImpl implementa esta interfaz y proporciona la implementación concreta de cómo interactuar con los datos, en este caso, una colección de empleados en memoria.
        El controlador EmployeeController utiliza la interfaz EmployeeDAO para realizar operaciones CRUD en los empleados, manteniendo así una separación limpia entre la lógica de negocio y la lógica de acceso a los datos.
