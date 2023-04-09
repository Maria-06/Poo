package Retos.Salud;

import java.util.Scanner;

public class Persona {
        //Atributos
        private String tipoDoc;
        private int documento;
        private String nombre;
        private String apellido;
        private double peso;
        private double estatura;
        private int edad;
        private String sexo;

        public Persona() {
        }
        
 

        public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
                int edad, String sexo) {
            this.tipoDoc = tipoDoc;
            this.documento = documento;
            this.nombre = nombre;
            this.apellido = apellido;
            this.peso = peso;
            this.estatura = estatura;
            this.edad = edad;
            this.sexo = sexo;
        }

        public String getTipoDoc() {
            return tipoDoc;
        }

        public void setTipoDoc(String tipoDoc) {
            this.tipoDoc = tipoDoc;
        }

        public int getDocumento() {
            return documento;
        }

        public void setDocumento(int documento) {
            this.documento = documento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getEstatura() {
            return estatura;
        }

        public void setEstatura(double estatura) {
            this.estatura = estatura;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        //metodo accesor- valor de retorno- nombre de la clase
        public void pedirDatos(){
            Scanner leer=new Scanner(System.in);
    
            System.out.println("Ingrese el tipo de Documento");
            tipoDoc=leer.next();
    
            System.out.println("Ingrese el documento");
            documento=leer.nextInt();
    
            System.out.println("Ingrese el nombre");
            apellido=leer.next();
    
            System.out.println("Ingrese el apellido");
            apellido=leer.next();
    
            System.out.println("Ingrese el peso");
            peso=leer.nextInt();
            
            System.out.println("Ingrese el estatura");
            estatura=leer.nextInt();
    
            System.out.println("Ingrese el sexo");
            sexo=leer.next();
        }
    
    
        public void mostrarPersona(){
            System.out.println("El tipo de documento de la persona es: "+tipoDoc);
            System.out.println("El numero de documento de la persona es: "+documento);
            System.out.println("El nombre de la persona es: "+nombre);
            System.out.println("El apellido de la persona es: "+apellido);
            System.out.println("El peso de la persona es: "+peso);
            System.out.println("El estatura de la persona es: "+estatura);
            System.out.println("El edad de la persona es: "+edad);
            System.out.println("El sexo de la persona es: "+sexo);
        }

        public double calcularPeso(double peso,double estatura, double pesoActual){
            Scanner leer=new Scanner(System.in);
            pesoActual= peso/estatura*estatura;
            if(pesoActual<20){
                System.out.println("El peso esta por debajo de lo ideal"+pesoActual);
            }else if(pesoActual>=20 && pesoActual<=25){
                System.out.println("El peso es ideal"+pesoActual);
            }else if(pesoActual>25){
                System.out.println("Tiene sobrepeso"+pesoActual);
            }
            return pesoActual; 
        }

        public int mayorEdad( int edad){
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la edad");
            edad=leer.nextInt();
            if(edad>=18){
                System.out.println("Es Mayor de edad "+edad);
            }else{
                System.out.println("Es Menor de edad"+edad);
            }
            return edad;
        }

        
}
