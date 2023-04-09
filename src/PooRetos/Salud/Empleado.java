package Retos.Salud;

public class Empleado extends Persona {
    //atributo propio
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;


    //constructor de la subclase y atributos de la superclase
    public Empleado(String tipoDoc, int documento, String nombre,String apellido,double peso, double estatura, int edad, String sexo,String cargo, double valorHora,
                    int horasTrabajadas,String departamento){
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo);{
            this.cargo=cargo;
            this.valorHora=valorHora;
            this.horasTrabajadas=horasTrabajadas;
            this.departamento=departamento;
        }     
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public double getValorHora() {
        return valorHora;
    }



    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }



    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }



    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }



    public String getDepartamento() {
        return departamento;
    }



    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public double calcularHonorarios(){
         double reteica=0.00966;
         double subtotal=valorHora*horasTrabajadas;
         double total=subtotal-reteica;
        return total;
    }
    public void mostrarEmpleado(){
        System.out.println("\n"+"Tipo de Documento: "+getTipoDoc());
        System.out.println("Numero de Documento: "+getDocumento());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+cargo);
        System.out.println("Horas Trabajadas: "+horasTrabajadas);
        System.out.println("Valor por Hora: "+valorHora);
        System.out.println("Total a Pagar: "+calcularHonorarios());
    }


}
