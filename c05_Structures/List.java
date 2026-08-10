package c05_Structures;

import java.util.ArrayList; // Agregamos esta línea para poder trabajar con ArrayList

public class List {
    public static void main(String[] args){
        /*
        El ArrayList, a diferencia del Array común, 
        es de tipo dinámico, podemos inicializarlos
        sin definir cuantos elementos va a tener y 
        podemos agregarle tantos elementos como 
        queramos (Siempre y cuando sean del mismo
        de variable).  
        */

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();  // nombre del ArrayList: 'names' => ArrayList de strings
        /*
        Se define por defecto que tipo de datos
        se va a almacenar en el ArrayList 'ArrayList<String>' 
        */

        var numbers = new ArrayList<Integer>();  // nombre del ArrayList: 'numbers' => ArrayList de enteros
        // Tenemos que definir la clase Integer 
        // Integer es el equivalente del dato primitivo 'int' a objeto.
        // Para este caso no marcamos el tipo de dato por defecto (tipo var)
        // Por lo que se marca el tipo de dato en el segundo bloque 'new ArrayList<Integer>()'
        // En el primer caso (names) lo habíamos marcado en el primer bloque 'ArrayList<String> names' por lo que ya no era necesario marcarlo en el segundo bloque

        // Tamaño

        System.out.println(names.size()); // => 0
        // No le hemos inicializado ningun tamaño
        // No tienen ningun dato
        // tamaño '0'


        // Añadir elementos

        // names[0] = "Luis" => Error: no podemos acceder a un indice de un ArrayList y darle un valor
        // La forma correcta de añadir elementos es con la palabra reservada 'add'
        names.add("Luis");
        names.add("Pareja");
        names.add("Agente-707"); 
        // Ahora hay 3 elementos en 'names'
        System.out.println(names.size()); // => 3


        // Acceder a los elementos

        // System.out.println(names[0]); => error: No podemos acceder a los elementos de un ArrayList de esta forma (solo es posible con Arrays)
        // La forma correcta es usando 'get'
        System.out.println(names.getFirst()); // Accede al primer elemento => "Luis"
        System.out.println(names.get(1)); //accede al segundo valor (indice 1) => "Pareja"
        System.out.println(names.getLast());  // Accede al ultimo elemento => "Agente-707"

        /*
        Nota: Los elementos de los ArrayLists 
        también están ordenados por índices, podemos
        acceder a ellos con 'nombre_del_ArrayList.get(ind)',
        siendo el primer índice '0' y el último 'su tamaño - 1'
        */


        // Modificar los elementos 'set'
        names.set(2, "XxLuisxX"); 
        /*Primero le especificamos el índice del
        elemento a modificar y despues le pasamos 
        la modificación que le queremos hacer */ 
        System.out.println(names.get(2));


        // Eliminar elementos 'remove'
        names.remove(2); // Eliminamos el elemento del índice 2
        // System.out.println(names.get(2)); => Error: El elemento del índice 2 ya no existe
        // Ahora solo hay 2 elementos en 'names'
        System.out.println(names.size()); // => 2

        
        // Buscar elementos 'contain'
        
        names.contain("Luis");    // "Luis" pertenece a en 'names' => true 
        names.contain("XxLuisxX") // "XxLuisxX" ya no pertenece a 'names'=> false

            
        // Limpiar ArrayList 'clear'
            
        names.clear(); // Elimina todos los elementos del ArrayList
        System.out.println(names.size()); // => 0

    }
}
