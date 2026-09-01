/**
 * @author Rogelio Bovell
 * @author Miguel Quiroz
 */
public class Main {

    public static void main(String[] args) {
        double[] notas = {90.0, 85.0, 150.0};
        Estudiante estudiante = new Estudiante("Rogelio Bovell y Miguel Quiroz", notas);

        double promedio = estudiante.calcularPromedio();
        double promedioRedondeado = Math.round(promedio * 100.0) / 100.0;

        System.out.println("=== EVALUACIÓN ACADÉMICA EXPRÉS UTP ===");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Promedio Final: " + promedioRedondeado);

        if (estudiante.estaAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}

