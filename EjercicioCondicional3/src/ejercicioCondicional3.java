import java.util.Scanner;

public class ejercicioCondicional3 {
     public static void main (String []args){
             Scanner leer=new Scanner(System.in);
        String nombreProducto = null;
        float cantProducto,valorProducto;
        double descuento=0,subTotal = 0,total;
        System.out.println("    COMPRA DEL CLIENTE   ");   
        System.out.println("");         
        

            System.out.println("Digite el nombre del producto a comprar(Para los espacios utilice_)");
            nombreProducto= leer.nextLine();
            System.out.println("Digite el precio del producto: ");
            valorProducto=leer.nextFloat();
            System.out.println("Digite la cantidad que quiere comprar de este producto:");
            cantProducto= leer.nextFloat();           
            subTotal=valorProducto*cantProducto;

        if(subTotal>=100000){
            descuento=subTotal*0.25;
            total=subTotal-descuento;
            System.out.println("Total sin descuento: "+subTotal);
            System.out.println("Valor del descuento: "+descuento);
            System.out.println("Total a pagar: "+total);
        }
        else{
            total=subTotal;
            System.out.println("Total sin descuento: "+subTotal);
            System.out.println("Valor del descuento: "+descuento);
            System.out.println("Total a pagar: "+total);
        }
       
        
    }
}
