package Figuras;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        float lado, base, altura; 
        int seguir=1,opcion;

        Scanner leer=new Scanner(System.in);

        while(seguir==1){

            System.out.println("elije 1 si quires sacar el area del cuadrado, elije 2 si deseas sacarla al rectangulo y elije 3 si prefieres al triangulo ");
            opcion=leer.nextInt();
       
        if(opcion==1){
            System.out.println("ingrese el valor del lado del cuadrado: ");
        lado=leer.nextFloat();
       
        cuadrado c1=new cuadrado(lado);
        c1.calculararea();
    }

        else if (opcion==2) {
            System.out.println("ingrese el valor del alto del rectangulo: ");
            altura=leer.nextFloat();
            System.out.println("ingrese el valor de la base del rectangulo: ");
            base=leer.nextFloat();
           
            rectangulo c1=new rectangulo(base, altura);
            c1.calculararea();
               
        }
        else if (opcion==3) {
            System.out.println("ingrese el valor del alto del triangulo: ");
            altura=leer.nextFloat();
            System.out.println("ingrese el valor de la base del triangulo: ");
            base=leer.nextFloat();
           
            triangulo c1=new triangulo(base, altura);
            c1.calculararea();
               
        }

        
        
        System.out.println("Ingresa 1. si desea volver a intentar y 0 si desea salir");
        seguir=leer.nextInt();
        
    }
   
System.out.println("gracias por utilizar nuestro programa");  
    leer.close();
}
}
