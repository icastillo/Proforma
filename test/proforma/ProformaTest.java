/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proforma;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author isaias
 */
public class ProformaTest {

    private ProformaDetalle profromaDetalle1;
    private ProformaDetalle profromaDetalle2;
    private ProformaCabecera proformaCabecera;
    private Producto producto1;
    private Producto producto2;

    @Before
    public void setUp() {

        producto1 = new Producto(304000789, "NTP ISO 14040:1998", "Lima", 680.06, 100);
        producto2 = new Producto(304000855, "ISO/IEC 12207", "Callao", 28.63, 250);

        profromaDetalle1 = new ProformaDetalle(producto1, 1);
        profromaDetalle2 = new ProformaDetalle(producto2, 1);
        proformaCabecera = new ProformaCabecera();
        System.out.println("Productos y detalles de proforma creados ");
    }

    public ProformaTest() {
    }

    @Test
    public void testCompleto() {
        detalleTest1();
        detalleTest2();
        proformaTest();
        clickMostrarProducto();
    }

    public void proformaTest() {
        List<ProformaDetalle> detalles = new ArrayList<ProformaDetalle>();
        //agregando los detalles de proformas
        detalles.add(profromaDetalle1);
        detalles.add(profromaDetalle2);

        //pasando detalles a proforma
        proformaCabecera.setListaProformaDetalles(detalles);
        //calculando total de Proforma, ojo l asignacion es interna
        proformaCabecera.calcularTotalProforma();

        //calculando detraccion
        proformaCabecera.calcularDetraccion();
        assertEquals(836.25, proformaCabecera.getTotalProforma(), 0.25);
        assertEquals(75.26, proformaCabecera.getDetraccion(), 0.26);

    }

    public void detalleTest2() {
        //Calculando el total del arancel
        profromaDetalle2.calculoTotal();
        //calculo del igv
        profromaDetalle2.calculoIGV();
    }

    public void detalleTest1() {
        //Calculando el total del arancel
        profromaDetalle1.calculoTotal();
        //calculo del igv
        profromaDetalle1.calculoIGV();
        assertEquals(122.41, profromaDetalle1.calculoIGV(), 0.41);
        assertEquals(802.47, profromaDetalle1.calculoTotal(), 0.47);
    }

    public void clickMostrarProducto() {
        String mensaje1 = producto1.devolverDatosPrincipales();
        String mensaje2 = producto2.devolverDatosPrincipales();

        System.out.print(mensaje1 + "\n" + mensaje2);
    }
}