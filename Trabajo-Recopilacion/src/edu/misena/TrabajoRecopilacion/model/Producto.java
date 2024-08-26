package edu.misena.TrabajoRecopilacion.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    //Constructor
    private static int ultimoCodigo = 0;

    public Producto(String nombre, double precio) {
        this.codigo = "P" + (++ultimoCodigo);
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter y Setters
    public String getCodigo(String codigo){
        return  codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNombre(String nombre){
        return nombre;
    }

    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(double precio){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    // metodo para mostrar informacion
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
