package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Animal dog = new Dog("Собака Бобик");
        Animal cat = new Cat("Кот Мурка");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дистанцию бега и дистанцию плавания для животных");

        int distanceRun = scanner.nextInt();
        int distanceSwim = scanner.nextInt();



        if (distanceRun >= 500) {
            System.out.println("Собаки и кошки столько не пробегут");
        } else if (distanceRun > 200 && distanceRun <= 500) {
            dog.run(distanceRun);
            System.out.println("Для кота это много");
        } else if (distanceRun <= 200 && distanceRun > 0) {
            dog.run(distanceRun);
            cat.run(distanceRun);
        }

        if (distanceSwim > 10) {
            System.out.println("Собаки и кошки столько не проплывут");
        } else if (distanceSwim > 0 && distanceSwim <= 10) {
            dog.swim(distanceSwim);
            System.out.println("Коты плавать не умеют");

        }

    }
}
