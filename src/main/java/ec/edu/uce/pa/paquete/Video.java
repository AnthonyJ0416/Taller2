package ec.edu.uce.pa.paquete;

public class Video {
    private String titulo;
    private String autor;
    private double duracionMin;
    private String correoCanal;
    private String resolucion;

    public Video(String titulo, String autor, double duracionMinutos, String correoCanal) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracionMin = duracionMinutos;
        this.correoCanal = correoCanal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracionMinutos() {
        return duracionMin;
    }

    public void setDuracionMinutos(double duracionMinutos) {
        this.duracionMin = duracionMinutos;
    }

    public String getCorreoCanal() {
        return correoCanal;
    }

    public void setCorreoCanal(String correoCanal) {
        this.correoCanal = correoCanal;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

}
