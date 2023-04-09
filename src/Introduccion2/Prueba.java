package Introduccion2;

import Introduccion.Animal;

public class Prueba {
    public static void main(String[] args) {
    
        Animal animal=new Animal(null, 0, null);

    animal.registrarAnimal();
     //asignar dato SET
    animal.setEdad(3);
    //consultar dato GET
    System.out.println("El nombre del animal es: "+animal.getNombre());
    System.out.println("La edad es: "+animal.getEdad());
    System.out.println("La raza es: "+animal.getRaza());
    animal.mostrarAnimal();
    }
}
