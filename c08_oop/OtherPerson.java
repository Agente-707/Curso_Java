package c08_oop;

public class OtherPerson {
    
    // Atributos
    protected String name; // name protegido
    private int age;
    final private String id; // id privado

    // Constructor
    public OtherPerson(String name, int age, String id){
        this.name = name;
        this.setAge(age); // => Le pasamos la edad desde la función setter
        this.id = id;
    }

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " y mi id es: " + id);
    }

    // Getter
    public String getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    // Setter
    public void setAge(int age){
        // Esta setter revisara si la edad que le pasamos es negativa o no 
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
