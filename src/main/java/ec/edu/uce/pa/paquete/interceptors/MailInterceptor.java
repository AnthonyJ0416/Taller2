package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Mail
@Interceptor
@Priority(Interceptor.Priority.APPLICATION+2)
public class MailInterceptor {
    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {

        Object resultado = context.proceed();
        System.out.println("Retorno" + resultado);

        Parameter[] parametros = context.getMethod().getParameters();

        for (Parameter p : parametros) {
            System.out.println("Parametro: " + p.getName());
        }

        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];

        String cliente = pedido.getCliente();

        System.out.println("[MAIL] ENVIADO CORRECTAMENTE AL CLIENTE " + pedido.getCliente());
        return resultado;


    }
}
