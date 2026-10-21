package ec.edu.uce.pa.paquete; // Revisa que este package coincida con el tuyo

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        // CREAMOS
        Boleto boleto = new Boleto("Anthony Joseph", "Avengers: Doomsday", "7:00 PM", "QR123456", 12.50);

        // CREAMOS MANUALMENTE EL OBJETO DE LA CLASE BoletoService (Enfoque tradicional)
        BoletoService boletoService = new BoletoService();

        boletoService.reservar(boleto);

        boleto = null; // el obj sea elegible por el garbage collector
        boletoService = null; // el obj sea elegible por el garbage collector

        // Retorno obligatorio para que compile y muestre respuesta en el navegador
        return "Boleto reservado con exito. Revisa la consola de Quarkus.";
    }
}