package c08_oop;

import java.util.ArrayList;

import c08_oop.Solutions.BankAccount;
import c08_oop.Solutions.Book;
import c08_oop.Solutions.Car;
import c08_oop.Solutions.Dog;
import c08_oop.Solutions.Product;
import c08_oop.Solutions.Rectangle;
import c08_oop.Solutions.Student;
import c08_oop.Solutions.Worker;

public class ClassesExercises{
  public static void main(String[] args){

    /*
    Algunos ejercicios de clases
    en POO
    */

    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    
    var libro = new Book("Franz Kafka", "Metamorfosis");
    libro.MostrarDatos();

    // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    var perro = new Dog();
    perro.bark();

    // 3. Añade un constructor a la clase Book que reciba title y author.

    // 4. Crea una clase Car con atributos brand y model y un método showData().
    var auto = new Car("SUV RAV4","Toyota");
    auto.showData();

    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60)
    var estudiante = new Student(61);
    estudiante.SiAprobo();

    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    var banco = new BankAccount(20);
    banco.deposit();

    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    var rect = new Rectangle(3, 4);
    rect.perímetro();
    rect.área();

    // 8. Crea una clase Worker que reciba nombre y salario y un método para mostrar su salario.
    var trabajador = new Worker("Pedro", 120);
    trabajador.MostrarSalario();

    // 9. Crea varios objetos Person y guardalos en una ArrayList.
    ArrayList<Person> personas = new ArrayList<>();

    var persona1 = new Person("Luis", 19);
    var persona2 = new Person("Alex", 21);
    var persona3 = new Person("Ben", 23);
    var persona4 = new Person("Dennis", 18);

    personas.add(persona1);
    personas.add(persona2);
    personas.add(persona3);
    personas.add(persona4);

    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

    var producto = new Product(55);
    producto.descuento();

    
  }
}
