package Retos.Figuras;

public class Rectangulo extends Figura {
    //atributos
    private float base;
    private float altura;

    //constructor vacio
    public Rectangulo(){

    }
    //contructor con parametros
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    //metodos accesores
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

    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("la base del rectangulo es: "+base+" ,su altura es: "+altura+" y el area es:" +area);
    }

    
}

