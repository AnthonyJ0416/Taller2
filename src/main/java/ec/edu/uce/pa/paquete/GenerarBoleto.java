package ec.edu.uce.pa.paquete;

public interface GenerarBoleto {
    public void generar(Boleto boleto);

     public Integer getCantidad();

    public void setCantidad(Integer cantidad);

    public String getNombre();

    public void setNombre(String nombre);
}
