package c08_oop;

public class ClassesExercises{
  public static void main(String[] args){

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

    
  }
}
