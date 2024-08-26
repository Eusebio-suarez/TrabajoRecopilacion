package edu.misena.TrabajoRecopilacion.model;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    //Constructor
    public ItemFactura( Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public Producto getProducto(Producto producto){
        return producto;
    }

    public void  setProducto(Producto producto){
        this.producto = producto;
    }

    public int getCantidad (int cantidad){
        return cantidad;
    }

    public void setCantidad ( int cantidad){
        this.cantidad = cantidad;
    }
}


