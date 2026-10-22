package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    public static void main(String[] args){
        Quarkus.run(Main.class, args);
    }
    
    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nINICIANDO APP QUARKUS\n");
        Pedido pedido = new Pedido("Anthony Joseph", "Laptop", 1500.00, "juan.perez@example.com");
        pedido.setTelefono("0984110661");
        this.pedidoService.realizar(pedido);
        System.out.println("");
        return 0;
    }

    
}