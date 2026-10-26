package ec.edu.uce.pa.tarea3;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nINICIANDO APP QUARKUS\n");
        Cliente cliente01 = new Cliente(1, "Anthony Joseph", "ajguanunac@uce.edu.ec", TipoCliente.REGULAR);
        Cliente cliente02 = new Cliente(1, "Pepe Rodriguez", "pepeRodri@uce.edu.ec", TipoCliente.VIP);
        Cliente cliente03 = new Cliente(1, "Gladys Chorlango", "gcchorlangoi@uce.edu.ec", TipoCliente.REGULAR);
        Cliente cliente04 = new Cliente(1, "Elian Narvaze", "narvaezE@uce.edu.ec", TipoCliente.VIP);
        Venta[] listaVentas = new Venta[4];
        Venta venta01 = new Venta(cliente01, "25-10-2026", 27, 100);
        Venta venta02 = new Venta(cliente02, "25-10-2026", 10, 200);
        Venta venta03 = new Venta(cliente03, "25-10-2026", 55, 300);
        Venta venta04 = new Venta(cliente04, "25-10-2026", 15, 500);

        listaVentas[0] = venta01;
        listaVentas[1] = venta02;
        listaVentas[2] = venta03;
        listaVentas[3] = venta04;

        this.ventaService.procesarVentas(listaVentas);
        return 0;
    }

}