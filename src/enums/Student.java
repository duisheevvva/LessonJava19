package enums;

public class Student {
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private StudyFormat studyFormat;


    public Student() {
    }

    public Student(String name, String email, int age, Gender gender, StudyFormat studyFormat) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.studyFormat = studyFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudyFormat getStudyFormat() {
        return studyFormat;
    }

    public void setStudyFormat(StudyFormat studyFormat) {
        this.studyFormat = studyFormat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studyFormat=" + studyFormat +
                '}';
    }
}
