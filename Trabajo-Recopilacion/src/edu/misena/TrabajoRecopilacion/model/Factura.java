package edu.misena.TrabajoRecopilacion.model;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceActual;

    public static int MAX_ITEMS = 5;

    private static int ultimoFolio = 0;

    //Constructor
    public Factura (String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
        this.indiceActual= 0;
    }

    // Añade los ítems a la factura
    public void addItemFactura(ItemFactura item) {
        // Valida si el índice actual es menor que el máximo permitido
        if (indiceActual< MAX_ITEMS) {
            // Agrega el ítem en el arreglo y aumenta el índice
            this.items[indiceActual++] = item;
        } else {
            // Si se alcanza el límite, muestra un mensaje de advertencia
            System.out.println("No se pueden agregar más ítems, se alcanzó el límite máximo.");
        }
    }
    /**
     * Calcula el importe total de la factura sumando el importe de cada ítem en la lista.
     *
     * @return el importe total de la factura, como un valor de tipo {@code float}.
     * Si la lista de ítems está vacía o todos los ítems son {@code null}, el valor retornado será 0.0.
     */
    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

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

    public static int getIndiceActual(int indiceActual){
        return indiceActual;
    }

    public void setIndiceActual(int indiceActual){
        this.indiceActual = indiceActual;
    }

    // prepara el detalle de la factura
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t\t$\t\tCant.\t\tTotal\n");

        for(ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item)
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}

