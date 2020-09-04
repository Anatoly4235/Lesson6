package lesson5;

public class employee {

    private String name;
    private String position;
    private String mail;
    private String number;
    private int wage;
    public int age;

    public employee(String name, String position, String mail, String number, int wage, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.number = number;
        this.wage = wage;
        this.age = age;
    }

    public void info() {
        System.out.printf("Сотрудник %s, %s, %s, %s, %d, %d\n", name, position, mail, number, wage, age);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя='" + name + '\'' +
                ", позиция ='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", телефон='" + number + '\'' +
                ", зарплата=" + wage +
                ", возраст=" + age +
                '}';
    }

}
