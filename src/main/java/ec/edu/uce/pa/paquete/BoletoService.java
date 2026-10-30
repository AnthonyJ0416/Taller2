package ec.edu.uce.pa.paquete;
import jakarta.inject.Singleton;
//@ApplicationScoped
//@RequestScoped //apps web
@Singleton
public class BoletoService {
    public void crear(Boleto boleto) {
        System.out.println("Creando boleto para el cliente: " + boleto.getCliente());
        System.out.println("Pelicula: " + boleto.getPelicula());
        System.out.println("Horario: " + boleto.getHorario());
        System.out.println("Precio: $" + boleto.getPrecio());
        System.out.println("Boleto creado con éxito.");

    
     
    }

}
