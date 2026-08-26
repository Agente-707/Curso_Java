package c09_Exceptions;

public class ThrowExample{

      public void checkAge(int age){
            if (age < 18){
                  throw new IllegalArgumentException("Tienes que ser mayor de edad");
                  /*
                  Podemos lanzar un error del tipo
                  correspondiente si es que la 
                  condición no se cumple
                  */
            }else{
                  System.out.println("Es mayor de edad");
            }
      }

      public void checkScore(int score) throws CustomException{
            if(score<0 || score>100){
                  throw new CustomException("La puntuación debe estar entre 0 y 100"); // Lanzamos la excepción personalizada
            }else{
                  System.out.println("Puntuación válida: " + score);
            }
      }

      
}
