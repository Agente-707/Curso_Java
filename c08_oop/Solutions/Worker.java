package c08_oop.Solutions;

// Ejercicio 8: Solución
public class Worker{
    String nombre;
    double salario;

    public Worker(String nombre,int salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public void MostrarSalario(){
        System.out.println("Trabajador: " + nombre);
        System.out.println("Saldo: " + salario);
    }
  
}
