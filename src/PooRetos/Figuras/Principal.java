package Retos.Figuras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Atributos de subclase 
        int lado,radio;
        float base,altura, baseTri, alturaTri;
        double pi=3.1416;

        Scanner leer=new Scanner(System.in);
        System.out.println("Area del Cuadrado");
        System.out.println("Ingrese el lado del cuadrado");
        lado=leer.nextInt();

        //instanciar objeto de subclase
        Cuadrado cuadrado=new Cuadrado(lado);

        cuadrado.calcularArea();
        System.out.println(" ");
        
        System.out.println("Area del Rectangulo ");
        System.out.println("Ingrese la base del rectangulo ");
        base=leer.nextFloat();
        System.out.println("Ingrese la altura del rectangulo ");
        altura=leer.nextFloat();
        
        //instanciar el objeto de la subclase
        Rectangulo rectangulo=new Rectangulo(base,altura);
        rectangulo.calcularArea();
        System.out.println(" ");
        
        System.out.println("Area del Triangulo ");
        System.out.println("Ingrese la base del triangulo ");
        baseTri=leer.nextFloat();
        System.out.println("Ingrese la altura del triangulo ");
        alturaTri=leer.nextFloat();
        
        //instanciar el objeto de la subclase
        Triangulo triangulo=new Triangulo(baseTri,alturaTri);
    
        triangulo.calcularArea();
        System.out.println(" ");

        System.out.println("Area del Circulo");
        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextInt();
        
        //instnaciar el objeto de la subclase
        Circulo circulo=new Circulo(radio,pi);

        circulo.calcularArea();
        System.out.println(" ");

        leer.close();
    }
}
