package c10_Extras;

import c08_oop.Person;
import c08_oop.Classes;
// import c08_oop.*; => para importar todas las clases de un paquete

import java.util.Scanner; // Importamos el recurso de Scanner

public class Extras {

    static String globalName = "Agente-707"; // Variable global estatica, se define fuera del main
    
    
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


        // Scope: variables globales y locales

        /*
        Nota:
        Las variables declaradas dentro
        de un método (name, age, etc) se les
        conoce como variables locales, y las
        que son declaradas fuera pero dentro 
        de la clase (en este caso de la clase
        Extras) se les conoce como variable 
        globales
        */

        test(); // => Llamamos a la función


        // static

        /*
        Cuando definimos una variable
        o un método como estatico, podemos
        acceder a ella sin instanciarla
        (osea sin hacer var prueba = test();), 
        así como ya vimos con 'globalName' que
        podemos acceder a ella desde otro método
        sin tener que declararla dentro de test().
        */
        
    }

    public static void test(){
        System.out.println(globalName); // La función estatica 'test' puede acceder a la varaiable global 'globalName'
    }
}
