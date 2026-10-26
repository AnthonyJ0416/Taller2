package ec.edu.uce.pa.tarea3;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String email;
    private TipoCliente tipo;

    public Cliente(int idCliente, String nombre, String email, TipoCliente tipo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", tipo=" + tipo + "]";
    }

    

}
