package ModeloCorregido;

import java.util.ArrayList;


public class Ayudante extends ModeloCorregido.Estudiante{
    public ArrayList<Paralelo> paralelos;

    Ayudante(String nombre, String apellido, int edad, String direccion, String telefono, String facultad, String matricula){
    	super(nombre, apellido, edad, direccion, telefono, facultad,matricula);
    }

    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
