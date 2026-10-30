package ec.edu.uce.pa.paquete;

public class Boleto {
    private int id;
    private String cliente;
    private String pelicula;
    private String horario;
    private String asiento;
    private double precio;

    public Boleto(int id, String cliente, String pelicula, String horario, String asiento, double precio) {
        this.id = id;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.horario = horario;
        this.asiento = asiento;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Boleto [id=" + id + ", cliente=" + cliente + ", pelicula=" + pelicula + ", horario=" + horario
                + ", asiento=" + asiento + ", precio=" + precio + "]";
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

}