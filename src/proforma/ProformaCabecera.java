package proforma;

import java.util.Date;
import java.util.List;

public class ProformaCabecera {

    private int nroProforma;
    private Date fechaEmision;
    private String tipoCliente;
    private String numDNIRUC;
    private String nombreRazonSocial;
    private String tipoDocumento;
    private String tipoProforma;
    private List<ProformaDetalle> listaProformaDetalles;
    private double detraccion;
    private double totalProforma;

    public int getNroProforma() {
        return nroProforma;
    }

    public void setNroProforma(int nroProforma) {
        this.nroProforma = nroProforma;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNumDNIRUC() {
        return numDNIRUC;
    }

    public void setNumDNIRUC(String numDNIRUC) {
        this.numDNIRUC = numDNIRUC;
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoProforma() {
        return tipoProforma;
    }

    public void setTipoProforma(String tipoProforma) {
        this.tipoProforma = tipoProforma;
    }

    public double getDetraccion() {
        return detraccion;
    }

    public void setDetraccion(double detraccion) {
        this.detraccion = detraccion;
    }

    public double getTotalProforma() {
        return this.totalProforma;
    }

    public void setTotalProforma(double totalProforma) {
        this.totalProforma = totalProforma;
    }

    public void calcularDetraccion() {
        if (this.totalProforma > 700.00) {
            this.detraccion = totalProforma * 0.09;
        } else {
            this.detraccion = 0.0;
        }
    }

    public void calcularTotalProforma() {

        double totalProformaCabecera = 0.0;
        for (ProformaDetalle d : this.listaProformaDetalles) {
            totalProformaCabecera = totalProformaCabecera + d.calculoTotal();
        }
        this.totalProforma = totalProformaCabecera;
    }

    public List<ProformaDetalle> getListaProformaDetalles() {
        return listaProformaDetalles;
    }

    public void setListaProformaDetalles(List<ProformaDetalle> listaProformaDetalles) {
        this.listaProformaDetalles = listaProformaDetalles;
    }
}
