package ModeloCorregido;

import java.util.ArrayList;


public class Ayudante extends ModeloCorregido.Estudiante{
    public ArrayList<Paralelo> paralelos;

    Ayudante(String nombre, String apellido, int edad, String direccion, String telefono, String facultad, String matricula){
    	super(nombre, apellido, edad, direccion, telefono, facultad,matricula);
    }
   
    //Getters y setters se delegan en objeto estudiante para no duplicar código
   
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
