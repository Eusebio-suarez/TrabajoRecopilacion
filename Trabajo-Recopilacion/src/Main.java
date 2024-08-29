import edu.misena.TrabajoRecopilacion.model.Cliente;
import edu.misena.TrabajoRecopilacion.model.Factura;
import edu.misena.TrabajoRecopilacion.model.ItemFactura;
import edu.misena.TrabajoRecopilacion.model.Producto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese el código del producto nº " + (i + 1) + ": ");
            producto.setCodigo(s.nextLine());

            System.out.print("Ingrese el nombre del producto: ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(producto, s.nextInt()));

            System.out.println();
            s.nextLine();  // Consumir el salto de línea restante
        }
        System.out.println(factura);
    }
}

