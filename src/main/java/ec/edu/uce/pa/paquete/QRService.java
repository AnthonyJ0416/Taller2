package ec.edu.uce.pa.paquete;

import java.util.Random;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;
//@ApplicationScoped
//@RequestScoped// para apps web
@Singleton
public class QRService {
    public void generarQR(Boleto boleto) {
        System.out.println("Generando código QR para la pelicula: " + boleto.getPelicula());
        Random random = new Random();
        String codigoQR = "QR" + random.nextInt(1000000);
        System.out.println("Código QR: " + codigoQR);
        System.out.println("Código QR generado con éxito.");
        
    }
}
