package by.it.bernouskaya.lesson06;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кличка: " + name+ ". Возраст: " + age;

    }

    boolean win (Dog otherDog){
        double my = 0.2*this.age+0.3*this.weight+0.5*this.power;
        double other=0.2*otherDog.age+0.3*otherDog.weight+0.5*otherDog.power;

                 return my >other;

    }


}