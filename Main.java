public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE VENTAS POR CATÁLOGO ===\n");

        PedidoCatalogos pedido1 = new PedidoCatalogos("María López", "Calzado", 2400.0);
        PedidoCatalogos pedido2 = new PedidoCatalogos("Laura Gómez", "Fragancias", 850.0);

        System.out.println("--- Pedidos Registrados ---");
        pedido1.mostrarResumen();
        pedido2.mostrarResumen();

        System.out.println("\n--- Procesamiento de Pagos ---");
        pedido1.registrarPago();

        System.out.println("\n--- Estado Actualizado de Pedidos ---");
        pedido1.mostrarResumen();
        pedido2.mostrarResumen();
    }
}
