package Retos.Principal;

import java.util.Scanner;

import Retos.Salud.Empleado;
import Retos.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        double peso,estatura=0, pesoActual=0, edad;
        String tipoDoc, nombre,apellido,cargo;
        int documento;
        double valorHora=0,horasTrabajadas;

        Scanner leer=new Scanner(System.in);

        //crear objeto de la clase persona
        Persona persona=new Persona();
        /*
        System.out.println("Ingrese su peso");
        peso=leer.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=leer.nextDouble();

        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularPeso(peso, estatura, pesoActual);
        persona.mayorEdad(0);*/
        System.out.println("Ingrese el tipo de documento del Empleado");
        tipoDoc=leer.next();
        System.out.println("Ingrese el numero de documento del Empleado");
        documento=leer.nextInt();
        System.out.println("Ingrese el nombre del Empleado");
        nombre=leer.next();
        System.out.println("Ingrese el apellido del Empleado");
        apellido=leer.next();
        System.out.println("Ingrese el cargo del Empleado");
        cargo=leer.next();
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horasTrabajadas=leer.nextInt();
        System.out.println("Ingrese cuanto cuesta cada hora");
        valorHora=leer.nextDouble();

        Empleado empleado=new Empleado(tipoDoc, documento, nombre, apellido, pesoActual, estatura, documento, apellido, cargo, valorHora, documento, cargo);
        empleado.mostrarEmpleado();
    }
}   
