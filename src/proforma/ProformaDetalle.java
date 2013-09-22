package proforma;

public class ProformaDetalle {

    private static final double IGV = 0.18;
    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double dcto;

    public ProformaDetalle(Producto producto, int cantidad) {
        this.codigo = producto.getCodigo();
        this.descripcion = producto.getNombre();
        this.precioUnitario = producto.getPrecio();
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calculoTotal() {
        double total = this.precioUnitario * (this.cantidad + IGV);
        if (total > 500) {
            System.out.print("Se aplico descuento: " + (total - (total * dcto)));
            return (total - (total * dcto));
        } else {
            return this.precioUnitario * (this.cantidad + IGV);
        }
    }

    public double calculoIGV() {
        double _calculoIGV = this.precioUnitario * this.cantidad * IGV;
        //System.out.print(this.precioUnitario +" - "+ this.cantidad  +" - "+ IGV +  " - "+ this.codigo +"\n"+_calculoIGV+"\n");
        return _calculoIGV;
    }
}
