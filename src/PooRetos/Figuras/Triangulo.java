package Retos.Figuras;

public class Triangulo extends Figura{
    //Atributos
    private  float baseTri;
    private float alturaTri;

    //constructor vacio
    public Triangulo() {
    }

    //constructor con parametros
    public Triangulo(float baseTri, float alturaTri) {
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
    }

    //metodos accesores
    public float getbaseTri() {
        return baseTri;
    }

    public void setbaseTri(float baseTri) {
        this.baseTri = baseTri;
    }

    public float getalturaTri() {
        return alturaTri;
    }

    public void setalturaTri(float alturaTri) {
        this.alturaTri = alturaTri;
    }

    //metodo opeeracion
    public void calcularArea(){
        float area=0;
        area=baseTri*alturaTri/2;
        System.out.println("La base del triangulo es: " +baseTri+" ,la altura  es: "+alturaTri+" el area es: "+area);
    }
    
}
