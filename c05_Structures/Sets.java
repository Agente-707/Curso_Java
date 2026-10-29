package c05_Structures;

import java.util.Set;
import java.util.HashSet;

public class Sets{
    public static void main(String[] args) {

		/*
		Los sets son colecciones cuyos elementos
		no tienen un orden por índice (no podemos 
		acceder ni modificar sus elementos), tampoco
		se permiten elementos duplicados en los sets.
		*/

		// Declaración de un set
		Set<String> names = new HashSet<>();
		var numbers = new HashSet<Integer>(); // Los sets se declaran de forma similar a los ArrayList


		// Tamaño 'size'
		System.out.println(names.size()); // => 0
		// No le añadimos ningún elemento

		// Añadir elementos 'add'
		names.add("Luis");
		names.add("Juan");
		names.add("Agente-707");
		System.out.println(names.size()); // => Le añadimos 3 elementos

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3); // => Elementos duplicados se ignoran

		System.out.println(numbers);

		// Buscar elementos 'contains'
		System.out.println(names.contains("Agente-707")); // => true
		System.out.println(names.contains("Holaaaa"));    // => false

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
      
    }
}