
public class PersonaRiesgo extends Persona {
    private String direccion;
    private int edad;
    private String correo;
    private String eps;

    public PersonaRiesgo() {
    }

    public PersonaRiesgo(String direccion, int edad, String correo, String eps) {
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
        this.eps = eps;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
    
    
    
    
    
    
    
}
