package c05_Structures;

import java.util.ArrayList;
import java.util.HashSet;

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

    HashSet<String> names = new HashSet<>();

    names.add("Pedro");
    names.add("Andres");
    
    
  }
}
