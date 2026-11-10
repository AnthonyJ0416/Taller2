package ec.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionMail implements NotificacionExtension {

    @Override
    public void enviar(String mensaje, String destinatario) {
        // TODO Auto-generated method stub
        System.out.println("Enviando correo a : " + destinatario);
        System.out.println("Mensaje:" + mensaje);
        System.out.println("Correo enviado con exito");
    }

}
