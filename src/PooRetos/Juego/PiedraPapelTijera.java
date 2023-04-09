package Retos.Juego;

import java.util.Random;
import java.util.Scanner;

import Poo.Juego;

public class PiedraPapelTijera implements Juego {
    //atributos
    private int sistema;
    private String jugador;
    private int eleccion;

    Scanner leer=new Scanner(System.in);

    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=leer.next();
    }
    public void jugar(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Eliga una opcion: 1.Piedra 2.Papel 3.Tijera");
        eleccion=leer.nextInt();

        Random aleatorio=new Random();
        sistema=aleatorio.nextInt(3)+1;
        System.out.println("El sistema ya eligió su opcion");
    }
    public void finalizar(){
        if(sistema==1 && eleccion==1){
            System.out.println("\n"+jugador+" :Salió Piedra, ¡empataste!");
        }else if(sistema==2 && eleccion==2){
            System.out.println("\n"+jugador+" :Salió Papel, ¡empataste!");
        }else if(sistema==3 && eleccion==3){
            System.out.println("\n"+jugador+" :Salió Tijera, ¡empataste!");
        }else if(sistema==1 && eleccion==2){
            System.out.println("\n"+jugador+" :Salió Piedra, ¡perdiste!");
        }else if(sistema==1 && eleccion==3){
            System.out.println("\n"+jugador+" :Salió Piedra, ¡ganaste!");
        }else if(sistema==2 && eleccion==1){
            System.out.println("\n"+jugador+" :Salió Papel, ¡ganaste!");
        }else if(sistema==2 && eleccion==3){
            System.out.println("\n"+jugador+" :Salió Papel, ¡perdiste!");
        }else if(sistema==3 && eleccion==1){
            System.out.println("\n"+jugador+" :Salió Tijera, ¡perdiste!");
        }else if(sistema==3 && eleccion==2){
            System.out.println("\n"+jugador+" :Salió Tijera, ¡ganaste!");
        }
    }
}
