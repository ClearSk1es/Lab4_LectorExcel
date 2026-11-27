package labortatorio.lab4lectorexcel;

public class Alumno {

    private String carnet;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private int anioIngreso;

    // Constructor vacío
    public Alumno() {
    }

    // Constructor con todas las propiedades
    public Alumno(String carnet, String nombre, String apellido,
                  int edad, String carrera, double promedio,
                  int anioIngreso) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
        this.anioIngreso = anioIngreso;
    }

    // Getters y setters
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    // Representación 
    @Override
    public String toString() {
        return "Carnet: " + carnet
                + " | Nombre: " + nombre
                + " | Apellido: " + apellido
                + " | Edad: " + edad
                + " | Carrera: " + carrera
                + " | Promedio: " + promedio
                + " | Año de ingreso: " + anioIngreso;
    }
}