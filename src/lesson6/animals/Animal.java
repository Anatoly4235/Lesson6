package lesson6.animals;

public abstract class Animal {

    protected String name;



    public void run(int i) {

        System.out.printf("%s пробежал " + i + " м.\n", name);
    }


    public void swim(int i) {

        System.out.printf("%s проплыл " + i + " м.\n", name);
    }

    public void info() {
        System.out.printf("%s\n", name);
    }

}
