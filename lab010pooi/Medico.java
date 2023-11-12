package LAB010POOI;

public class Medico {
    private int numeroColegiatura;
    private String nombre;
    private String especialidad;

    public Medico(int numeroColegiatura, String nombre, String especialidad) {
        this.numeroColegiatura = numeroColegiatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(int numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad.trim().toLowerCase();  // Normalizar la especialidad
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
public String toString() {
    return "Numero de Colegiatura: " + numeroColegiatura +
            ", Nombre: " + nombre +
            ", Especialidad: " + especialidad;
}
}

