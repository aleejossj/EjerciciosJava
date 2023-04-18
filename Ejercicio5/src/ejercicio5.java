
import java.util.Scanner;

public class ejercicio5 {
     public static void main (String []args){
             Scanner leer=new Scanner(System.in);
        String nombreCliente,nombreProducto = null;
        int cantProductos;
        float sumaTotal=0,valorProducto = 0;
        System.out.println("    COMPRA DEL CLIENTE   ");   
        System.out.println("");        
        System.out.println("Digite su nombre");
        nombreCliente = leer.nextLine();
        System.out.println("Digite la cantidad de productos que quiere comprar");
        cantProductos= leer.nextInt();
        System.out.println("Nombre del usuario: "+nombreCliente);
        System.out.println("Cantidad de compras del usuario: "+cantProductos);
        
        for(int i=1;i<=cantProductos;i++)
        {
            System.out.println("Digite el nombre del producto #"+i+" a comprar(Para los espacios utilice_)");
            nombreProducto= leer.next();
            System.out.println("Digite el precio del producto");
            valorProducto= leer.nextFloat();
            sumaTotal=sumaTotal+valorProducto;
        }
        System.out.println("El total a pagar por su compra es de: "+sumaTotal);
        
    }
}
