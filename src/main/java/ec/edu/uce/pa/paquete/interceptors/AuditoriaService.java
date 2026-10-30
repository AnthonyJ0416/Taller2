package ec.edu.uce.pa.paquete.interceptors;

import java.time.LocalDateTime;

import ec.edu.uce.pa.paquete.Boleto;
import jakarta.inject.Singleton;


@Singleton
public class AuditoriaService {
    public void guardarEnLaBase(Boleto boleto) {
        System.out.println("Guardando en la base de datos de la auditoria:");
        System.out.println("Boleto procesado: "+ boleto.toString());
        System.out.println("Con fecha y hora:" + LocalDateTime.now());
    }
}
