package ec.edu.uce.pa.paquete.interceptors;
import java.lang.reflect.Parameter;
import ec.edu.uce.pa.paquete.Video;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Copyright
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION)
public class CopyrightInterceptor {
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        System.out.println("Retorno: " + resultado);

        Parameter[] parametros = context.getMethod().getParameters();
        for (Parameter p : parametros) {
            System.out.println("Parametro: " + p.getName());
        }

        Object[] valores = context.getParameters();
        Video video = (Video) valores[0];

        System.out.println("[COPYRIGHT] Contenido validado sin infracciones para el video: " + video.getTitulo());
        return resultado;
    }
}
