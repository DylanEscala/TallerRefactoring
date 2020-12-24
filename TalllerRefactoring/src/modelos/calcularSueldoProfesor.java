package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.info.aniosdeTrabajo*600 + prof.info.BonoFijo;
        return sueldo;
    }  
}
