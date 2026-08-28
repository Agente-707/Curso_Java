package c10_Extras;

public class Extras {
    public static void main(String[] args){

        // Extras

        // null

        String name = "Luis";
        name = null;
        if(name != null){
            System.out.println(name.toLowerCase());
            /*
            Nota:
            Una variable nula no tiene valor,
            usar toLowerCase() con 'name' nos 
            daría error.

            Es en estos casos donde se aplica
            el uso 'try catch' para verificar 
            si una variable es nula.
            */
        }
        
    }
}
