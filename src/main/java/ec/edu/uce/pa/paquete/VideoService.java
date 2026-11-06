package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.AuditoriaVideo;
import ec.edu.uce.pa.paquete.interceptors.Copyright;
import ec.edu.uce.pa.paquete.interceptors.MedirTiempo;
import ec.edu.uce.pa.paquete.interceptors.NotificarSuscriptores;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VideoService {

    @Copyright
    @NotificarSuscriptores
    @AuditoriaVideo
    @MedirTiempo
    public String publicar(Video video, String categoria) {
        try {
          
            Thread.sleep(1500);//timepo de subida
        } catch (Exception e) {
          
        }

        System.out.println("\nProcesando y publicando video...");
        System.out.println("Titulo: " + video.getTitulo());
        System.out.println("Autor: " + video.getAutor());
        System.out.println("Duracion: " + video.getDuracionMinutos() + " minutos");
        System.out.println("Canal: " + video.getCorreoCanal());
        System.out.println("Categoria: " + categoria);

        return "\nVideo publicado con exito en la plataforma";
    }
}