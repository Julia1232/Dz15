package lesson14.alisheva26_interface;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
