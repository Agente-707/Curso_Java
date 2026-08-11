package c05_Structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        /*Los Sets, a diferencia de los ArrayList, no tienen
        un orden para sus elementos determinado por índices.
        Por lo que no podemos acceder a ellos ni modificarlos.*/

        // Declaración y creación
        HashSet<String> names = new HashSet<>(); // Structura asociada a los sets: 'HashSet'
        var numbers = new HashSet<Integer>();    // Tiene la misma forma de declaración que el ArrayList

        // Tamaño

        System.out.println(names.size()); // => 0
        // No le añadimos ningún elemento


        // Añadir elementos

        names.add("Luis");
        names.add("Pareja");
        names.add("Agente-707"); // Le añadimos 3 elementos
        System.out.println(names.size()); // => 3


        // Acceder a los elementos

        System.out.println(names); // => Imprimimos el set
        /*
        Los elementos no siguen el mismo orden
        en el que los hemos añadido.

        Si intentamos acceder a ellos mediante
        'System.out.println(names.get(ind));'
        nos saltara un error.

        Lo mismo si intentamos modificarlos con
        'names.set(ind, "elemento")'
        */

        


    }
}
