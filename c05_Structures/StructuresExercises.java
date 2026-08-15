package c05_Structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class StructuresExercises{
  public static void main(String[] args){

    /*
    Algunos ejercicios simples de
    las cuatro tipos estructuras 
    para practicar
    */

    // 1. Crea un Array de 5 elementos e imprime su longitud.
    // Solución:

    int[] MyElements = {1,2,3,4,5};

    System.out.println(MyElements.length);


    // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y despues de modificarlo.
    // Solución:

    System.out.println(MyElements[3]); // Antes de modificarlo

    MyElements[3] = 10;

    System.out.println(MyElements[3]); // Despues de modificarlo
    

    // 3. Crea un ArrayList vacía.
    // Solución:

    var MyArrayList = new ArrayList<Integer>();

    System.out.println(MyArrayList.size()); // => 0


    // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
    // Solución:

    MyArrayList.add(17);
    MyArrayList.add(201);
    MyArrayList.add(11);
    MyArrayList.add(13);

    System.out.println(MyArrayList);

    MyArrayList.remove(0);

    System.out.println(MyArrayList);


    // 5. Crea un HashSet con 2 valores diferentes.
    // Solución:

    HashSet<String> names = new HashSet<>();

    names.add("Pedro");
    names.add("Andres");


    // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
    // Solución:

    names.add("Pedro"); // Repetido
    names.add("Anderson"); // Sin repetir
    System.out.println(names);


    // 7. Elimina uno de los elementos del HashSet.
    // Solución:

    names.remove("Andres");
    System.out.println(names);


    // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
    // Solución:

    HashMap<String, Integer> numeros = new HashMap<>();

    numeros.put("Pedro", 123456789);
    numeros.put("Anderson", 231432315);
    numeros.put("Andres",123924591);
    System.out.println(numeros);


    // 9. Modifica uno de los contactos y elimina otro.
    // Solución:

    numeros.put("Pedro", 124920532);
    numeros.remove("Anderson");
    System.out.println(numeros);


    // 10. Dado un Array, transfórmalo a un ArrayList, a continuación en un HashSet, y finalmente en un HashMap con clave y valor iguales.
    //solución:

    int[] MyNumbers = {12, 15, 10, 9, 12, 20}; 

    // de Array a ArrayList
    ArrayList<Integer> MyNumberList = new ArrayList<>();

    for(int i : MyNumbers){
      MyNumberList.add(i);
    }

    System.out.println(MyNumberList);

    // de ArrayList a HashSet
    HashSet<Integer> MyNumberSet = new HashSet<>(MyNumberList);
    System.out.println(MyNumberSet);

    // de HashSet a HashMap
    HashMap<Integer, Integer> MyNumberMap = new HashMap<>();
    for(int i: MyNumberSet){
      MyNumberMap.put(i, i);
    }
    System.out.println(MyNumberMap);

  }
}
