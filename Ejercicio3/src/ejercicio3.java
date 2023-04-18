
import java.util.Scanner;


public class ejercicio3 {
    public static void main (String []args){
        Scanner leer=new Scanner(System.in);
        String nombreEstudiante,nombreMateria;
        float nota1,nota2,nota3,promedio;
        System.out.println("    PROMEDIO DEL ESTUDIANTE   ");   
        System.out.println("");        
        System.out.println("Digite el nombre del estudiante");
        nombreEstudiante = leer.nextLine();
        System.out.println("Digite el nombre de la materia");
        nombreMateria = leer.nextLine();
        System.out.println("Digite la primer nota");
        nota1= leer.nextFloat();
        System.out.println("Digite la segunda nota");
        nota2= leer.nextFloat();
        System.out.println("Digite la tercer nota");
        nota3= leer.nextFloat();
        promedio=(nota1+nota2+nota3)/3;
  
        
        System.out.println("    PROMEDIO DEL ESTUDIANTE   ");
        System.out.println("El estudiante "+nombreEstudiante+" con las notas "+nota1+" ,"+nota2+" y "+nota3+" en la materia "+nombreMateria+" obtuvo un promedio de: "+promedio);
    }
}

        