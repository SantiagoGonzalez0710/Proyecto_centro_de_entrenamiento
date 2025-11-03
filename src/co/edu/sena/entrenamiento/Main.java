package co.edu.sena.entrenamiento;

public class Main {
    public static void main(String[] args) {

        Dish cliente1 = new Dish("Carlos Martínez", 28, "Aumentar masa muscular");
        Dish cliente2 = new Dish("Laura Gómez", 35, "Perder peso");
        Dish cliente3 = new Dish("Andrés Pérez", 22, "Preparación deportiva");
        Dish cliente4 = new Dish("María Rodríguez", 40, "Mantener condición física");
        Dish cliente5 = new Dish("Diego Torres", 30, "Mejorar resistencia cardiovascular");

        System.out.println("=== LISTADO DE CLIENTES DE FITPRO TRAINING ===\n");
        cliente1.showInfo();
        cliente2.showInfo();
        cliente3.showInfo();
        cliente4.showInfo();
        cliente5.showInfo();
    }
}
