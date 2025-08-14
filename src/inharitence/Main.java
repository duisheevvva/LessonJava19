package inharitence;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sultan");
        person.method();

        Student student = new Student();
        student.method();


        Diary diary = new Diary();
        diary.setName("Nurpazyl");
        diary.setAge(18);
        diary.setPoint(50);
        diary.method();



        Instructor instructor = new Instructor();
        instructor.setName("Nurisa");
        instructor.setAge(18);
        instructor.method();
    }
}
