package Figuras;

public class triangulo extends figura {

    private float base;
    private float altura;

    
    public triangulo (float base, float altura ){
        this.base=base;
        this.altura=altura;
    }
   
    
    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public void calculararea() {
        float area=0;
        area=(base*altura)/2;
        System.out.println("el area de su triangulo es: "+area);
    }
    
    
}
 