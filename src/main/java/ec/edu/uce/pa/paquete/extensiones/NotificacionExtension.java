package ec.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

public interface NotificacionExtension {
    void enviar(String mensaje, String destinatario);
}
