package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private ReservarBoletoService reservarBoletoService;

    public static void main(String[] args){
        Quarkus.run(Main.class, args);
    }
    
    @Override
    public int run(String... args) throws Exception {
        System.out.println("INICIANDO APP QUARKUS");
        Boleto boleto = new Boleto(100000,"Anthony Joseph", "Avengers: Doomsday", "7:00 PM", "QR123456", 12.50);
        this.reservarBoletoService.reservar(boleto);
        return 0;
    }

    
}