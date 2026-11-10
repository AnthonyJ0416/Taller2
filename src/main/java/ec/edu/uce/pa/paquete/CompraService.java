package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extensiones.NotificacionExtension;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class CompraService {
    // se debe recibir una implementacion de la interfaz, solo de esa manera
    // garantizo que si se extiende la funcionalidad el codigo principal no se tope
    public void realizar(Compra compra, NotificacionExtension notificacionExtension) { // por argumento

        System.out.println("Realizando compra...");
        System.out.println("Compra realizado para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Compra realizado con éxito.");

        // aqui voy a programar el envio de la notificacion
        notificacionExtension.enviar("Su pedido ha sido realizado con éxito ", compra.getCliente());
        
    }

}
