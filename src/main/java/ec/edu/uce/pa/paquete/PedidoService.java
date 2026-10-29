package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped // delega el control al contenedor Arc
// @RequestScoped //apps web
// @Singleton
public class PedidoService {

    @Auditoria
    public String realizar(Pedido pedido, String valor1) {
        System.out.println("\nRealizando pedido...");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        return "Pedido realizado con éxito.";

    }
}