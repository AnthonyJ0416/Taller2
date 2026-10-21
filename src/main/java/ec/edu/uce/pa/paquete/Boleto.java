package ec.edu.uce.pa.paquete;

public class Boleto {
    private String cliente;
    private String pelicula;
    private String horario;
    private String codigoQr;
    private double precio;

    public Boleto(String cliente, String pelicula, String horario, String codigoQr, double precio) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.horario = horario;
        this.codigoQr = codigoQr;
        this.precio = precio;
    }

    public Boleto() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigoQr() {
        return codigoQr;
    }

    public void setCodigoQr(String codigoQr) {
        this.codigoQr = codigoQr;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}