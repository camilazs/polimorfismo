package piliempleo;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected int antiguedad;
    protected String telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int antiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null; 
    }

    public void incrementarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public void cambiarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
        System.out.println("Supervisor: " + (supervisor != null ? supervisor.nombre : "Ninguno"));
    }
}

