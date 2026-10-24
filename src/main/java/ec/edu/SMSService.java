package ec.edu;

import ec.edu.uce.pa.paquete.Notificacion;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
@Singleton
@Named("sms") 
public class SMSService implements Notificacion {
private String nombre;
	@Override
	public void enviar(String destino, String mensaje) {
        System.out.println("Enviando SMS a: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("SMS enviado con exito");
        System.out.println("Fin del envio del correo");
    }
    @Override 
    public Integer getCantidad() {
        return null;
    }
    @Override 
    public void setCantidad(Integer cantidad) {
      //  this.cantidad = cantidad;
    }
      @Override 
    public String getNombre() {
        return null;
    }
 @Override 
    public void setNombre(String nombre) {
        //this.nombre = nombre;
    }

}
