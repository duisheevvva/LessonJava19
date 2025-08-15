package inharitence;

  class Student extends Person {
     // classtyn ichinde gana korunot
    private  int age;

     public Student() {
     }

     public Student(String name, String email,int age){
         super(name,email);
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
