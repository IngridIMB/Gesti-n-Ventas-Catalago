public class PedidoCatalogos {
    private String cliente;
    private String categoriaProducto;
    private double montoTotal;
    private boolean pagado;

    public PedidoCatalogos(String cliente, String categoriaProducto, double montoTotal) {
        this.cliente = cliente;
        this.categoriaProducto = categoriaProducto;
        this.montoTotal = montoTotal;
        this.pagado = false;
    }

    public double calcularDescuentoEspecial() {
        if (montoTotal >= 2000) {
            return montoTotal * 0.15;
        } else if (montoTotal >= 1000) {
            return montoTotal * 0.10;
        }
        return 0.0;
    }

    public double obtenerTotalFinal() {
        return montoTotal - calcularDescuentoEspecial();
    }

    public void registrarPago() {
        this.pagado = true;
        System.out.println("-> Pago de $" + obtenerTotalFinal() + " MXN acreditado exitosamente para " + cliente + ".");
    }

    public void mostrarResumen() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Categoría: " + categoriaProducto);
        System.out.println("Monto Original: $" + montoTotal + " MXN");
        System.out.println("Descuento Aplicado: $" + calcularDescuentoEspecial() + " MXN");
        System.out.println("Monto a Cobrar: $" + obtenerTotalFinal() + " MXN");
        System.out.println("Estatus de Pago: " + (pagado ? "PAGADO" : "PENDIENTE"));
        System.out.println("----------------------------------------");
    }
}
