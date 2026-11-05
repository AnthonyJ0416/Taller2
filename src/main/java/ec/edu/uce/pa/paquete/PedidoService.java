package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.Auditoria;
import ec.edu.uce.pa.paquete.interceptors.Mail;
import ec.edu.uce.pa.paquete.interceptors.MedirTiempo;
import ec.edu.uce.pa.paquete.interceptors.Sms;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // delega el control al contenedor Arc
// @RequestScoped //apps web
// @Singleton
public class PedidoService {

    @Auditoria
    @MedirTiempo 
    @Sms 
    @Mail 
    public String realizar(Pedido pedido, String valor1) {

        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }
        System.out.println("\nRealizando pedido...");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        
        return "\nPedido realizado con éxito";

    }
}