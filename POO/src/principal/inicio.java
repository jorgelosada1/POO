package principal;

import java.util.Scanner;

import salud.empleado;
//import salud.persona;

public class inicio{
    public static void main(String[] args) {
      //  float peso=0;
        //float estatura=0;

        String nombre, apellido, cargo, tipodoc;
        int valorhora, horastrabajadas,  doc; 

        Scanner leer=new Scanner(System.in); 

        System.out.print("ingrese su nombre: ");
        nombre = leer.next();

        System.out.print("ingrese su apellido: ");
        apellido = leer.next();

        System.out.print("ingrese su tipo de documento: ");
        tipodoc = leer.next();

        System.out.print("ingrese su numero de documento: ");
        doc = leer.nextInt();

        System.out.print("ingrese su cargo: ");
        cargo = leer.next();

        System.out.print("ingrese su ganancia por hora: ");
        valorhora = leer.nextInt();

        System.out.print("ingrese sus horas trabajadas: ");
        horastrabajadas = leer.nextInt();

        empleado mostrar = new empleado(tipodoc, doc, nombre, apellido, cargo, horastrabajadas, valorhora);
        
        mostrar.mostarempleado();
        mostrar.calcularhonorarios();

        leer.close();

    

        //datos.pedirdatos();
       // datos.setEdad(7);
       /*  System.out.println("su tipo de documento es "+datos.getTipodoc());
        System.out.println("su documento es "+datos.getDoc());
        System.out.println("su nombre es "+datos.getNombre());
        System.out.println("su apellido es "+datos.getApellido());
        System.out.println("su peso es "+datos.getPeso());
        System.out.println("su estatura es "+datos.getEstatura());
        System.out.println("su edad es "+datos.getEdad());
        System.out.println("su sexo es "+datos.getSexo());*/
       // System.out.println("su edad es "+datos.getEdad());
    //persona datos=new persona();
      /*  System.out.print("ingrese su peso: ");
        peso = leer.nextFloat();
        System.out.print("ingrese su estatura: ");
        estatura = leer.nextFloat();
        
   

        datos.solicitud(peso, estatura);
        datos.mostrar();
        datos.pedirdatos();
        datos.mostrarpersona();
        datos.calcularimc();
        datos.mayoredad();*/
    }
    
}
