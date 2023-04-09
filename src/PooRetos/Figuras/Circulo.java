package Retos.Figuras;

public class Circulo {
    //atributos
    private double radio;
    private double pi=3.1416;
    
    //Constructor vacio
    public Circulo() {
    }

    //Constructor con parametros
    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }

    //metodos accesores
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    //mretodo operacion
    public void calcularArea(){
        double area=0;
        area= pi*(radio*radio);
        System.out.println("El radio del circulo es : "+radio+" y el area es:"+area);
    }
    
    
}
