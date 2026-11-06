package ec.edu.uce.pa.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton
public class HistorialService {
    public void registrarPublicacion(String titulo, String autor, double duracion, String correo) {
        System.out.println("Guardando en la base de datos el historial del video:");
        System.out.println(
                "Titulo: " + titulo + " | Autor: " + autor + " | Duracion: " + duracion + " mins | Correo: " + correo);
        System.out.println("Fecha y hora de registro: " + LocalDateTime.now());

    }

}
