package c10_Extras;

import c08_oop.Person;
import c08_oop.Classes;
// import c08_oop.*; => para importar todas las clases de un paquete

public class Extras {
    public static void main(String[] args){

        // Extras

        // null

        String name = "Luis";
        name = null;
        if(name != null){
            System.out.println(name.toLowerCase());
            /*
            Nota:
            Una variable nula no tiene valor,
            usar toLowerCase() con 'name' nos 
            daría error.

            Es en estos casos donde se aplica
            el uso 'try catch' para verificar 
            si una variable es nula.
            */
        }

        
        // import

        new Person("Luis", 19, "1233456");

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

        
        
    }
}
