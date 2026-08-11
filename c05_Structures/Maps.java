package c05_Structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>(); // Estructura de los maps HashMap<clave: String, valor: String> 
        var numbers = new HashMap<Integer, String>();   // new HashMap<clave: Integer, valor: String>()


        // Tamaño

        System.out.println(names.size()); // => 0
        // No le hemos añadido ningún elemento


        // Añadir elementos 'put'
        // Para añadir nuevos elementos al map con 'put'
        names.put("Luis", "luis@gmail.com"); // llave: "Luis", valor: "luis@gmail.com" 
        names.put("Pareja", "pareja@gmail.com");
        names.put("Agente-707", "Agente-707@gmail.com");
        // Le hemos añadido 3 elementos al map
        System.out.println(names.size()); // => 3
        System.out.println(names); // cada elemento del map tiene una llave y un valor

        /*
          Nota:
          Al igual que con los sets, los
          elementos de un map no tienen
          un orden definido por índices.
          Pero sí podemos acceder a sus 
          elementos.
        */


        // Acceder a los elementos 'get'
        // Podemos acceder a los elementos de un map usando 'get(llave)'
        // No tenemos índices, pero podemos acceder a los elementos por medio de las llaves

        System.out.println(names.get("Luis")); // => "luis@gmail.com" - me devuelve el valor
        System.out.println(names.get("holaaaa")); // => null - esa llave no existe en 'names'


        // Verificar elementos 'containsKey'
        // Existe la llave => true
        // No existe la llave => false

        System.out.println(names.containsKey("Luis")); // => true
        System.out.println(names.containsKey("holaaaa")); // => false


    }
}
