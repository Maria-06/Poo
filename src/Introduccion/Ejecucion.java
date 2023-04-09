package Introduccion;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //parametros de metodos de SUMA
//       int num1,num2,resultado;
    /*  instancia de la clase ANIMAL
        //Animal nomObj=new Animal();
        //invocar metodo
        nomObj.registrarAnimal();
    */
   
//        Suma sumaObj=new Suma();
     /* 
        //invocar metodos
        suma.pedirNumeros();
        suma.sumar();
        suma.restar();
        suma.mostrarResultado();
    */
    
        //Traer metodos de la clase Suma con parámetros
        /*Scanner leer=new Scanner(System.in);
        System.out.println("Por favor, ingresar el primer numero");
        num1=leer.nextInt();
        System.out.println("Por favor, ingresar el segundo  numero");
        num2=leer.nextInt();
        //invocan Argumentos
        sumaObj.sumar(num1, num2);
        sumaObj.restar(num1, num2);
       sumaObj.mostrarResultado();*/

        //invocar metodo con retorno y argumentos
        /*sumaObj.restar(num1, num2);
        resultado=sumaObj.restar(num1, num2);
        System.out.println("El resultado de la resta es:"+resultado);*/

        //Incvocar atributos de otra clase del mismo paquete
       
        //agregar parametros cuando hay constructor
        //Animal animalObj=new Animal("kira",15,"perro");
        String nombre,raza;
        int edad,envergadura;

        //invocar metodo sobrecarga
        //animalObj.registrarAnimal();
        Scanner leer=new Scanner(System.in);

       System.out.println("Por favor, Digite el nombre del Animal");
        nombre=leer.next();
        System.out.println("Por favor, Digite la edad del Animal");
        edad=leer.nextInt();
        System.out.println("Por favor, Digite la raza del Animal");
        raza=leer.next();
        System.out.println("Por favor, Digite la evergadura del Animal");
        envergadura=leer.nextInt();

        //crear objeto de subclase Ave =herencia
        Ave ave=new Ave(nombre, edad, raza, envergadura);
        ave.mostrarAnimal();
        ave.mostrarAve();


        /*Animal animal=new Animal();
       //animal.mostrarAnimal(nombre,edad,raza);

       animal.registrarAnimal();
       //invocar metodo accesor

        //asignar dato SET
        animal.setEdad(3);

       //consultar dato GET
       System.out.println("El nombre del animal es:"+animal.getNombre());
       System.out.println("La edad es:"+animal.getEdad());
       System.out.println("La raza es:"+animal.getRaza());
        */
        leer.close();
    }
}
