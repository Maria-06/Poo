package Introduccion;

public class Ave extends Animal {
    //atributo propio
    private int envergadura;

    //constructor de subclase y traer atributos superclase
    //traer atributos de Animal + Ave
    public Ave(String nombre, int edad,String  raza,int envergadura){
        super(nombre,edad,raza);
            this.envergadura=envergadura;
    }

    //metodo propio subclase
    public void mostrarAve(){
        System.out.println("El nombre del animal es: "+getNombre()+" ,su edad es: "+getEdad()+" ,su raza es: "+getRaza()+" y su envergadura es de: "+envergadura);
    }
}
