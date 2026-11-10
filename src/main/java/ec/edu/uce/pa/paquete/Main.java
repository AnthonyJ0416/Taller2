package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.extensiones.NotificacionExtensionMail;
import ec.edu.uce.pa.paquete.extensiones.NotificacionExtensionSMS;
import ec.edu.uce.pa.paquete.extensiones.NotificacionExtensionWhatsapp;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private CompraService compraService;
    @Inject
    private NotificacionExtensionMail notificacionExtensionMail;
    @Inject
    private NotificacionExtensionSMS notificacionExtensionSMS;
    @Inject
    private NotificacionExtensionWhatsapp extensionWhatsapp;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nINICIANDO APP QUARKUS\n");
        Compra compra1 = new Compra("Anthony Joseph", "Laptop", 1500.00, "juan.perez@example.com");
        Compra compra2 = new Compra("Gladys Consuelo", "Laptop", 1000.00, "juan.perez@example.com");
        Compra compra3 = new Compra("Santiago Guañuna", "Laptop", 1000.00, "juan.perez@example.com");

        compraService.realizar(compra1, notificacionExtensionMail);
        System.out.println("");
        compraService.realizar(compra2, notificacionExtensionSMS);
        System.out.println("");
        compraService.realizar(compra3, extensionWhatsapp);
        return 0;
    }

}