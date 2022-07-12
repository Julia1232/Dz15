package lesson14.alisheva26_interface;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
