package Retos.Figuras;

public class Cuadrado extends Figura {
    //Atributo
    private int lado;

    //constructor vacio
    public Cuadrado(){
    }

    //constructor con parametros
    public Cuadrado(int lado){
        this.lado = lado;
    }

    //metodo accesor
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    //metodo operacion
    public void calcularArea(){
        int area=0;
        area=lado*lado;
        System.out.println("El lado del cuadrado es: "+lado+" y el area es:"+area);
    }
    
}

