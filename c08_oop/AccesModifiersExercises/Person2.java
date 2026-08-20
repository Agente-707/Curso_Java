package c08_oop.AccesModifiersExercises;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}
