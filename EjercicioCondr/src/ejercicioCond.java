
import java.util.Scanner;

public class ejercicioCond {
  public static void main (String[]args){
      Scanner leer=new Scanner(System.in);
      String nombre;
      int identificacion;
      float nota1,nota2,nota3,nota4,nota5,promedio;
      
      System.out.println("Digite el nombre del estudiante");
      nombre=leer.nextLine();
      System.out.println("Digite el # identificacion del estudiante");
      identificacion=leer.nextInt();
      System.out.println("Digite la nota #1");
      nota1=leer.nextFloat();
      System.out.println("Digite la nota #2");
      nota2=leer.nextFloat();
      System.out.println("Digite la nota #3");
      nota3=leer.nextFloat();
      System.out.println("Digite la nota #4");
      nota4=leer.nextFloat();
      System.out.println("Digite la nota #5");
      nota5=leer.nextFloat();
      
      promedio=(nota1+nota2+nota3+nota4+nota5)/5;
      
      
      if(promedio==9.5 || promedio==10){
          System.out.println("El estudiante se gano una beca para la universidad que desee, porque su promedio fue de: "+promedio);                  
      }
      else{
          System.out.println("El estudiante es cancelado, porque su promedio es de: "+promedio);
      
      
      }
          
  }
}
