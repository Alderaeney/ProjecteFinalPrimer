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
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
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

    public void generarDocumentoFactura() throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Reporte.pdf"));
        document.open();
        añadirMetadata(document);
        añadirTituloPagina(document);
        añadirContenido(document);
        document.close();

    }

    public void añadirMetadata(Document doc) {
        doc.addTitle("Prueba1");
        doc.addSubject("Prueba1");
        doc.addKeywords("Prueba1");
        doc.addAuthor("Prueba1");
        doc.addAuthor("Prueba1");
    }

    public void añadirTituloPagina(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        añadirLineasVacias(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph("Titulo del documento"));

        añadirLineasVacias(preface, 1);
        // Will create: Report generated by: _name, _date
        preface.add(new Paragraph(
                "Factura generada por: " + System.getProperty("user.name") + ", " + new Date()));//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        añadirLineasVacias(preface, 3);
        preface.add(new Paragraph(
                "Este documento imprimirá las lineas de factura! "));

        añadirLineasVacias(preface, 8);

        preface.add(new Paragraph(
                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-)."));

        document.add(preface);
        document.newPage();
    }

    public void añadirContenido(Document document) throws DocumentException {
        Anchor anchor = new Anchor("First Chapter");
        anchor.setName("First Chapter");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Subcategory 1");
        Section subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Hello"));

        subPara = new Paragraph("Subcategory 2");
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("Paragraph 1"));
        subCatPart.add(new Paragraph("Paragraph 2"));
        subCatPart.add(new Paragraph("Paragraph 3"));

        createList(subCatPart);
        Paragraph paragraph = new Paragraph();
        añadirLineasVacias(paragraph, 5);
        subCatPart.add(paragraph);

        //Crear tabla
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        anchor = new Anchor("Second Chapter");
        anchor.setName("Second Chapter");

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        subPara = new Paragraph("Subcategory");
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("This is a very important message"));

        // now add all this to the document
        document.add(catPart);

    }

    public void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(3);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);
        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("1.0");
        table.addCell("1.1");
        table.addCell("1.2");
        table.addCell("2.1");
        table.addCell("2.2");
        table.addCell("2.3");

        subCatPart.add(table);

    }

    public void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("First point"));
        list.add(new ListItem("Second point"));
        list.add(new ListItem("Third point"));
        subCatPart.add(list);
    }

    public void añadirLineasVacias(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    @Override
    public String toString() {
        return this.CIF + "\t" + this.nombre + "\t" + this.direccion + "\t" + this.telefono + "\t" + this.web;
    }

    public static void main(String[] args) {
        Tienda t = new Tienda();
        try {
            t.generarDocumentoFactura();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
