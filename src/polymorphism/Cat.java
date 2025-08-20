package polymorphism;

public class Cat extends Animal {
    private int age;

    public Cat() {

    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void voice() {
        System.out.println("miau-miau");
    }




    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                "} " + super.toString();
    }
}
