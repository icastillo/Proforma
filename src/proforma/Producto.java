/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proforma;

/**
 *
 * @author isaias
 */
public class Producto {

    private int stock;
    private String ubicacion;
    private String nombre;
    private double precio;
    private int codigo;

    public Producto(int codigo, String nombre, String ubicacion, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.stock = stock;
    }

    public String devolverDatosPrincipales() {
        return "Código: " + this.codigo + "\nDescripción: " + this.nombre + "\nPrecio: " + String.valueOf(this.precio) + "\nStock: " + String.valueOf(this.stock) + "\nUbicación: " + this.ubicacion + "\n";
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
