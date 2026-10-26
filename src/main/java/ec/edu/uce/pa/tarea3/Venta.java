package ec.edu.uce.pa.tarea3;

public class Venta {
    private Cliente cliente;
    private String Fecha;
    private int cantidadProductos;
    private double montoTotal;
    public Venta(Cliente cliente, String fecha, int cantidadProductos, double montoTotal) {
        this.cliente = cliente;
        Fecha = fecha;
        this.cantidadProductos = cantidadProductos;
        this.montoTotal = montoTotal;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public int getCantidadProductos() {
        return cantidadProductos;
    }
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    




}
