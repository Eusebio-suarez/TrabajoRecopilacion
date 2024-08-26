package edu.misena.TrabajoRecopilacion.model;

import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;

    //Constructor

    //Getter y Setters
    public int getFolio(int folio){
        return folio;
    }

    public void setFolio(int folio){
        this.folio = folio;
    }

    public String getDescripcion(String descripcion){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Date getFecha(Date fecha){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha= fecha;
    }

    public Cliente getCliente(Cliente cliente){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public ItemFactura[] getItems(ItemFactura[] items){
        return items;
    }

    public void  setItems(ItemFactura[] items){
        this.items = items;
    }
}
