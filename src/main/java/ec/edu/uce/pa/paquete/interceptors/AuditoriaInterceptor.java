package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.Boleto;
import ec.edu.uce.pa.paquete.interceptors.AuditoriaService;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {
    @Inject
    private AuditoriaService auditoriaService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        
        System.out.println("Interceptor de auditoría ejecutándose...");

        Object[] valores = context.getParameters();

        // Extraemos directamente el objeto Boleto que ya tienes creado
        if (valores != null && valores.length > 0 && valores[0] instanceof Boleto) {
            Boleto boleto = (Boleto) valores[0];
            
            // Enviamos el objeto al servicio de auditoría
            this.auditoriaService.guardarEnLaBase(boleto);
        }

        System.out.println("Auditoría finalizada con éxito.");
        return resultado;
    }
}
