
public class Persona {

    private String documento;
    private String nombre;
    private String celular;
    private float temperatura;
    private String sintomas;
    private String riesgo;

    public Persona() {
    }

    public Persona(String documento, String nombre, String celular, float temperatura, String sintomas, String riesgo) {
        this.documento = documento;
        this.nombre = nombre;
        this.celular = celular;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.riesgo = riesgo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

}
