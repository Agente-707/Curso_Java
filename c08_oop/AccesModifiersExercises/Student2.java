package c08_oop.AccesModifiersExercises;

public class Student2 {
    private int grade;

    public Student2(int grade){
        this.grade = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public boolean isPassed(){
        if(grade>=60){
            return true;
        }else{
            return false;
        }
    }
}
