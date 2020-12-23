package ModeloCorregido;

import java.util.ArrayList;

public abstract class Persona{
	public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public String facultad;
    public ArrayList<Paralelo> paralelos;

    public Persona(String nombre, String apellido, int edad, String direccion, String telefono, String facultad){
    	this.nombre = nombre;
    	this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.facultad = facultad;
        paralelos = new ArrayList<>();
    }

    //Getter y setter del Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y setter del Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
}