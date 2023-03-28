package salud;

import java.util.Scanner;

public class persona {

    float calcular=0;
   
    private String tipodoc;
    private int doc;
    private String nombre;
    private String apellido;
    private double peso=0;
    private double estatura=0;
    private int edad;
    private String sexo;
    private double masamus=0;

    public persona(String tipodoc, int doc, String nombre, String apellido, double peso, double estatura, int edad, String sexo, double masamus ){

    }
    
   

   public persona() {
    }



public void pedirdatos(){
        Scanner leer=new Scanner(System.in); 

        System.out.print("ingrese su tipo de documento: ");
        tipodoc = leer.next();
        System.out.print("ingrese su documento: ");
        doc = leer.nextInt();
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese su apellido: ");
        apellido = leer.next();
        System.out.print("Ingrese su peso: ");
        peso = leer.nextInt();
        System.out.print("Ingrese su estatura: ");
        estatura = leer.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese su sexo: ");
        sexo = leer.next();
        leer.close();
    }
   /*  public void mostrarpersona(){
        System.out.print("su tipo de documento es: "+ tipodoc);
       
        System.out.print("su documento es: " + doc);
       
        System.out.print("su nombre es: "+ nombre);
     
        System.out.print("su apellido es: " + apellido);
        
        System.out.print("su peso es: "+ peso);
        
        System.out.print("su estatura es: "+ estatura);
       
        System.out.print("su edad es: "+ edad);
        
        System.out.print("su sexo es: "+ sexo);
        
       
}
public void calcularimc(){
    
     masamus= peso/(estatura*estatura);

     System.out.print("su indie de masa coorporal es: "+ masamus + "por ende: ");

     if(masamus<20){
        System.out.print("el peso esta por debajo de lo ideal");
     }
    else if ( masamus>20 && masamus<25){
        System.out.print("el peso esta perfecto");
    }
    else if (masamus>25){
        System.out.print("estas en sobre peso");
    }
    

   
}

public void mayoredad(){
if(edad>18){
    System.out.print("usted es mayor de edad");
}
}
*/

public String getTipodoc() {
        return tipodoc;
    }
    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }
    public int getDoc() {
        return doc;
    }
    public void setDoc(int doc) {
        this.doc = doc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getMasamus() {
        return masamus;
    }
    public void setMasamus(double masamus) {
        this.masamus = masamus;
    }


/*public void solicitud(float peso, float estatura ){
    calcular= peso/(estatura*estatura);
   
}
public void mostrar(){
    if(calcular<20){
        System.out.print("el peso esta por debajo de lo ideal");
     }
    else if ( calcular>20 && calcular<25){
        System.out.print("el peso esta perfecto");
    }
    else if (calcular>25){
        System.out.print("estas en sobre peso");
    }
}
public float getCalcular() {
    return calcular;
}
public void setCalcular(float calcular) {
    this.calcular = calcular;
}*/
}

