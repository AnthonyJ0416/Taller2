package ec.edu.uce.pa.paquete;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
//Ambitos y Contextos
//@ApplicationScoped //su ambito es durante toda la app se crea un objeto/isntancia de la clase y se cmprate entre todos los componentes que la utilizan
//@RequestScoped// Su ambito es en aplicaciones web, durante el request/peticion http
//@SessionScoped // su ambito es en aplicaciones web durante la sesion del usuario, es decir se crea una instancia y vive durante la sesion
@Singleton //su ambito es durante toda la app se crea un objeto/isntancia de la clase y se cmprate entre todos los componentes que la utilizan
//@Dependent //su ambtio es durante la inyeccion de dependencias, es decir se crea una intancia y se comprate entro todos los componenten que la utilizan
//
 
@Named("mail")
public class MailService implements Notificacion {
    private Integer cantidad = 0;
    private String nombre;


    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando correo a: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio del correo");
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
