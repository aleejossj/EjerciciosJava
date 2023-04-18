
import java.util.Scanner;

public class ejercicio4 {
 public static void main (String []args){
             Scanner leer=new Scanner(System.in);
        String nombreTrabajador;
        float horasTrabajadas,valorHora,salario;
        System.out.println("    SALARIO DEL TRABAJADOR   ");   
        System.out.println("");        
        System.out.println("Digite su nombre");
        nombreTrabajador = leer.nextLine();
        System.out.println("Digite el valor de su hora de trabajo");
        valorHora= leer.nextFloat();
        System.out.println("Digite las horas que trabajo en el mes");
        horasTrabajadas= leer.nextFloat();

        salario=horasTrabajadas*valorHora;
  
        
        System.out.println("    SALARIO DEL TRABAJADOR   ");
        System.out.println("El Trabajador "+nombreTrabajador+" con "+horasTrabajadas+" horas trabajadas en el mes, teniendo en cuenta que el valor de su hora trabajada es: "+valorHora+"\nEl salario del trabajador es : "+salario);
 }   
}
