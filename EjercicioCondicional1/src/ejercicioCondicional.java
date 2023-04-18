
import java.util.Scanner;

public class ejercicioCondicional {
    public static void main (String []args){
        Scanner leer=new Scanner (System.in);
        String nombreEstudiante;
        float nota1,nota2,nota3,promedio;
        System.out.println("Digite su nombre");
        nombreEstudiante = leer.nextLine();
        System.out.println("Digite la nota #1 del estudiante");
        nota1=leer.nextFloat();
        System.out.println("Digite la nota #2 del estudiante");
        nota2=leer.nextFloat();
        System.out.println("Digite la nota #3 del estudiante");
        nota3=leer.nextFloat();
        promedio=(nota1+nota2+nota3)/3;
        if (promedio>6){
            System.out.println("Felicidades, el estudiante "+nombreEstudiante+" aprobo con la nota: "+promedio);
        }
        else{
            System.out.println("Lo sentimos, el estudiante "+nombreEstudiante+" reprobo con la nota: "+promedio);
        }
    }
}
