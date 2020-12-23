package ModeloCorregido;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public int añosdeTrabajo;
    public double bonoFijo;

    public Profesor(String nombre, String apellido, int edad, String direccion, String telefono, String facultad, String cod, int añosdeTrabajo, double bonofijo) {
        super(nombre, apellido, edad, direccion, telefono, facultad);
        this.codigo = cod;
        this.añosdeTrabajo = añosdeTrabajo;
        this.bonoFijo = bonofijo

    }

}