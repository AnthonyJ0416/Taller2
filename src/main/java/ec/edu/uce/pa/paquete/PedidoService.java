package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // delega el control al contenedor Arc
// @RequestScoped //apps web
// @Singleton
public class PedidoService {

    @Auditoria
    public String realizar(Pedido pedido, String valor1) {

        Long init = System.currentTimeMillis();
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }
        System.out.println("\nRealizando pedido...");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        Long fin = System.currentTimeMillis() - init;

        return "\nPedido realizado con éxito en el tiempo de " + fin + " milisegundos\n";

    }
}