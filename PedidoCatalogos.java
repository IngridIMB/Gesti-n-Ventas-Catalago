/**
 * CLASE BASE (Superclase) - Actividad Formativa 3
 */
public class PedidoCatalogos {
    protected String cliente;
    protected String categoria;
    protected double montoOriginal;

    // Constructor de la clase base
    public PedidoCatalogos(String cliente, String categoria, double montoOriginal) {
        this.cliente = cliente;
        this.categoria = categoria;
        this.montoOriginal = montoOriginal;
    }

    // Método para registrar el pago
    public void registrarPago() {
        System.out.println("Pago registrado exitosamente para el cliente: " + cliente);
    }

    // Método para mostrar el resumen del pedido
    public void mostrarResumen() {
        System.out.println("--- Resumen del Pedido ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Categoría: " + categoria);
        System.out.println("Monto Original: $" + montoOriginal);
    }
}