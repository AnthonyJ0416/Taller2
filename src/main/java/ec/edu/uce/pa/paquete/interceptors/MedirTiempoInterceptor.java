package ec.edu.uce.pa.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 3)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Long init = System.currentTimeMillis();
        Object result = context.proceed();
        Long fin = System.currentTimeMillis();
        System.out.println("[Interceptor] el metodo demoro: " + (fin - init) + " ms");
        return result;
    }
}