
/**
 * La clase Empleados representa una lista de empleados.
 * 
 */
public class Empleados {

    /**
     * La lista de empleados.
     */
    private Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     * 
     * @param numEmpleados El número de empleados a gestionar.
     */
    public Empleados(int numEmpleados) {
        this.lista = new Empleado[numEmpleados];
    }

    /**
     * Método para agregar un empleado a la lista.
     * 
     * @param index    El índice en el que se debe agregar el empleado.
     * @param empleado El empleado a agregar.
     */
    public void agregarEmpleado(int index, Empleado empleado) {
        this.lista[index] = empleado;
    }

    /**
     * Método para aumentar el salario de los empleados.
     * 
     * @param porcentaje El porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Método para mostrar la lista de empleados.
     * 
     */
    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
