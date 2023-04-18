import java.util.Scanner;

public class ejercicioCondicional2 {
     public static void main (String []args){
             Scanner leer=new Scanner(System.in);
        String nombreCliente,nombreProducto = null;
        float sumaTotal=0,valorProducto = 0;
        System.out.println("    COMPRA DEL CLIENTE   ");   
        System.out.println("");        
        System.out.println("Digite su nombre");
        nombreCliente = leer.nextLine();

        System.out.println("Nombre del usuario: "+nombreCliente);
 
        
        for(int i=1;i<=3;i++)
        {
            System.out.println("Digite el nombre del producto #"+i+" a comprar(Para los espacios utilice_)");
            nombreProducto= leer.next();
            System.out.println("Digite el precio del producto");
            valorProducto= leer.nextFloat();
            sumaTotal=sumaTotal+valorProducto;
        }
        if(sumaTotal==100000){
            System.out.println("Felicidades, se gana el mercado, porque el total de su compra es: "+sumaTotal);
        }
        else{
            System.out.println("El total a pagar por su compra es de: "+sumaTotal);
        }
       
        
    }
}

