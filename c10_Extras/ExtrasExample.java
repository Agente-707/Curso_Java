package c10_Extras;

public class ExtrasExample{
     public static void main(String[] args){

          /*
          Podemos acceder a test() el cual es
          un método estatico
          */

          Extras.test();
          System.out.println(Extras.globalName); // Llamamos a globalName
     }
}
