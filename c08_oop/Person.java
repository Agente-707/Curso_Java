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

    // Constructor
    public Person(String name, int age){ // con parametros
        // Establecemos que el valor de los atributos es igual al de los parametros del constructor
        this.name = name;
        this.age = age;
        /*
        Nota:
        Los atributos y los parametros del
        constructor no necesariamente deben 
        tener el mismo nombre

        this.name (nombre del atributo) = name (nombre del parametro)
        this.age (nombre del atributo) = age (nombre del parametro)
        */
    }

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }

    /*
    Nota:
    Si el constructor no recibiera ningun
    parametro - public Person(){} tendriamos
    que asignarle los valores de sus parametros
    (name y age) por medio de llamada de puntos
    desde el archivo Classes
    - person.name = "Luis"
    - person.age = 19
    */
}
