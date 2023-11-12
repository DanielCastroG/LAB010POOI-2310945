package LAB010POOI;

public class Paciente {
    private int dni;
    private String nombre;
    private String direccion;
    private double peso;
    private double temperatura;
    private Medico medico;

    
    public Paciente(int dni, String nombre, String direccion, double peso, double temperatura, Medico medico) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
        this.medico = medico;
    }
   

    // Getters y setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    @Override
public String toString() {
    return "Paciente{DNI=" + dni + ", Nombre='" + nombre + '\'' + ", Direccion='" + direccion + '\'' +
            ", Peso=" + peso + ", Temperatura=" + temperatura + '}';
}
}




  
