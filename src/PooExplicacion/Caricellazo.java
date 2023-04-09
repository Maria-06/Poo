package Poo;

import java.util.Random;
import java.util.Scanner;

public class Caricellazo implements Juego {

    //atributos
    private int moneda;
    private String jugador;
    private int eleccion;

    //instanciar objeto
    Scanner leer=new Scanner(System.in);

    public void iniciar() {
        //solicitar datos
        System.out.println("Ingrese el nombre del jugador");
        jugador=leer.next();
    }

    public void jugar() {
        System.out.println(jugador+" Eliga su eleccion \n1.Cara  \n2.Sello");
        eleccion=leer.nextInt();

        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("Moneda Girando");
    }

    public void finalizar() {
        if(moneda==1 && eleccion==1){
            System.out.println("Salió Cara, Ganaste " +jugador);
        }else if(moneda==2 && eleccion==2){
            System.out.println("Salió Sello, Ganaste "+jugador);
        }else if(moneda==1 && eleccion==2){
            System.out.println("Salió Cara, Perdiste "+jugador);
        }else if(moneda==2 && eleccion==1){
            System.out.println("Salió Sello, Perdiste"+jugador);
        }
    }
    
}
