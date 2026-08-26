package c09_Exceptions;

public class ThrowExample{
      public static void main(String[] args){
            var age = 15;
            if (age < 18){
                  throw new RunTimeException("Tienes que ser mayor de edad");
                  // => Se lanza un error si no se cumple la condición
            }
      }
}
