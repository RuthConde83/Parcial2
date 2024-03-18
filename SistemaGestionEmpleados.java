import java.util.Scanner;

/**
 * La clase SistemaGestionEmpleados es la clase principal que gestiona el
 * sistema de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * El método main es el punto de entrada de la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos.
     */

    public static void main(String[] args) {

        /**
         * Crear un objeto de la clase Empleados y agregar empleados.
         */
        Empleados empleados = new Empleados(3);
        empleados.agregarEmpleado(0, new Empleado("Juan", "Desarrollador", 50000));
        empleados.agregarEmpleado(1, new Empleado("María", "Diseñadora", 45000));
        empleados.agregarEmpleado(2, new Empleado("Pedro", "Gerente", 60000));

        /**
         * Solicitar al usuario el porcentaje de aumento de salario y mostrar la lista
         * de empleados. El porcentaje de aumento de salario es un número real que se
         * lee de la entrada estándar.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        /**
         * Aumentar el salario de los empleados y mostrar la lista de empleados. El
         * método aumentarSalario aumenta el salario de los empleados.
         */
        empleados.aumentarSalario(porcentaje);
        /**
         * Mostrar la lista de empleados. El método mostrarEmpleados imprime la lista de
         * empleados.
         */
        empleados.mostrarEmpleados();

        /**
         * Cerrar el objeto Scanner.
         */
        scanner.close();
    }
}