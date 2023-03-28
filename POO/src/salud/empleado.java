package salud;

public class empleado extends persona {
    private String cargo;
    private int valorhora=0, horastrabajadas=0, ganancias=0;
    

    public empleado(String tipodoc, int doc, String nombre, String apellido, String cargo, int horastrabajadas, int valorhora){
        super(tipodoc, doc, nombre, apellido, valorhora, doc, horastrabajadas, cargo, valorhora);
this.cargo=cargo;
this.valorhora=valorhora;
this.horastrabajadas=horastrabajadas;
this.ganancias=ganancias;
    }
    public void mostarempleado(){
        System.out.println("el nombre del empleado es: "+ getNombre()+" su apellido es: "+ getApellido()+" su cargo es: " +cargo+" su tipo de documento es: "+ getTipodoc()+ 
        " su numero de documento es: "+ getDoc()+ " las horas que trabaja son: "+ horastrabajadas + " el valor por hora es: "+ valorhora);
    } 

    public void calcularhonorarios(){
ganancias=(valorhora*horastrabajadas);
System.out.println("sus ganancias son de: "+ganancias);
    }
}
