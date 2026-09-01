/**
 * @author Rogelio Bovell
 * @author Miguel Quiroz
 */
public class Estudiante {

    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        setNotas(notas);
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0.0 || notas[i] > 100.0) {
                notas[i] = 0.0;
            }
        }
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        return suma / notas.length;
    }

    public boolean estaAprobado() {
        if (calcularPromedio() >= 71.0) {
            return true;
        } else {
            return false;
        }
    }
}
