package Introduccion;

public class Suma {
    //public int num1;
    //public int num2;
    public int suma;
    public int resta;
    //Metodos
    /*public void pedirNumeros(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Por favor, ingresar el primer numero");
        num1=leer.nextInt();
        System.out.println("Por favor, ingresar el segundo  numero");
        num2=leer.nextInt();
    }
    public void sumar(){
        suma=num1+num2;
    }
    public void restar(){
        resta=num1+num2;
    }
    */
    public void mostrarResultado(){
        System.out.println("El resultado del entre el numeros es:"+suma);
        System.out.println("El resultado del entre el numeros es:"+resta);
    }

    //metodos con retorno
    public void sumar(int num1, int num2){
      suma=num1+num2;
    }
    /*public void restar(int num1, int num2){
        resta=num1-num2;
    }*/

    //metodos con retorno->depende metodo a retornar
    public int restar(int num1, int num2){
        resta=num1-num2;
        return resta;
    }
}
