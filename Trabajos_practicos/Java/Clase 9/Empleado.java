public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    @Override
    public String toString() {
        return "Empleado{idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + ", " + super.toString() + "}";
    }
}