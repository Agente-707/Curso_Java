package c09_Exceptions;

public class CustomException extends Exception{

      public CustomException(String message){
            super(message); // 'super' nos permite lanzar cualquier mensaje para nuestro excepción personalizada
      }
}
