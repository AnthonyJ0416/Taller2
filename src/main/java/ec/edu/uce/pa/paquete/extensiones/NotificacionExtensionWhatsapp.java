package ec.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionExtensionWhatsapp implements NotificacionExtension {

    @Override
    public void enviar(String mensaje, String destinatario) {
        // TODO Auto-generated method stub
        System.out.println("Enviando WhatsApp a : " + destinatario);
        System.out.println("Mensaje:" + mensaje);
        System.out.println("WhatsApp enviado con exito");
    }

}
