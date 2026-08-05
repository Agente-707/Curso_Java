package c01_variablesandConstants;
public class VariablesandConstants{
    public static void main(String[] args){

        // Variables

        String name = "Luis";
        System.out.println(name);

        //name = 19: Error (No podemos cambiar el tipo de dato de una variable)

        name = "Agente-707";
        System.out.println(name);

        int age = 19;
        System.out.println(age);

        float height = 1.75f; // la f al final indica que es un float
        System.out.println(height);

        double weigth = 70.5; 
        System.out.println(weigth);

        System.out.println("Mi nombre es " + name + ", tengo " + age + " años, mido " + height + " metros y peso " + weigth + " kg.");

        // var infiere el tipo de dato de la variable

        var email = "lupareja2505@gmail.com"; 
        System.out.println(email);

        var year = 2026;
        System.out.println(year);

        // Constants

        final String EMAIL = "lupareja2505@gmail.com";
        //EMAIL = "Agente-707@gmail.com"; Es constante, ya no puede cambiar su valor
        System.out.println(EMAIL);

        
    }
}