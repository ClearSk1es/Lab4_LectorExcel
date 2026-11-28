/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labortatorio.lab4lectorexcel;
import java.util.Comparator;
/**
 *
 * @author Stew
 */
public class ComparadoresAlumno {

    // Carnet ascendente
    public static final Comparator<Alumno> POR_CARNET =
            Comparator.comparing(Alumno::getCarnet);

    // Apellido ascendente. Si hay apellidos iguales se desempata por nombre
    public static final Comparator<Alumno> POR_APELLIDO =
            Comparator.comparing(Alumno::getApellido, String.CASE_INSENSITIVE_ORDER)
                    .thenComparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER);

    // Promedio descendente
    public static final Comparator<Alumno> POR_PROMEDIO_DESC =
            Comparator.comparingDouble(Alumno::getPromedio).reversed();

    private ComparadoresAlumno() {
        // clase de utilidad, no se instancia
    }
}
