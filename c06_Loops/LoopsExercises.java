package c06_Loops;

import java.util.ArrayList;

public class LoopsExercises{
  public static void main(String[] args){
    /*
    Algunos ejercicios simples
    de bucles
    */

    // 1. Imprime los números del 1 al 10 usando while.
    // Solución:

    int index = 1;

    while(index <= 10){
      System.out.println(index);
      index++;
    }


    // 2. Usa do-while para mostrar todos los valores de un ArrayList.
    // Solución:

    int i=0;
    ArrayList<String> names = new ArrayList<>();
    names.add("Luis");
    names.add("Pareja");
    names.add("Agente-707");

    do{

      System.out.println(names.get(i));
      i++;

    }while(i<names.size());


    // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
    // Solución:

    for(index = 1; index<=50; index++){
      if(index % 5 == 0){
        System.out.println(index);
      }
    }


    // 4. Recorre un Array de 5 números e imprime la suma total.
    // Solución:

    int[] numbers = {4,5,1,23,1,6,43}; 
    int suma=0;

    for(index=0; index<numbers.length; index++){
      suma += numbers[index]; 
    }

    System.out.println(suma);


    // 5. Usa un for para recorrer un Array y mostrar sus valores.
    // Solución:

    for(index=0; index<numbers.length; index++){
      System.out.println(numbers[index]); 
    }
    
  }
}
