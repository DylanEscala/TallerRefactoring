
package ModeloCorregido;

import java.util.ArrayList;
import modelos.Ayudante;

public class Paralelo {
    public int numero;
    public modelos.Materia materia;
    public modelos.Profesor profesor;
    public ArrayList<modelos.Estudiante> estudiantes;
    public Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public modelos.Materia getMateria() {
        return materia;
    }

    public void setMateria(modelos.Materia materia) {
        this.materia = materia;
    }

    public modelos.Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(modelos.Profesor profesor) {
        this.profesor = profesor;
    }
    
}
