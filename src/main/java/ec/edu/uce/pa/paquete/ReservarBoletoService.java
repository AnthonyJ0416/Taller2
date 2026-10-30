package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class ReservarBoletoService {
    @Inject
    @Named("digital")
    private GenerarBoleto generarBoleto;

    public void reservar(Boleto boleto) {
        System.out.println("Reservando boleto...");
        System.out.println("Boleto reservado para el cliente: " + boleto.getCliente());
        System.out.println("Pelicula: " + boleto.getPelicula());
        System.out.println("Horario: " + boleto.getHorario());
        System.out.println("Asiento: " + boleto.getAsiento());
        System.out.println("Precio: " + boleto.getPrecio());
        System.out.println("Boleto reservado con éxito.");

        String cuerpo = "Estimado " + boleto.getCliente() + ",\n\n" +
                "Su boleto de la película " + boleto.getPelicula() + " por un precio de $" + boleto.getPrecio()
                + " ha sido realizado con éxito.";

        
        this.generarBoleto.generar(boleto);
        
        this.generarBoleto.setCantidad(this.generarBoleto.getCantidad() + 1);

        System.out.println("Cantidad de boletos digitales generados: " + this.generarBoleto.getCantidad());
        
    }
}