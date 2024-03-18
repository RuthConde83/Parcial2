import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.agregarEmpleado(0, new Empleado("Juan", "Desarrollador", 50000));
        empleados.agregarEmpleado(1, new Empleado("María", "Diseñadora", 45000));
        empleados.agregarEmpleado(2, new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}