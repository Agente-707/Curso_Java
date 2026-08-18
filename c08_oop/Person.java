package c08_oop;

/*
Nota:
En Java, si queremos declarar una clase
debemos crear una archivo el cual contenga
unicamente a dicha clase.

Dentro de este archivo es donde vamos a
trabajar con la clase 'Person'.
*/

// Clase Person
public class Person {
    
    // Atributos
    String name;
    int age;

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
}
