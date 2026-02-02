public class Instrumento {
    private String nombre;
    private String autor;
    private boolean validez;
    private int confiabilidad;
    private int clave;
    private int cita;
    private Tipo tipo;
    private Forma forma;

    public Instrumento() {
        this.nombre = "Desconocido";
        this.autor = "Desconocido";
        this.validez = false;
        this.confiabilidad = 0;
        this.clave = 0;
        this.cita = 0;
        this.tipo = Tipo.ESTRES;
        this.forma = Forma.CUESTIONARIO;
    }

    public Instrumento(String nombre, String autor, boolean validez, int confiabilidad, int clave, int cita, Tipo tipo, Forma forma) {
        this.nombre = nombre;
        this.autor = autor;
        this.validez = validez;
        this.confiabilidad = confiabilidad;
        this.clave = clave;
        this.cita = cita;
        this.tipo = tipo;
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Forma getForma() {
        return forma;
    }

    public String getAutor() {
        return autor;
    }

    public int getConfiabilidad() {
        return confiabilidad;
    }

    public int getClave() {
        return clave;
    }

    public int getCita() {
        return cita;
    }

    public boolean isValidado() {
        return validez;
    }

    @Override
    public String toString() {
        return " - Instrumento{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", validez=" + validez +
                ", confiabilidad=" + confiabilidad +
                ", clave=" + clave +
                ", cita=" + cita +
                ", tipo=" + tipo +
                ", forma=" + forma +
                '}';
    }
}