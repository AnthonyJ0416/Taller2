package ec.edu.uce.pa.tarea3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {

    @Inject
    private Auditoria auditoria;

    @Inject
    @Named("regular")
    private CalculadoraDescuento descuentoRegular;

    private final CalculadoraDescuento descuentoVIP;

    @Inject
    public VentaService(@Named("vip") CalculadoraDescuento descuentoVIP) {
        this.descuentoVIP = descuentoVIP;
    }
/* 
    public void realizarVenta(Venta venta) {
        System.out.println("Realizando Venta....");
        System.out.println("Fecha: " + venta.getFecha());
        System.out.println("Cliente: " + venta.getCliente().toString());
        System.out.println("Cant. de productos: " + venta.getCantidadProductos());
        System.out.println("Valor Total  Productos : $" + venta.getMontoTotal());
        double descuento = 0;
        if (venta.getCliente().getTipo() == TipoCliente.REGULAR) {
            descuento = this.descuentoRegular.calcular(venta.getMontoTotal());
        } else if (venta.getCliente().getTipo() == TipoCliente.VIP) {
            descuento = this.descuentoVIP.calcular(venta.getMontoTotal());
        }
        System.out.println("Descuento de tipo: " + venta.getCliente().getTipo().toString());
        System.out.println("Valor A Pagar: $" + (venta.getMontoTotal() - descuento));

    }
*/
    public void procesarVentas(Venta[] listaVentas) {
    this.auditoria.registrar("Iniciando procesamiento de lote de ventas.");

    System.out.println("\nNro   Tipo       Monto     Descuento   Total");
    System.out.println("----------------------------------------------");

    for (int i = 0; i < listaVentas.length; i++) {
        Venta venta = listaVentas[i];
        double descuento = 0.0;
        String descTexto = "0%";

        if (venta.getCliente().getTipo() == TipoCliente.REGULAR) {
            descuento = this.descuentoRegular.calcular(venta.getMontoTotal());
            descTexto = "5%";
        } else if (venta.getCliente().getTipo() == TipoCliente.VIP) {
            descuento = this.descuentoVIP.calcular(venta.getMontoTotal());
            descTexto = "15%";
        }

        double totalPagar = venta.getMontoTotal() - descuento;

        System.out.printf("%-5d %-10s $%8.2f   %-9s $%8.2f%n", 
                (i + 1), 
                venta.getCliente().getTipo(), 
                venta.getMontoTotal(), 
                descTexto, 
                totalPagar);

        this.auditoria.registrar("Venta " + (i + 1) + " procesada");
    }
}
}
