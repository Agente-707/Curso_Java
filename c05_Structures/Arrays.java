package c05_Structures;

public class Arrays {
    public static void main(String[] args){

        // Declaración y creación

        int[] numbers = new int[3]; // Array de enteros (3 elementos)

        String[] name = {"Luis", "Pareja", "Agente-707"}; // Array de strings (3 cadenas de texto)

        /*
        Nota:
        Cada elemento de un array tiene un indice,
        siendo el '0' el indice del primer elemento
        de un array 
        */

        // Acceso
        System.out.println(numbers[0]); // => 0
        System.out.println(numbers[1]); // => 0
        System.out.println(numbers[2]); // => 0
        // No le hemos asignado un valor a ningun elemento del array 'number'
        // Por lo que todos sus elementos, por defecto, son 0
        
        System.out.println(name[0]); // => Luis
        System.out.println(name[1]); // => Pareja
        System.out.println(name[2]); // => Agente-707
        // System.out.println(name[3]); // => Error: El indice 3 no existe en el array 'name'

        System.out.println((new String[3])[0]); // => null

        /*
        Nota:
        Cuando creamos un array de Strings
        con elementos sin un valor asignado,
        por defecto, sus elementos son 'null'.
        */

        // Modificación
        numbers[0] = 1; // Accedo a numbers en la posición 0 y le asigno un valor
        numbers[1] = 10;
        System.out.println(numbers[0]); // => 1
        System.out.println(numbers[1]); // => 10

        name[2] = "Pepe"; // cambio
        System.out.println(name[2]);
        name[2] = null; // Podemos cambiar el elemento a 'null'
        System.out.println(name[2]);
        System.out.println(name.length);  // => 3 elementos
        // name[2] = null sigue siendo un elemento del array

        /*
        Nota:
        si yo quisiera hacer: numbers[2] = null, esto me daría error
        porque numbers[2] es un entero (tipo de dato primitivo) y null
        solo es compatible con los objetos (ejem: Strings)
        */

        // Array de booleans
        boolean[] booleans = new boolean[5]; // => Tipo de dato primitivo
        System.out.println(booleans[2]); // Valor por defecto de los booleans es 'false'
    }
}
