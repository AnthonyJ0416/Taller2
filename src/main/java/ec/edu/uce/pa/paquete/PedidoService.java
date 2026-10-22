package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@ApplicationScoped // delega el control al contenedor Arc
// @RequestScoped //apps web
// @Singleton
public class PedidoService {
    /*
     * //INYECCION POR ATRIBUTO
     * 
     * @Inject
     * private MailService mailService;
     * 
     */

   //  private MailService mailService;
    /*
     * // INYECCION DE DEPENDENCIAS POR CONSTRUCTOR
     * 
     * public PedidoService(MailService mailService) {
     * 
     * this.mailService = mailService;
     * 
     * }
     */
/* 
    // INYECCION DE DEPENDENCIA POR SETTER
    private MailService mailService;
    @Inject
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
*/
    public void realizar(Pedido pedido) {
        //lookup de la clase MailService
        MailService  mailService = CDI.current().select(MailService.class).get();
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

        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }
}