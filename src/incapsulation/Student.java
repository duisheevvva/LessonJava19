package incapsulation;

public class Student {
    // pole
    private String firstName ;
    private String surname;
    private int age;
    private String [] courses;

    // getter return
    public String getName (){
        return firstName;
    }

    public String getSurname(){
        return surname;
    }

    public String [] getCourses(){
        return courses;
    }

    public int getAge(){
        return age;
    }


    // setter void
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setCourses(String [] courses){
        this.courses = courses;
    }

}
