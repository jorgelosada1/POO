package Figuras;

public class cuadrado extends figura {

    private float lado;

    public cuadrado (float lado ){
        this.lado=lado;
    }
   
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calculararea() {
        float area=0;
        area=lado*lado;
        System.out.println("el lado del cuadrado es: "+lado+" y su area es: "+area);
    }
    
    
}
 