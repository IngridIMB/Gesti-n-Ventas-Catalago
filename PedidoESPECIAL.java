/**
 * CLASE DERIVADA (Subclase) - Actividad Formativa 3
 * Demuestra el uso de herencia extendiendo de la clase base.
 */
public class PedidoEspecial extends PedidoCatalagos {

    // Atributos únicos de esta subclase
    private double descuentoAdicional;
    private String regaloCatalogo;

    // Constructor que reutiliza el de la clase base con 'super'
    public PedidoEspecial(String cliente, double montoBase, double descuentoAdicional, String regaloCatalogo) {
        super(cliente, montoBase); 
        this.descuentoAdicional = descuentoAdicional;
        this.regaloCatalogo = regaloCatalogo;
    }

    // Método exclusivo de la subclase
    public void mostrarDetalleRegalo() {
        System.out.println("Obsequio exclusivo de catálogo: " + regaloCatalogo);
    }

    // Sobrescritura de método (Override)
    @Override
    public void mostrarResumen() {
        super.mostrarResumen(); 
        System.out.println("Descuento Adicional Aplicado: " + descuentoAdicional + "%");
        System.out.println("Regalo asignado: " + regaloCatalogo);
    }
}