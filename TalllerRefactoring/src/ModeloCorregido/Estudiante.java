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
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                double notaTeorico = (notas.getNexamen() + notas.getNdeberes() + notas.getNlecciones()) * 0.80;
                double notaPractico = (notas.getNtalleres()) * 0.20;
                double nota = notaTeorico + notaPractico;
                return nota;
            }
        }
        return 0;
    }

    public double CalcularNotaTotal(Paralelo p) {
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                double notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;
                return notaTotal;
            }
        }
        return 0;

    }
}
