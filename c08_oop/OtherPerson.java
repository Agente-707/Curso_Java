package c08_oop;

public class OtherPerson {
    
    // Atributos
    protected String name; // name protegido
    int age;
    final private String id; // id privado

    // Constructor
    public OtherPerson(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " y mi id es: " + id);
    }
}
