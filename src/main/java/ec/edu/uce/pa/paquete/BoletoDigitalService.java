package ec.edu.uce.pa.paquete;

import java.util.Random;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("digital")
public class BoletoDigitalService implements GenerarBoleto {

    private Integer cantidad = 0;
    private String nombre;

    @Override
    public void generar(Boleto boleto) {
        System.out.println("Generando y enviando al correo del cliente "+boleto.getCliente()+" \nBoleto Digital con id: " + boleto.getId());


        System.out.println(boleto.toString());
        Random random = new Random();
        String codigoQR = "QR" + random.nextInt(1000000);
        System.out.println("Presentar este codigo QR ya sea impreso o digital en la entrada para poder ingresar a la sala");
        System.out.println("Código QR: " + codigoQR);
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
