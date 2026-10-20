package ec.edu.uce.pa.paquete;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
//@RequestScoped //apps web
//@Singleton
public class PedidoService {
    @Inject
    private MailService mailService;
    public void realizar(Pedido pedido) {
        System.out.println("Realizando pedido...");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con éxito.");

       
        
        String asunto = "Confirmación de pedido";
        String cuerpo = "Estimado " + pedido.getCliente() + ",\n\n" +
                "Su pedido de " + pedido.getProducto() + " por un total de $" + pedido.getTotal()
                + " ha sido realizado con éxito.";

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }
}