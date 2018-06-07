/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepciones.clienteExistente;
import Excepciones.clienteNoExistente;
import Excepciones.empleadoExistente;
import Excepciones.empleadoNoExistente;
import Excepciones.lineaFacturaExistente;
import Excepciones.productoExistente;
import Excepciones.productoNoExistente;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
//import javax.swing.text.Document;
import com.itextpdf.*;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import static com.itextpdf.text.html.HtmlTags.IMG;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Tienda {

    private String nombre;
    private String direccion;
    private String CIF;
    private String telefono;
    private String web;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Producto> listaProductos = new ArrayList<>();

    public Tienda(String nombre, String direccion, String CIF, String telefono, String web) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.CIF = CIF;
        this.telefono = telefono;
        this.web = web;
    }

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void imprimirClientes() {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            System.out.println(this.listaClientes.get(i).toString());
        }
    }

    public void imprimirEmpleados() {
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            System.out.println(this.listaEmpleados.get(i).toString());
        }
    }

    public void imprimirProductos() {
        for (int i = 0; i < this.listaProductos.size(); i++) {
            System.out.println(this.listaProductos.get(i).toString());
        }
    }

    public Cliente buscarCliente(String dni) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getDni().equalsIgnoreCase(dni)) {
                return this.listaClientes.get(i);
            }
        }
        return null;
    }

    public void añadirCliente(Cliente c) throws clienteExistente {
        if (buscarCliente(c.getDni()) == null) {
            this.listaClientes.add(c);
        } else {
            throw new clienteExistente(c);
        }
    }

    public void eliminarCliente(Cliente c) throws clienteNoExistente {
        if (buscarCliente(c.getDni()) != null) {
            this.listaClientes.remove(c);
        } else {
            throw new clienteNoExistente(c);
        }
    }

    public Empleado buscarEmpleado(int numEmple) {
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            if (this.listaEmpleados.get(i).getNumEmpleado() == numEmple) {
                return this.listaEmpleados.get(i);
            }
        }
        return null;
    }

    public void añadirEmpleado(Empleado e) throws empleadoExistente {
        if (this.buscarEmpleado(e.getNumEmpleado()) == null) {
            this.listaEmpleados.add(e);
        } else {
            throw new empleadoExistente(e);
        }
    }

    public void eliminarEmpleado(Empleado e) throws empleadoNoExistente {
        if (this.buscarEmpleado(e.getNumEmpleado()) != null) {
            this.listaEmpleados.remove(e);
        } else {
            throw new empleadoNoExistente(e);
        }
    }

    public Producto buscarProducto(String codigo) {
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (this.listaProductos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                return this.listaProductos.get(i);
            }
        }
        return null;
    }

    public void añadirProducto(Producto p) throws productoExistente {
        if (this.buscarProducto(p.getCodigo()) == null) {
            this.listaProductos.add(p);
        } else {
            throw new productoExistente(p);
        }
    }

    public void eliminarProducto(Producto p) throws productoNoExistente {
        if (this.buscarProducto(p.getCodigo()) != null) {
            this.listaProductos.remove(p);
        } else {
            throw new productoNoExistente(p);
        }
    }

    public void generarDocumentoFactura(Factura f) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("ReporteSinIMG.pdf"));
        document.open();
        añadirMetadata(document);

        añadirTituloPagina(document, f);
        añadirContenido(document, f);
        document.close();
        añadirImagen(document, new File("ReporteSinIMG.pdf"), new File("ReporteConIMG.pdf"), new File("125.png"));
    }

    public void añadirMetadata(Document doc) {
        doc.addTitle(this.nombre);
        doc.addSubject(this.direccion);
        doc.addKeywords(this.CIF);
        doc.addAuthor(this.telefono);
        doc.addAuthor(this.web);
    }

    public void añadirTituloPagina(Document document, Factura f)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        añadirLineasVacias(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph("Tienda dedicada a la venta de componentes" + this.nombre));
        preface.add(new Paragraph(this.direccion + " " + this.telefono + " "));
        preface.add(new Paragraph(this.web + " " + "Contamos con " + this.listaClientes.size() + " clientes satisfechos"));
        // Will create: Report generated by: _name, _date
        preface.add(new Paragraph(
                "Factura generada por: " + System.getProperty("user.name") + ", " + new Date()));//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        añadirLineasVacias(preface, 1);

        /*preface.add(new Paragraph(
                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-)."));
         */
        document.add(preface);
        //document.newPage();
    }

    public void añadirContenido(Document document, Factura f) throws DocumentException {
        Paragraph preface = new Paragraph();
        añadirLineasVacias(preface, 3);
        boolean primeraVez = true;
        //Crear tabla
        for (int i = 0; i < f.getListaLineas().size(); i++) {
            createTable(preface, primeraVez, f, i);
            primeraVez = false;
        }
        añadirLineasVacias(preface, 2);
        document.add(preface);

        Paragraph preface2 = new Paragraph();
        calcularResultadoYPDF(preface2, f);
        document.add(preface2);
    }

    public void createTable(Paragraph subCatPart, boolean primeraVez, Factura f, int i) throws BadElementException {
        //PdfPTable table = new PdfPTable(3);
        PdfPTable table = new PdfPTable(new float[]{20, 85, 20, 20});
        table.setWidthPercentage(100);
        LineaFactura lf = f.getListaLineas().get(i);
        if (primeraVez == true) {
            PdfPCell c1 = new PdfPCell(new Phrase("Codigo linea"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Producto"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Cantidad"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Coste"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.setHeaderRows(1);
        }
        String codLinea = "" + lf.getCodigoLinea();
        String cantidad = "" + lf.getCantidad();
        String coste = "" + lf.getCoste();
        table.addCell(codLinea);
        table.addCell(lf.getProducto().toString());
        table.addCell(cantidad);
        table.addCell(coste);

        subCatPart.add(table);

    }

    public void añadirLineasVacias(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    public void añadirImagen(Document document, File source, File dest, File img) {
        try {
            PdfReader reader = new PdfReader(source.getAbsolutePath());
            PdfStamper stamer = new PdfStamper(reader, new FileOutputStream(dest.getAbsolutePath()));
            Image image = Image.getInstance(img.getAbsolutePath());
            PdfImage stream = new PdfImage(image, "", null);
            stream.put(new PdfName("ITXT_SpecialId"), new PdfName("123456789"));
            PdfIndirectObject ref = stamer.getWriter().addToBody(stream);
            image.setDirectReference(ref.getIndirectReference());
            image.setAbsolutePosition(450, 700);
            PdfContentByte over = stamer.getOverContent(1);
            over.addImage(image);
            stamer.close();
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calcularResultadoYPDF(Paragraph subCatPart, Factura f) {
        double totalBruto = 0;
        double totalNeto = 0;
        double IVA = 1.21;
        double dtoVolumen = 0.98;
        double descuentos;
        double dtoProntoPago = 0.97;
        for (int i = 0; i < f.getListaLineas().size(); i++) {
            totalBruto += f.getListaLineas().get(i).getCoste();
        }
        if (f.getListaLineas().size() > 10) {
            totalNeto = (totalBruto * dtoProntoPago * dtoVolumen) * IVA;
            descuentos = (totalBruto * 0.02) + (totalBruto * 0.03);
        } else {
            totalNeto = (totalBruto * dtoProntoPago) * IVA;
            descuentos = (totalBruto * 0.03);
        }

        PdfPTable table = new PdfPTable(new float[]{20, 20, 20, 20});
        table.setWidthPercentage(100);

        PdfPCell c1 = new PdfPCell(new Phrase("Importe bruto"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Descuentos"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("IVA"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Importe neto"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        String importeBruto = "" + totalBruto;
        String descuentoStr = "" + descuentos;
        String IVAstr = "" + IVA;
        String importeNeto = "" + totalNeto;
        table.addCell(importeBruto);
        table.addCell(descuentoStr);
        table.addCell(IVAstr);
        table.addCell(importeNeto);
        subCatPart.add(table);
    }

    @Override
    public String toString() {
        return this.CIF + "\t" + this.nombre + "\t" + this.direccion + "\t" + this.telefono + "\t" + this.web;
    }

    public static void main(String[] args) {
        Tienda t = new Tienda("APPSimarret", "DR LUIS ISMARR", "454354", "64656454", "www.google.es");
        Cliente c = new Cliente("pepe", "la calle de pepe", "x5514136r");
        Factura f = new Factura(4343, c, Calendar.getInstance(), 5000, MetodoPago.EFECTIVO);
        Ordenador p = new Ordenador(2, "MSI GL62MVR 7RFX-1271XES Intel Core i5-7300HQ/8GB/1TB/GTX 1060/15.6\"", "534534", 899.0);
        Ordenador p2 = new Ordenador(3, "Nox Hummer MC USB 3.0 Zero Edition Blanca", "34665234", 49.99);
        LineaFactura lf = new LineaFactura(2, p, 3);
        LineaFactura lf2 = new LineaFactura(3, p2, 5);
        try {
            f.añadirLineaAFactura(lf);
            f.añadirLineaAFactura(lf2);
        } catch (lineaFacturaExistente ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t.generarDocumentoFactura(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
