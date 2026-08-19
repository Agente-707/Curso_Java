package c08_test_oop;

import c08_oop.OtherPerson;

public class Classes {
    public static void main(String[] args) {
        
        var person = new OtherPerson("Luis", 19, "123456789A"); // Instanciamos la clase 'Person' con sus parametros

        // Ahora podemos acceder a las propiedades de nuestro objeto desde otro archivo

        person.sayHello();

        //perso.name = "Luis Pareja"; Error: No podemos acceder a 'name' de una clase desde otro paquete
        //System.out.println(perso.name);

        /*
        Nota:
        Como la clase OtherPerson se encuentra en el 
        paquete 'c08_oop' y este nuevo archivo que
        se llama 'Classes' se encuentra en el paquete
        'c08_test_oop' no podemos acceder al elemento
        name el cual está protegido.
        Solo podemos modificarlo desde otro archivo 
        dentro del mismo paquete en el que se encuentra.
        */

    }
}


