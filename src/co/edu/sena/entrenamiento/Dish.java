package co.edu.sena.entrenamiento;

public class Dish{

    String name;
    int age;
    String fitnessGoal;

    public Dish(String name, int age, String fitnessGoal) {
        this.name = name;
        this.age = age;
        this.fitnessGoal = fitnessGoal;
    }

    public void showInfo() {
        System.out.println("Cliente: " + name);
        System.out.println("Edad: " + age + " años");
        System.out.println("Objetivo: " + fitnessGoal);
        System.out.println("---------------------------------");
    }
}


