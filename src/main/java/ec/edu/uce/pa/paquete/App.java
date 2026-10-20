package ec.edu.uce.pa.paquete;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido("Anthony Joseph", "Laptop", 1500.00, "juan.perez@example.com");
        PedidoService pedidoService = new PedidoService();

        pedidoService.realizar(pedido);

        pedido = null;
        pedidoService = null;
    }
}