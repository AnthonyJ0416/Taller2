package ec.edu.uce.pa.paquete;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;
//@ApplicationScoped
//@RequestScoped //apps web
@Singleton
public class BoletoService {
    public void reservar(Boleto boleto) {
        System.out.println("Reservando boleto para el cliente: " + boleto.getCliente());
        System.out.println("Pelicula: " + boleto.getPelicula());
        System.out.println("Horario: " + boleto.getHorario());
        System.out.println("Precio: $" + boleto.getPrecio());
        System.out.println("Boleto reservado con éxito.");

        QRService qrService = new QRService(); //creacion manUal obj clase QRService

        qrService.generarQR(boleto);
        qrService = null; // el obj sea elegible por el garbage collector
    }

}
