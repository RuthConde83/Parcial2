public class Empleados {

    private Empleado[] lista;

    public Empleados(int numEmpleados) {
        this.lista = new Empleado[numEmpleados];
    }

    public void agregarEmpleado(int index, Empleado empleado) {
        this.lista[index] = empleado;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
