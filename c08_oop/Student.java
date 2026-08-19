package c08_oop;

// Ejercicio 5: Solución
public class Student{
    int score;

    public Student(int score){
        this.score=score;
    }

    public void SiAprobo(){
        if(score>=60){
            System.out.println("Aprobo!");
        }else{
            System.out.println("No aprobo :(((");
        }
    }
  
}
