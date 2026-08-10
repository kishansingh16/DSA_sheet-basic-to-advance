package Lec_1;

class Student{
    String name;
}

public class Prog_Obj {
    public static void main(String[] args){
        Student [] students=new Student[2];

        students[0] =new Student();
        students[0].name="kishan";

        students[1]=new Student();
        students[1].name="Mukund";

        System.out.println(students[1].name);
        System.out.println(students[0].name);
    }
}
