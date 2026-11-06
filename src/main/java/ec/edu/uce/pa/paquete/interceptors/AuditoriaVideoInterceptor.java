package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;
import ec.edu.uce.pa.paquete.HistorialService;
import ec.edu.uce.pa.paquete.Video;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@AuditoriaVideo
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 2)
public class AuditoriaVideoInterceptor {

    @Inject
    private HistorialService historialService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        System.out.println("Retorno: " + resultado);

        String nombreMetodo = context.getMethod().getName();
        System.out.println("[Auditoria]: se esta ejecutando el metodo: " + nombreMetodo);

        Parameter[] parametros = context.getMethod().getParameters();
        for (Parameter p : parametros) {
            System.out.println("Parametro: " + p.getName());
        }

        Object[] valores = context.getParameters();
        Video video = (Video) valores[0];

        this.historialService.registrarPublicacion(
            video.getTitulo(),
            video.getAutor(),
            video.getDuracionMinutos(),
            video.getCorreoCanal()
        );

        System.out.println("Mensaje luego de que se ejecuta el metodo interceptado");
        return resultado;
    }
}