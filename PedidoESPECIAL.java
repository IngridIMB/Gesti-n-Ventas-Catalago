/**
 * CLASE DERIVADA (Subclase) - Actividad Formativa 3
 * Demuestra el uso de herencia extendiendo de la clase base.
 */
public class PedidoEspecial extends PedidoCatalogos {

    // Atributos únicos de esta subclase
    private double descuentoAdicional;
    private String regaloCatalogo;

    // Constructor que reutiliza el de la clase base con 'super'
    public PedidoEspecial(String cliente, String categoria, double montoOriginal, double descuentoAdicional, String regaloCatalogo) {
        super(cliente, categoria, montoOriginal); 
        this.descuentoAdicional = descuentoAdicional;
        this.regaloCatalogo = regaloCatalogo;
    }

    // Método exclusivo de la subclase
    public void mostrarDetalleRegalo() {
        System.out.println("Obsequio exclusivo de catálogo: " + regaloCatalogo);
    }

    // Sobrescritura de método (Override) para complementar el resumen original
    @Override
    public void mostrarResumen() {
        super.mostrarResumen(); // Llama al resumen del padre
        System.out.println("Descuento Adicional Aplicado: " + descuentoAdicional + "%");
        System.out.println("Regalo asignado: " + regaloCatalogo);
    }
}
