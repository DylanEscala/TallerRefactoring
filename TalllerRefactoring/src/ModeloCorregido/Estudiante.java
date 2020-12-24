package ModeloCorregido;

import java.util.ArrayList;

import modelos.Paralelo;

public class Estudiante extends Persona {

    public String matricula;

    public Estudiante(String nombre, String apellido, int edad, String direccion, String telefono, String facultad, String matricula) {
        super(nombre, apellido, edad, direccion, telefono, facultad);
        this.matricula = matricula;
    }

    public double CalcularNota(Paralelo p, Nota notas) {
        double nota = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                double notaTeorico = (notas.getNexamen() + notas.getNdeberes() + notas.getNlecciones()) * 0.80;
                double notaPractico = (notas.getNtalleres()) * 0.20;
                nota = notaTeorico + notaPractico;
            }
        }
        return nota;
    }

    public double CalcularNotaTotal(Paralelo p) {
        double notaTotal = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;

            }
        }
        return notaTotal;

    }
}
