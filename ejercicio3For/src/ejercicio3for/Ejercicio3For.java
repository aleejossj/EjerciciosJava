package ejercicio3for;

import java.util.Scanner;

public class Ejercicio3For {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int nPersonas,edad,sumaEdades=0;
        double promedio;
        System.out.println("Digite la cantidad de personas");
        nPersonas=leer.nextInt();
        for(int i=1;i<=nPersonas;i++){
            System.out.println("Digite la edad de la persona #"+i);
            edad=leer.nextInt();
            sumaEdades=sumaEdades+edad;
        }
        promedio=sumaEdades/nPersonas;
        if(promedio>22){
            System.out.println("El promedio de edades es igual a: "+promedio);
        }
    }
    
}
