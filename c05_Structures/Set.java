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

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        
        // Acceder a los elementos y modificarlos

        System.out.println(names); // => Imprimimos el set
        /*
        Los elementos no siguen el mismo orden
        en el que los hemos añadido.

        Si intentamos acceder a ellos mediante
        'System.out.println(names.get(ind));'
        nos saltara un error.

        Lo mismo si intentamos modificarlos con
        'names.set(ind, "elemento")'
        nos saltara un error.
        */


        // Buscar elementos

        System.out.println(names.contains("Agente-707")); // => true
        System.out.println(names.contains("Holaaaa"));    // => false
        // Sí es posible buscar elementos en un set


        // Añadir elementos repetidos

        System.out.println(names); // Imprime tres elementos
        names.add("Luis");
        names.add("Luis");
        names.add("Luis");
        names.add("Luis");
        names.add("Luis"); // Añado 5 veces mi nombre
        System.out.println(names); // El set sigue igual (solo tiene 3 elementos)

        /*
          Nota:
          A diferencia de los ArrayList,
          no podemos agregar elementos repetidos
          a los sets, no nos saltara error, solo 
          los elementos que repitamos no se van a 
          agregar dentro del set
        */


        // Conjuntos 'addAll', 'removeAll' y 'retainAll'

        // names.addAll(numbers); Error: No podemos añadir elementos de un set a otro si no son compatibles (string - integer)
        // addAll toma todos los elementos de un set y los pasa a otro siempre y cuando los elementos sean del mismo tipo 
        var countries = new HashSet<String>(); // set de strings (nombres de paises)
        countries.add("Perú");
        countries.add("Argentina");
        countries.add("Brasil");
        countries.add("Colombia");

        names.addAll(countries); // 'names y 'countries' son sets de strings (son compatibles)
        System.out.println(names); // => los nombres y los paises ahora estan dentro del set 'names'

        names.removeAll(countries); // con 'removeAll' podemos quitar los elementos del set 'countries' de 'names'
        System.out.println(names); // => Ahora solo quedaron los nombres (los paises fueron removidos)

        names.retainAll(countries); // con 'retainAll' podemos eliminar los elementos comunes del set y quedarnos con los nuevos
        System.out.println(names); // => []
        /*
          Nota:
          En este caso, como hemos eliminado los elementos 
          de 'countries' del set 'names' con 'removeAll' 
          solo quedaron sus elementos comunes "Luis", 
          "Pareja" y "Agente-707". Entonces si hacemos 
          retainAll estos elementos se eliminaran y quedarían
          solo los de countries, los cuales fueron eliminados
          anteriormente, por lo tanto el set 'names' quedara vacío.
        */

        // Volvamos a añadir todos lo elementos de 'countries' a 'names' para ver mejor como funciona 'retainAll'
        
        names.add("Luis");
        names.add("Pareja");
        names.add("Agente-707");
        names.addAll(countries);
        System.out.println(names); // 'names' vuelve a tener todos sus elementos

        names.retainAll(countries); // Aplicamos retainAll
        System.out.println(names); // => Los elementos comunes de 'names' son eliminados y quedan solo los de 'countries'

            

        


        




    }
}
