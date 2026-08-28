package c10_Extras;

import c08_oop.Person;
import c08_oop.Classes;
// import c08_oop.*; => para importar todas las clases de un paquete

import java.util.Scanner; // Importamos el recurso de Scanner

public class Extras {
    public static void main(String[] args){

        // Extras

        // null

        String name = "Luis";
        name = null;
        if(name != null){
            System.out.println(name.toLowerCase());
        }

        /*
        Nota:
        Una variable nula no tiene valor,
        usar toLowerCase() con 'name' nos 
        daría error.

        Es en estos casos donde se aplica
        el uso 'try catch' para verificar 
        si una variable es nula.
        */

        
        // import

        new Person("Luis", 19);

        /*
        Nota:
        Nosotros cuando queremos usar una
        clase dentro de un paquete externo
        a esta misma, es necesario importar
        el paquete junto con el nombre de la
        clase, en este caso: 'import c08_oop.Person'
        para poder hacer uso de la clase 'Person'
        fuera de otro paquete.
        */

        new Classes(); // Si queremos importar muchas clases provenientes de un mismo paquete podemos usar 'import c08_oop.*' (para este caso)

        
        // Scanner

        /*
        Con el Scanner podemos solicitar 
        datos al usuario por consola.
        */

        var scanner = new Scanner(System.in); // Definimos el Scanner

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt(); // => Introduce un entero


        System.out.println("Mi edad es: " + age);
        
    }
}
