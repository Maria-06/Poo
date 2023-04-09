package Introduccion;

import java.util.Scanner;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private String raza;
    
    //constructor vacio==instanciar objeto
    public Animal(){
    }

    //constructor con parametros
    public Animal(String nombre, int edad, String raza) {
      this.nombre = nombre;
      this.edad = edad;
      this.raza = raza;
    }

    //metodo GET genera valor de retorno=>devolver
    //metood SET consulta 
    //metodos Accesores
    public String getNombre() {
      return nombre;
    }


    public void setNombre(String nombre) {
      this.nombre = nombre;
    }


    public int getEdad() {
      return edad;
    }


    public void setEdad(int edad) {
      this.edad = edad;
    }


    public String getRaza() {
      return raza;
    }


    public void setRaza(String raza) {
      this.raza = raza;
    }

    //Metodos
    public void registrarAnimal(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor, Digite el nombre del Animal");
        nombre=leer.next();
        System.out.println("Por favor, Digite la edad del Animal");
        edad=leer.nextInt();
        System.out.println("Por favor, Digite la raza del Animal");
        raza=leer.next();
        //Invocar METODO de OTRACLASE
        Suma claseSuma=new Suma();
        claseSuma.restar(edad, edad);
      
        leer.close();
    }

    //metodo sin parametros
    public void mostrarAnimal(){
      System.out.println("El nombre del animal es:"+nombre);
      System.out.println("Su edad es:"+edad);
      System.out.println("Su raza es:"+raza);  
    }

    //metodo con parametros=>sobrecarga
    public void mostrarAnimal(String nombre,int edad,String raza){
      System.out.println("El nombre de animal es:"+nombre);
      System.out.println("Su edad es:"+edad);
      System.out.println("Su raza es:"+raza);  
    }

}
