/**
 * CLASE PRINCIPAL (Main) - Actividad Formativa 3
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE GESTIÓN DE VENTAS POR CATÁLOGO ---\n");

        // Creamos un objeto de la subclase (PedidoEspecial) usando Herencia
        PedidoEspecial pedidoEspecial1 = new PedidoEspecial("Ingrid Martínez", "Cosméticos", 1200.0, 15.0, "Set de Fragancias María María");

        // Mostramos el resumen (ejecuta el método heredado y el sobrescrito con @Override)
        pedidoEspecial1.mostrarResumen();
        
        System.out.println();
        
        // Ejecutamos el método heredado de la clase base
        pedidoEspecial1.registrarPago();
        
        System.out.println();
        
        // Ejecutamos el método exclusivo de la subclase
        pedidoEspecial1.mostrarDetalleRegalo();
    }
}